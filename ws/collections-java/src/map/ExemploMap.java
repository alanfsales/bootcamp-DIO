package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
	public static void main(String[] args) {
		System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumo: ");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares);
		
		System.out.println("Substitua o consumo do gol por 15.2 km/l: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("Confira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));
		System.out.println("Confira se o modelo uno está no dicionario: " + carrosPopulares.containsKey("uno"));
		
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
		
		System.out.println("Exiba os modelos: " );
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos dos carros: " );
		Collection<Double> consumo = carrosPopulares.values();
		System.out.println(consumo);
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: " );
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficeinte = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficeinte = entry.getKey();
				System.out.println("Modelo Mais Eficiene: " + modeloMaisEficeinte + " - " + consumoMaisEficiente);
			}
		}
		
		System.out.println("Exiba o modelo menos econômico e seu consumo: " );
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficeinte = "";
		
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if(entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficeinte = entry.getKey();
				System.out.println("Modelo Menos Eficiene: " + modeloMenosEficeinte + " - " + consumoMenosEficiente);
			}
		}
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Exiba a soma dos consumos: " + soma);
		
		System.out.println("Exiba a média dos consumos: " + (soma/carrosPopulares.size()));
		
		System.out.println("Remova os modelos com consumo igual a 15.6 km/l: ");
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while (iterator1.hasNext()) {
			if (iterator1.next() == 15.6) iterator1.remove();
		}
		System.out.println(carrosPopulares);
		
		System.out.println("Exiba todos os carros na ordem em que foram informados: ");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares1);
		
		System.out.println("Exiba o dicionario ordenado pelo modelo: ");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);
		
		System.out.println("Apague o dicionario de carros: ");
		carrosPopulares.clear();
		System.out.println("Confira se o dicionario está vazio: " + carrosPopulares.isEmpty());
	}
}
