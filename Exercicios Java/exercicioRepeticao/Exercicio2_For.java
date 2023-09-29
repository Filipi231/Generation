package exercicioRepeticao;

import java.util.Scanner;

public class Exercicio2_For {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, i, pares = 0, impares = 0;
		
		
		
		for (i = 1; i <11; i++) {
			System.out.println("Digite o " + i + " número:");
			num1 = leia.nextInt();
			
			if ( num1 % 2 == 0) {
				pares++;
				
			}else {
				impares++;
			} leia.close();
			
			
		}
		
		
		
			System.out.println("Total de numeros pares: " + pares);
			System.out.println("Total de numeros pares: " + impares);
			
			
		
	}
}
