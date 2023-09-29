package exercicioRepeticao;

import java.util.Scanner;

public class Exercicios4_DoWhile {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int num1, positivos = 0;

		
		do {
			System.out.println("Digite um numero: ");
			num1 = leia.nextInt();
			
			
			
			if (num1 > 0 ) {
				positivos += num1;
			}
					
			System.out.println("Digite 0 para finalizar...");
			
			
			
		} while (num1 !=0);
			
		leia.close();
		
		
		System.out.println("A soma dos numeros positivos é " + positivos);
		
		
	
	}

}
