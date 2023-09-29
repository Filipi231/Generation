package Exercicios_ArrayList;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPila1 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
        Scanner leia = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair do programa");
            System.out.print("Digite uma opção: ");

            int opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = leia.nextLine();
                    pilha.push(nomeLivro);
                    System.out.println("Pilha: ");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    System.out.println("Lista de Livros na Pilha: ");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        String livroRetirado = pilha.pop();
                        System.out.println("Pilha: ");
                        for (String livro : pilha) {
                            System.out.println(livro);
                        }
                        System.out.println("Um Livro foi retirado da pilha!");
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    leia.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}