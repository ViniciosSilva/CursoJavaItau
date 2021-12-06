import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
//entrada de dados
		System.out.print("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
//calculo da m�dia
		double media = ((nota1 + nota2) / 2);
//exibe a m�dia com duas casas decimais
		System.out.printf("A sua m�dia foi: %.2f%n", media);
		// verifica m�dia obtida pelo aluno, e de acordo com sua nota diz se foi
		// reprovado, ficou de recupera��o, foi aprovado ou aprovado com louvor.
		if (media < 5) {
			System.out.println("Reprovado, at� o ano que vem!");
		} else if ((media >= 5) && (media < 6)) {
			System.out.println("Voc� est� em recupera��o, boa sorte!");
		} else if ((media >= 6) && (media < 8)) {
			System.out.println("Parab�ns, voc� foi aprovado!");
		} else if ((media >= 8) && (media <= 10)) {
			System.out.println("Parab�ns, voc� foi aprovado com louvor!");
		}
		entrada.close();
	}
}
