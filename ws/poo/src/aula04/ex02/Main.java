package aula04.ex02;

public class Main {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		Funcionario Gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		Vendedor vendedor2 = (Vendedor) new Funcionario();
	}
}
