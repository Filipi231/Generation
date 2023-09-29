package Exercicios_ArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_Collection_set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> inteiro = new HashSet<>();
		
		for(int i=0; i  <10; i++) {
			inteiro.add(i);
		}
		
		
		System.out.println("Numeros");
		for (int valor : inteiro) {
			System.out.println(valor);
		}
		
		System.out.println("\n Digite o numero que voce deseja encontar: ");
		int num1 = leia.nextInt();
		
		if (inteiro.contains(num1)) {
			System.out.println("O numero " + num1 + " Foi encontrado");
		}
		else {
			System.out.println("O numero " + num1 + " nao foi encontrado");
		}
		
		leia.close();
		
	}

}
