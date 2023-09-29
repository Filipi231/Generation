package exerciciosLacos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
	int n1, n2, n3, calculo;
	
		System.out.println("Digite o numero A");
		n1 = leia.nextInt();
		
		System.out.println("Digite o numero B");
		n2 = leia.nextInt();
		
		System.out.println("Digite o numero C");
		n3 = leia.nextInt();
		
		calculo = (n1 + n2);
		
		
		if (calculo > n3) {
			System.out.println("A Soma de A + B é maior que C");
		}
		else if (calculo < n3) {
			System.out.println("A Soma de A + B é menor que C");
		}
		else {
			System.out.println("A Soma de A + B é igual C");
		}
		
			

	}

}
