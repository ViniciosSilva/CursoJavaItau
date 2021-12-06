import java.util.Scanner;

public class VolumeCilindro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		double raio = entrada.nextDouble();
		
		System.out.print("Informe a altura: ");
		double altura = entrada.nextDouble();
		
		System.out.printf("O volume do cilindro é: %.2f", (Math.PI*raio*raio*altura));
		
		entrada.close();
	}
}
