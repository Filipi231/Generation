package exerciciosVariavel;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float n1, n2, n3, n4, calculo;
		
		
		System.out.println("Nota1");
		n1 = leia.nextFloat();
		
		System.out.println("Nota1");
		n2 = leia.nextFloat();
		
		System.out.println("Nota1");
		n3 = leia.nextFloat();
		
		System.out.println("Nota1");
		n4 = leia.nextFloat();
		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.printf("Diferença:\n %.2f", calculo);
		
		
		
		
		
		
		
	}

}
