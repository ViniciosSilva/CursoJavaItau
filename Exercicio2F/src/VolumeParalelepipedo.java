import java.util.Scanner;

public class VolumeParalelepipedo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

	System.out.print("Informe a altura: ");
	double altura = entrada.nextDouble();
	
	System.out.print("Informe a largura: ");
	double largura = entrada.nextDouble();
	
	System.out.print("Por fim, informe a profundidade: ");
	double profundidade = entrada.nextDouble();
	
	System.out.printf("O volume do paralelepípedo é: %.2f", (altura * largura * profundidade));
	
	entrada.close();
	}
}