package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		System.out.println("Crie conjunto e adicione as sete notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 está no conjunto? " + notas.contains(5d));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
//		for (Double nota : notas) {
//		soma += nota;
//	}
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7 ) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Exiba as notas na ordem em que foram informados: ");
		Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas2);
		
		System.out.println("Exiba as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague toda o conjunto: ");
		notas.clear();
		
		System.out.println("Confira se o conjunto está vazia: " + notas.isEmpty());
		System.out.println("Confira se o conjunto 2 está vazia: " + notas2.isEmpty());
		System.out.println("Confira se o conjunto 3 está vazia: " + notas3.isEmpty());
		
	}
}
