package Exercicios_ArrayList;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		
		
		for(int i=0; i  <10; i++) {
			fila.add(i);
		}
		
		System.out.println("Elementos da fila " + fila);
		
		
		
	}

}
