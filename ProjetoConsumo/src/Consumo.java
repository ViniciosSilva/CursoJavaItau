import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double km, lt;

		System.out.println("Informe a dist�ncia percorrida: ");
		km = entrada.nextDouble();

		System.out.println("Informe a quantidade de combust�vel em lt: ");
		lt = entrada.nextDouble();
		
 		System.out.printf("Consumo m�dio %.2f", km/lt);

	}
}
