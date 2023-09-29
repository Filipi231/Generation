package exerciciosLacos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeira;

		System.out.println("Digite o nome do doador:");
		nome = leia.next();

		System.out.println("Digite a idade do doador:");
		idade = leia.nextInt();

		System.out.println("Digite se é a primeira doação: Tru/false");
		primeira = leia.nextBoolean();

		if (idade < 18 || idade > 69) {
			System.out.println("O paciente não está apto para doar.");
		} else if (idade >= 60 && idade <= 69) {
			if (primeira) {
				System.out.println("O paciente não está apto para doar.");
			}

			else {
				System.out.println("O paciente está apto para doar.");
			}
		}

		else {
			System.out.println("O paciente está apto para doar.");
		}

	}

}
