package exercicioRepeticao;

import java.util.Scanner;

public class Exercicio3_While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade1 = 0, menor = 0, maior =0;
		
		System.out.println("Digite uma idade: ");
		idade1 = leia.nextInt();
		
		
		
		while(idade1 != 0) {
			
			if (idade1 <= 21) {
				menor++;	
			} 
			
			else if (idade1 >= 50) {
				maior++;
			}
			
			System.out.println("Digite 0 para sair ");
			idade1 = leia.nextInt();
			
		}
			leia.close();
		
		System.out.println("Total de pessoas menores de 21 anos:" + menor);
		System.out.println("Total de pessoas Maiores de 50 anos:" + maior);
		
	}

}
