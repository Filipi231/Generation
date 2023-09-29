package exerciciosVariavel;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float salario, adicional, extras, desconto, liquido;
		
		
		System.out.println("Digite o Salario:");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Adicional:");
		adicional = leia.nextFloat();
		
		System.out.println("Digite as Extras:");
		extras = leia.nextFloat();
		
		System.out.println("Digite o Desconto:");
		desconto = leia.nextFloat();
		
		liquido = salario + adicional + (extras * 5)- desconto;
		
		System.out.printf("Salario Liquido:%.2f\n", liquido);
		

	}

}
