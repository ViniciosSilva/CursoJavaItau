/* 2.Fa�a programas Java para calcular: 
 a. �rea de um quadrado, dado seu lado 
 �rea = lado * lado
 */ 
import java.util.Scanner;

public class Exercicio2A {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double lado;

		System.out.println("Informe o valor do lado do quadrado: ");
		lado = entrada.nextDouble();

		System.out.printf("A �rea do quadrado �: %.2f", (lado * lado));
	}

}
