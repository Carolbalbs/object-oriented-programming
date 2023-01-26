package projeto_final;

public class Localizacao {
	
//ATRIBUTOS 
	private String cidade;
	private String bairro;
//GET N SET
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
//CONSTRUTOR PADRAO
	public Localizacao() {
		
	}
//CONSTRUTOR 
	public Localizacao(String cidade, String bairro) {
		
		this.cidade = cidade;
		this.bairro = bairro;
	}
	@Override
	public String toString() {
		return "Cidade: " + cidade + ", Bairro: " + bairro + " ";
	}
	
}

