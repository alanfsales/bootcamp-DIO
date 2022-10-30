package dio.gof.strategy;

public class ComportamentoDefencivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se defencifamente...");
	}
}
