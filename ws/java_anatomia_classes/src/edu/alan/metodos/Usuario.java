package edu.alan.metodos;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		
		smartTv.mudarCanal(13);

		System.out.println("Tv ligada ? " + smartTv.ligada);
		System.out.println("Canal ?: " + smartTv.canal);
		System.out.println("Volume ?: " + smartTv.volume);
		System.out.println("------------------------------");
		
		smartTv.ligar();
		
		System.out.println("Novo status : Tv ligada ? " + smartTv.ligada);
	}

}
