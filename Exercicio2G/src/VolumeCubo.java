import java.util.Scanner;

public class VolumeCubo {

public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.print("Informe o lado do cubo: ");
	double lado = entrada.nextDouble();
	
	System.out.printf("O volume do cubo é: %.2f", (lado*3));
	
	entrada.close();
}
}
