package edu.alan.sintaxe;

public class MinhaClasse {

	public static void main(String[] args) {
		String primeiroNome = "Alan";
		String segundoome = "Sales";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoome);
		
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
