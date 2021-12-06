import java.util.Scanner;

public class AreaLosango {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a diagonal 1: ");
		double diagonal1 = entrada.nextDouble();
		System.out.print("Informe a diagonal 2: ");
		double diagonal2 = entrada.nextDouble();
		
		System.out.printf("A área do losango é: %.2f", (diagonal1*diagonal2));
		
		entrada.close();
	}
}
