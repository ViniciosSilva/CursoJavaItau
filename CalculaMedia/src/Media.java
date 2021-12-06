import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.print("Informe a primeira nota: ");
		nota1 = entrada.nextDouble();

		System.out.print("Informe a segunda nota: ");
		nota2 = entrada.nextDouble();

		media = ((nota1 + nota2) / 2);

		System.out.printf("A média do aluno foi: %.2f%n", media);

		if (media >= 6) {
			System.out.println("Parabéns! você foi aprovado");
		} else {
			System.out.println("Eba!, vamos nos ver denovo ano que vem");
		}
	}
}
