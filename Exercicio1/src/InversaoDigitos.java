import java.util.Scanner;

public class InversaoDigitos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, novoNumero, unidade, dezena, centena, resto;

		System.out.println("Digite um número de 3 digitos: ");
		numero = entrada.nextInt();

		centena = numero / 100;
		resto = numero % 100;
		dezena = resto / 10;
		unidade = resto % 10;

		novoNumero = unidade * 100 + dezena * 10 + centena;

		System.out.printf("número invertido: %d", novoNumero);
	}
}
