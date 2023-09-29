package Exercicio_Poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteCliente {

	public static void main(String[] args) {
		
		try {
			
			List<PessoaFisica> clientes = new ArrayList<>();
			
		PessoaFisica  Cliente1 = new PessoaFisica("Pedro", 40028922, "Gerente", 38, "Rua Perdida N12", "Masculino");  
		PessoaFisica  Cliente2 = new PessoaFisica ("Larissa", 12345678, "Ajudante", 21, "Rua Desconhecida N20", "Feminino");
	
		 List<PessoaFisica> resultado = clientes.stream()
                 .filter(cliente -> cliente.getIdade() > 30) // Exemplo de filtro
                 .collect(Collectors.toList());
		
		 System.out.println("\nClientes com idade superior a 30 anos:");
         resultado.forEach(PessoaFisica::visualizar);
		 
		System.out.println("\nDados do Cliente 1: ");
		Cliente1.visualizar();
		
	
		System.out.println("\nDados do Cliente 2: ");
		Cliente2.visualizar();
		
		
		PessoaJuridica juridico1 = new PessoaJuridica("Julio", 23145678, "Rua das Empresas N55", 45,  "Empresario", "12.456/0001-XX");
		PessoaJuridica juridico2 = new PessoaJuridica("Pedro", 98745612, "Rua das Montanhas N02", 87,  "Arquiteto", "45.874/0001-XA");
		
		
		System.out.println("\nDados do Filiante 1: ");
		juridico1.visualizar();
		
		System.out.println("\nDados do Filiante 2: ");
		juridico2.visualizar();
		
		}catch (Exception e) {
			System.out.println("Ocorreu um erro no Codigo" + e.getMessage());
		}
}

	
		
	
	
}
