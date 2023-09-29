package Exercicios_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Double> notas = new ArrayList<Double>();
		Double y = Double.valueOf(7);
		
		notas.add(y);
		notas.add(12.5);
		System.out.println("Digite um numero");
		notas.add(leia.nextDouble());
		
		System.out.println("\n Notas cadastradas " + notas);
		
		System.out.println("\n Localização " + notas.get(1));
		
		System.out.println("\n Quantidade de Arrays " + notas.size());
		
		System.out.println("\n Notas cadastradas " + notas.isEmpty());
		
		
		notas.sort(null);
		System.out.println("\n Notas cadastradas " + notas);
		
		leia.close();
		
			}

}
