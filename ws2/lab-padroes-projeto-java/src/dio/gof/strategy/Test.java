package dio.gof.strategy;

public class Test {

	public static void main(String[] args) {
		
		//Teste relacionado ao Design Pattern Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defencivo = new ComportamentoDefencivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defencivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
	}

}
