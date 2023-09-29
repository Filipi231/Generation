package Exercicio_Vetor_Matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int matriz [][] = new int[3][3];
		
		int soma1 = 0;
		int soma2 = 0;
		int i = 0;
		int b = 0;
		
		for ( i = 0; i <3; i++) {
			
			for (b = 0; b <3; b++) {
				System.out.println("Digite os elementos [" + i + "][" + b + ": ");
				matriz [i][b] = leia.nextInt();
				
				if (i == b) {
					soma1 += matriz[i][b];

				}
				
				
				if (i + b == 2) {
					soma2 += matriz [i][b];
					
				}
				
			}
			
		}
		
		
		System.out.println("Elementos da Diagonal Principal:");
		for (i = 0; i <3; i++) {
			System.out.println(matriz[i][i] + " ");
		}
		
				
		System.out.println("Elementos da Diagonal Secundario:");
		for (i = 0; i <3; i++) {
			System.out.println(matriz[i][2-i] + " ");
		}
		
		System.out.println("\n Soma dos elementos da Diagonal Principal " + soma1);
		System.out.println("\n Soma dos elementos da Diagonal Principal " + soma2);
		
		leia.close();
	}

}
