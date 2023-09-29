package exerciciosVariavel;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.printf("Nota 1:\n");
		nota1 = leia.nextFloat();
		
		System.out.printf("Nota 2:\n");
		nota2 = leia.nextFloat();

		System.out.printf("Nota 3:\n");
		nota3 = leia.nextFloat();
		
		System.out.printf("Nota 4:\n");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4; 
		
		System.out.printf("Média Final:%.2f\n", media);
		
	
	}

}
