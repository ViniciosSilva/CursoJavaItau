import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double km, lt;

		System.out.println("Informe a distância percorrida: ");
		km = entrada.nextDouble();

		System.out.println("Informe a quantidade de combustível em lt: ");
		lt = entrada.nextDouble();
		
 		System.out.printf("Consumo médio %.2f", km/lt);

	}
}
