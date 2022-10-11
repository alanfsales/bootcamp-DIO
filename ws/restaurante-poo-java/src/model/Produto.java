package model;

import java.math.BigDecimal;

public class Produto {

	private Long id;
	private String nome;
	private Boolean disponivel;
	private BigDecimal valorUnitario;
	private Restaurante restaurante;
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", disponivel=" + disponivel + ", valorUnitario="
				+ valorUnitario + ", restaurante=" + restaurante + "]";
	}
}
