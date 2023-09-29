package Exercicio_Poo;

public class PessoaFisica extends Cliente{

	protected String genero;
	
	//Construtor\\
	public PessoaFisica(String nome, int telefone, String cargo, int idade, String endereco, String genero) {
		super(nome, telefone, cargo, idade, endereco);
		this.genero = genero;
	}
	
	
	public String getgenero() {
		return genero;
		
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	@Override
		public void visualizar () {
			
			super.visualizar();
			System.out.println("Qual seu genero: " + this.genero);
		
	}
	 
}
