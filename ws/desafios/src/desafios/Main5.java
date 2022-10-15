package desafios;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
		int N = number.nextInt();
		number.close();
		
        int i;
        for(i = 0; i < elementos.length; i++){
          if(elementos[i] == N) {
        	  System.out.println("Achei " + N + " na posicao " + i);
        	  break;
          }
        }
        
        if(i == elementos.length) {
          	System.out.println("Numero "+ N +" nao encontrado!");
        }
    }
}
