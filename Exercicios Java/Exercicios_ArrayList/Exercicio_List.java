package Exercicios_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_List {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	List<String> cores = new ArrayList<String>();
	
	
		System.out.println("Adicione as Cores: ");
		
		for(int i = 0; i <5; i++) {
			System.out.println("Cor " + (i+1) + ":");
			String cor = leia.next();
			cores.add(cor);
			
			
		}
		
		leia.close();
		
		System.out.println("Listar todas as cores");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		
		System.out.println("\n Ordenar as cores");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		
		
		
		
		
		
		
		
	}
}
