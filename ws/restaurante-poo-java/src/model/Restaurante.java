package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

	private Long id;
	private String nome;
	private String cnpj;
	private List<Produto> catalogo = new ArrayList<>();
	private Endereco endereco;
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Restaurante [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", catalogo=" + catalogo + ", endereco="
				+ endereco + "]";
	}
}
