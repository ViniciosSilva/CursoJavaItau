import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Informe a altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		System.out.printf("A área do triangulo é: %.2f", (base*altura)/2);
	}
}
