package dio.gof.service;

import java.util.List;

import dio.gof.model.Cliente;

public interface ClienteService {

	List<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	Cliente inserir(Cliente cliente);

	Cliente atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}