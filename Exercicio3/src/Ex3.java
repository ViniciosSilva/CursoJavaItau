import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual o valor do salário mínimo: ");
		double salarioMinimo = entrada.nextDouble();

		System.out.print("Qual a quantidade de Kw que foi consumidos: ");
		double qtdKw = entrada.nextDouble();

		double Kw = salarioMinimo / 700;
		double valorTotal = Kw * qtdKw;
		double valorDesconto = (valorTotal / 100) * 10;
		double valorAPagar = valorTotal - valorDesconto;

		System.out.printf("Valor do Kw R$%.2f %n Valor total do consumo: R$%.2f %n Valor com desconto: %.2f", Kw,
				valorTotal, valorAPagar);
	}
}
