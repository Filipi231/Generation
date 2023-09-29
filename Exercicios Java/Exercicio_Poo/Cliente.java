package Exercicio_Poo;

public class Cliente {
	
	private String nome;
	private int telefone;
	private String cargo;
	private int idade;
	private String endereco;
	
	public Cliente(String nome, int telefone, String cargo, int idade, String endereco) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.cargo = cargo;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar() {
	
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Idade: " + idade);
		System.out.println("Endereço: " + endereco);
		System.out.println("Cargo: " + cargo);
	}
	
	
}
