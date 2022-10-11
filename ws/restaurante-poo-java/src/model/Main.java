package model;

public class Main {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("123456", "End da cami");
		Restaurante restaurante = new Restaurante();
		restaurante.setId(1L);
		restaurante.setNome("Restaurante da Cami");
		restaurante.setCnpj("000000000/0000");
		restaurante.setEndereco(endereco);
		System.out.println(restaurante);
		
		Endereco endereco2 = new Endereco("9999999", "End da fulana");
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setId(2L);
		restaurante2.setNome("Restaurante da fuana");
		restaurante2.setCnpj("000000000/99999");
		restaurante2.setEndereco(endereco2);
		System.out.println(restaurante2);
	}

}
