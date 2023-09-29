package exerciciosLacos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
		
	int codigo, quantidade;
	double preco, total;
	String produto;
	
	

	
		System.out.println("Cogido do Produto "       + "Produto    " + "Preço Unitario" );
		System.out.println("        1    " +        "Cachorro Quente" + "   R$10.00" );
		System.out.println("        2    " +        "    X-Salada"    + "   R$10.00" );
		System.out.println("        3    " +        "    X-Bacon"     + "   R$10.00" );
		System.out.println("        4    " +        "    Bauru"       + "   R$10.00" );
		System.out.println("        5    " +        " Refrigerante"   + "   R$10.00" );
		System.out.println("        6    " +        "Suco de laranja" + "   R$10.00" );
		
		System.out.println("Codigo do produto:");
		codigo = leia.nextInt();
		
		System.out.println("Quantidade>");
		quantidade = leia.nextInt();
		
		
		switch (codigo) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10.00;
			
			break;
		
		case 2:
			produto = "X-Salada";
			preco = 15.00;
			break;
		
		case 3:
			produto = "X-Bacon";
			preco = 18.00;
			break;
		
		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;
		
		case 5:
			produto = "Refrigerante";
			preco = 13.00;
			break;

		case 6:
			produto = "Suco de laranja";
			preco = 10.00;
			break;
			
		default:
			System.out.println("Codigo invalido");
			return;
		}
		
		
		total = quantidade * preco;
	
		System.out.println("Produto Escolhido" + produto);
		System.out.printf("Valor Total %.2f", total);
		
		
		
		
	
	}
}
