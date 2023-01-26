package projeto_final;

public class Item {
	/*o usuário obtém todos as opções de itens disponíveis de acordo com 
	a quantidade de pessoas, a localização, e quantidade de diárias*/

//ATRIBUTOS 
	private boolean ocupado;
	private String titulo;
	private String tipo;
	private int quantidadePesssoas;
	private int quantidadeDiarias;
	private Localizacao localizacao;
	private double valorDiaria;
	private Locador proprietario; //referencia ao dono do imovel
	
//GET N SET
	public String getTitulo() {
	return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getQuantidadePesssoas() {
		return quantidadePesssoas;
	}
	public void setQuantidadePesssoas(int quantidadePesssoas) {
		this.quantidadePesssoas = quantidadePesssoas;
	}
	public int getQuantidadeDiarias() {
		return quantidadeDiarias;
	}
	public void setQuantidadeDiarias(int quantidadeDiarias) {
		this.quantidadeDiarias = quantidadeDiarias;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public Locador getLocador() {
		return proprietario;
	}
	public void setLocador(Locador proprietario) {
		this.proprietario = proprietario;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

//CONSTRUTOR PADRAO
	public Item() {
		
	}
// CONSTRUTOR
	public Item(String titulo, String tipo, int quantidadePesssoas, int quantidadeDiarias, Localizacao localizacao,
		double valorDiaria, Locador proprietario) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
		this.quantidadePesssoas = quantidadePesssoas;
		this.quantidadeDiarias = quantidadeDiarias;
		this.localizacao = localizacao;
		this.valorDiaria = valorDiaria;
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return "\n ----Informaçoes sobre o imovel---- \n  " + titulo + 
				"\n  Tipo do imovel: " + tipo + 
				"\n  Quantidade Pesssoas no Imovel: " + quantidadePesssoas +
				"\n  Quantidade de diaria minimas que é permitido ficar: " + quantidadeDiarias + 
				"\n  Valor da Diaria: " + valorDiaria + 
				"\n  Localizacao - " + localizacao +
				"\n  Nome do proprietario:" + proprietario + 
				"\n\n ----Imovel diponivel para locação---- ";
	}
	
	

}
