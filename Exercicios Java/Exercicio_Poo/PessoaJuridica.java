package Exercicio_Poo;

import java.util.Optional;

public class PessoaJuridica extends Cliente {

	private Optional <String> cnpj;

	
	//Construtor//
	public PessoaJuridica(String nome, int telefone, String cargo, int idade, String endereco, String cnpj) {
		super(nome, telefone, cargo, idade, endereco);
		this.cnpj =Optional.ofNullable(cnpj);
	}


	public Optional <String> getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj =Optional.ofNullable(cnpj);
	}

	@Override
	
	public void visualizar() {
		
		super.visualizar();
		cnpj.ifPresent(cnpj -> System.out.println("CNPJ: " + cnpj));
	}

	

	
	
	
	
	
	
}
