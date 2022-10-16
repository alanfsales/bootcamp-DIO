package aula04.ex05;

public class Calculadora implements OperacaoMatematica{

	@Override
	public void somar(double op1, double op2) {
		System.out.println("Soma: " + (op1 + op2));
	}

	@Override
	public void subtracao(double op1, double op2) {
		System.out.println("Subtração: " + (op1 - op2));
	}

	@Override
	public void multiplicao(double op1, double op2) {
		System.out.println("Multiplicação: " + (op1 * op2));
	}

	@Override
	public void divisao(double op1, double op2) {
		System.out.println("Divisão: " + (op1 / op2));
	}

}
