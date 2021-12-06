import java.util.Scanner;

/*
  b. área de um retângulo, dados sua base e sua altura 
 Área = base * altura  
 
 */
public class AreaRetangulo {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

double base, altura;

System.out.print("Informe a base do retângulo: ");
base = entrada.nextDouble();
System.out.print("Informe a altura  do retângulo: ");
altura = entrada.nextDouble();

System.out.printf("A área do retângulo é: %.2f", base*altura);
entrada.close();
}	
}
