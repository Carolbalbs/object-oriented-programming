package projeto_final;

public abstract class Pessoa {
//ATRIBUTOS
	protected String nome;
	protected String cpf;
	
//SET N GET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
