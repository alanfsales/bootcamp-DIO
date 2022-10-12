package loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int numero;
		int quantPares = 0;
		int quantImpares = 0;
		
		System.out.println("Quantidades de numero: ");
		quantidadeNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("Numerio: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			count++;
		}while(count < quantidadeNumeros);
		
		System.out.println("Pares: " + quantPares);
		System.out.println("Impar: " + quantImpares);
		
		scan.close();
	}

}
