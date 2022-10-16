package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
	public static void main(String[] args) {
		System.out.println("--\tOrdem Aleatória\t--");
		Set<Serie> minhasSeries = new HashSet<>(){{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comedia", 25));
		}};
		
		for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem Inserçãp\t--");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comedia", 25));
		}};
		
		for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
			
		System.out.println("--\tOrdem Natural (Tempo Episodio)\t--");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		
		for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComaparatorNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		
		for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " 
				+ serie.getGenero() + " - " + serie.getTempoEpisodio());
	}
}

class ComaparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
}

