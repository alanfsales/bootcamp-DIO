package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
	public static void main(String[] args) {
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
//		System.out.println("Imprima todos os elementos dessa lista de String: ");
//		numerosAleatorios.stream().forEach(s -> System.out.println(s));
//		numerosAleatorios.forEach(s -> System.out.println(s));
//		numerosAleatorios.forEach(System.out::println);
		
//		 System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
//		 Set<String > collectSet = numerosAleatorios.stream()
//			 	.limit(5)
//			 	.collect(Collectors.toSet());
		 
//		 System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
////		 numerosAleatorios.stream().map(s -> Integer.parseInt(s));
		 List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt)
		 		.collect(Collectors.toList());
		 
//		 System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
//		 List<Integer> listParesMaiorQue2 = numerosAleatorios.stream().map(Integer::parseInt)
//		 		.filter(i -> i % 2 == 0 && i > 2)
//		 		.collect(Collectors.toList());
//		 System.out.println(listParesMaiorQue2);
		 
//		 System.out.println("Mostre a média dos números: ");
//		 numerosAleatorios.stream().mapToInt(Integer::parseInt)
//		 		.average()
//		 		.ifPresent(System.out::println);
		 
		 System.out.println("Remova os valores ímpares: ");
		 numerosAleatoriosInteger.removeIf(i -> i % 2 != 0);
		 System.out.println(numerosAleatoriosInteger);
	}
}
