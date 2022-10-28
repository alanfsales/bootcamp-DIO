package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;

	@GetMapping
	public List<Usuario> getUser(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Usuario getOne(@PathVariable("id") Integer id) {
		return repository.finById(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.remove(id);
	}
	
	@PostMapping
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
	
	@PutMapping
	public void putUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
}
