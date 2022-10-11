package edu.alan.operadoes;

public class operadores {

	public static void main(String[] args) {
		operadorLogico();
	}
	
	public static void concatenarString() {
		String nomeCompleto = "Linguagem" + "Java";
		System.out.println(nomeCompleto);
	}
	
	public static void concatenarStringENumero() {
		String concatenacao = "?";
		
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+1;
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+"1";
		System.out.println(concatenacao);
		
		concatenacao = "1"+1+1+1;
		System.out.println(concatenacao);
		
		concatenacao = "1"+(1+1+1);
		System.out.println(concatenacao);
	}
	
	public static void inverterValorNumerico() {
		int numero = 5;
		numero = - numero;
		System.out.println(numero);
		
		numero = numero * -1;
		System.out.println(numero);
	}
	
	public static void incremetar() {
		int numero = 5;
		
		System.out.println(++numero);
		
		System.out.println(--numero);
	}
	
	public static void inverterValorLogico() {
		boolean variavel = true;
		
		System.out.println(!variavel);
		System.out.println(variavel);
		
		variavel = !variavel;
		
		System.out.println(variavel);
	}
	
	public static void operadorTernarioIf() {
		int a,b;
		String resultado = "";
		
		a = 5;
		b = 6;
		
		if(a == b)
			resultado = "Veradeiro";
		else
			resultado = "Falso";
		
		System.out.println(resultado);
	}
	
	public static void operadorTernario() {
		int a,b;
		String resultado = "";
		
		a = 6;
		b = 6;
		
		resultado = a==b ? "Verdadeiro" : "False";
		
		System.out.println(resultado);
	}
	
	public static void compararNumero() {
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		System.out.println("Numero 1 é igual de Numero2? " + simNao);
		
		simNao = numero1 != numero2;
		System.out.println("Numero 1 é difernte de Numero2? " + simNao);
		
		simNao = numero1 > numero2;
		System.out.println("Numero 1 é maior de Numero2? " + simNao);
		
		simNao = numero1 < numero2;
		System.out.println("Numero 1 é menor de Numero2? " + simNao);
	}
	
	public static void compararTexto() {
		String nomeUm = "Alan";
		String nomeDois = new String("Alan");
		
		System.out.println(nomeUm.equals(nomeDois));
	}
	
	public static void operadorLogico() {
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if(condicao1 && condicao2) {
			System.out.println("As duas condiçoes são verdadeiras");
		}
		if(condicao1 || condicao2) {
			System.out.println("Uma das condições são verdadeiras");
		}
	}
	
}
