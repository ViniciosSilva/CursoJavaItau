import java.util.Scanner;

public class AreaTrapezio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a base maior: ");
		double baseMaior = entrada.nextDouble();
		
		System.out.println("Informe a base menor: ");
		double baseMenor = entrada.nextDouble();
		
		System.out.print("Informe a altura: ");
		double altura = entrada.nextDouble();
		
		System.out.printf("A área do trapézio é: %.2f", (((baseMaior+baseMenor)*altura)/2));
	}
}
