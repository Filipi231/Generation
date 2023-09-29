package exerciciosLacos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		
		System.out.println("Digite a primeira palavra");
		palavra1 = leia.nextLine();
		
		System.out.println("Digite a primeira palavra");
		palavra2 = leia.nextLine();
		
		System.out.println("Digite a primeira palavra");
		palavra3 = leia.nextLine();
		
		if (palavra1.equals("Vetebrado")) {
			if (palavra2.equals("Ave")) {
				if (palavra3.equals("Carnivoro")) {
					System.out.println("Aguia");
				} else {
					System.out.println("Pomba");
				}
			}else {
				if(palavra3.equals("onivoro")) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");
				}
			}
		}else {
			if (palavra2.equals("inseto")) {
				if (palavra3.equals("Hematofago")) {
					System.out.println("Pulga");
				} else {
					System.out.println("Largarta");
				}
			}else {
				if (palavra3.equals("Hematofago")) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("Minhoca");
				}
			}
		}
				
				

		
		
	}

}
