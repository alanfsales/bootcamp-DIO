import java.util.Scanner;

public class DesafioPalindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();

		String invertida = new StringBuffer(palavra).reverse().toString();
		
		if (palavra.equals(invertida))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

		sc.close();
	}

}
