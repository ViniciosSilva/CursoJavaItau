import java.util.Scanner;

/*
  b. �rea de um ret�ngulo, dados sua base e sua altura 
 �rea = base * altura  
 
 */
public class AreaRetangulo {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

double base, altura;

System.out.print("Informe a base do ret�ngulo: ");
base = entrada.nextDouble();
System.out.print("Informe a altura  do ret�ngulo: ");
altura = entrada.nextDouble();

System.out.printf("A �rea do ret�ngulo �: %.2f", base*altura);
entrada.close();
}	
}
