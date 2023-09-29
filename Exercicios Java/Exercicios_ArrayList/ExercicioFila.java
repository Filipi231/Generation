package Exercicios_ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner leia = new Scanner(System.in);

        while (true) {
            
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Sair ");
            System.out.print("Digite uma opção: ");
            int opcao = leia.nextInt();
            
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nomeCliente = leia.nextLine();
                    filaClientes.add(nomeCliente);
                    
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                    System.out.println("Cliente Adicionado!");
                    break;

                case 2:
                    System.out.println("Lista de Clientes na Fila: ");
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                    break;

                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("Fila: ");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                        System.out.println("O Cliente " + clienteChamado + " foi Chamado!");
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
