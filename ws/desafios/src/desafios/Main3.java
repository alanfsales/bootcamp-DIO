package desafios;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);

        int N = numero.nextInt();
        
        int soma = somatorio(N);
        
        System.out.println(soma);
        numero.close();
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
    
}
