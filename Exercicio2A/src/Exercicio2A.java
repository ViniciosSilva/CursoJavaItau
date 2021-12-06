/* 2.Faça programas Java para calcular: 
 a. área de um quadrado, dado seu lado 
 Área = lado * lado
 */ 
import java.util.Scanner;

public class Exercicio2A {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double lado;

		System.out.println("Informe o valor do lado do quadrado: ");
		lado = entrada.nextDouble();

		System.out.printf("A área do quadrado é: %.2f", (lado * lado));
	}

}
