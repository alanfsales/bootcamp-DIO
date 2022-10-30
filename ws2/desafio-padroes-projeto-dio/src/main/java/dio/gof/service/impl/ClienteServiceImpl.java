package dio.gof.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.gof.exception.CepNaoEncontradoException;
import dio.gof.exception.ClienteNaoEncontradoException;
import dio.gof.model.Cliente;
import dio.gof.model.ClienteRepository;
import dio.gof.model.Endereco;
import dio.gof.model.EnderecoRepository;
import dio.gof.service.ClienteService;
import dio.gof.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ViaCepService viaCepService;
	
	@Override
	public List<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(() ->  new ClienteNaoEncontradoException("Cliente de id "+ id +" não encontrado"));
	}
	

	@Override
	public Cliente inserir(Cliente cliente) {
		return salvarClienteComCep(cliente);
	}

	@Override
	public Cliente atualizar(Long id, Cliente cliente) {
		buscarPorId(id);
		cliente.setId(id);
		return salvarClienteComCep(cliente);
	}

	@Override
	public void deletar(Long id) {
		buscarPorId(id); 
		clienteRepository.deleteById(id);
	}

	private Cliente salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = buscaEnderecoPorCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		
		return clienteRepository.save(cliente);
	}
	
	private Endereco buscaEnderecoPorCep(String cep) {
		Endereco endereco = null;
		try {
			endereco = viaCepService.consultarCep(cep);
			return endereco;
		} catch (Exception e) {
			throw new CepNaoEncontradoException("Não conseguiu encontrar o CEP: " + cep);
		}
	}

}