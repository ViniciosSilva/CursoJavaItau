import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor 1: ");
		double v1 = entrada.nextDouble();

		System.out.print("Informe o valor 2: ");
		double v2 = entrada.nextDouble();

		System.out.print("Informe o valor 3: ");
		double v3 = entrada.nextDouble();
		
		if(v1>v2&&v1>v3&&v1<v2+v3) {
			System.out.println("Os valores formam um triângulo");
		}else if(v2>v3&&v2>v1&&v2<v1+v3) {
			System.out.println("Os valores formam um triângulo");
		}else if(v3>v1&&v3>v2&&v3<v1+v2) {
			System.out.println("Os valores ormam um triângulo");
		}else {
			System.out.println("Os valores não formam um triângulo");
		}

	}
}
