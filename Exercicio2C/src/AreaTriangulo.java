import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a base do tri�ngulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Informe a altura do tri�ngulo: ");
		double altura = entrada.nextDouble();
		
		System.out.printf("A �rea do triangulo �: %.2f", (base*altura)/2);
	}
}
