package aula3;

public class Main2 {
	public static void main(String[] args) {

		System.out.println("Quadrilareto");
		double areaQuadrado = Quadrilatero2.area(3);
		System.out.println("Area do quadrado: " + areaQuadrado);
		
		double areaRetangolo = Quadrilatero2.area(5d,5d);
		System.out.println("Area do retangalo: " + areaRetangolo);
		
		double areaTrapezio = Quadrilatero2.area(7,8,9);
		System.out.println("Area do trapezio: " + areaTrapezio);
		
		double areaLozango = Quadrilatero2.area(5f,5f);
		System.out.println("Area do lozango: " + areaLozango);
	}
}
