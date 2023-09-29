package exerciciosLacos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int numero;
	
		System.out.println("Digite um numero:");
		numero = leia.nextInt();
	
		
		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("O Numero" + numero +  " é par e positivo");
		}
		
		else if (numero % 3 ==0 && numero >= 0) {
			System.out.println("O Numero" + numero + "é impar e positivo");
			
		}
		
		if (numero % 2 == 0 && numero <0) {
			System.out.println("O Numero" + numero + "é par e negativo");
		}
		
		if (numero % 3 == 0 && numero <0) {
			System.out.println("O Numero" + numero + "é impar e negativo");
		}
		

		
	}

}
