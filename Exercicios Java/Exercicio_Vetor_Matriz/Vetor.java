package Exercicio_Vetor_Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		
		System.out.println("Digite o numero que voce deseja encontrar: ");
		int num1 = leia.nextInt();
		
		
		int posicao = -1;
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] == num1) {
				posicao = i;
			}
		}
		
		
		
		if (posicao >= 0) {
			System.out.println("O numero " + num1 + " esta localizado na posição: " + posicao);
		}
		
		else {
			System.out.println("O numero " + num1 + " não foi encontrado!");
		}

		leia.close();
		
	}

}
