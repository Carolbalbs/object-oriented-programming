package projeto_final;

public class Locatario extends Pessoa implements I_Locatario{
	
	//CONSTRUTOR
	
	public Locatario(String nome, String cpf) {

		this.nome = nome;
		this.cpf = cpf;
	
	
	}
	//METODOS

	@Override
	public void pesquisarItens(Item pesquisaImovel) {
		int i;
		Item item;
		for(i = 0 ; i < Menu.opcoesImoveis.size(); i++) {
			
			 item = Menu.opcoesImoveis.get(i);
			 
			 if(item.getLocalizacao().getCidade() == pesquisaImovel.getLocalizacao().getCidade() &&
					 item.getQuantidadeDiarias() == pesquisaImovel.getQuantidadeDiarias() &&
					 item.getQuantidadePesssoas() == pesquisaImovel.getQuantidadePesssoas()) {
				
				 System.out.println("Resultado da sua pesquisa: " + item);
				 break;
			 }
				
		}		
		
	}
	@Override
	public double verificaValor(Item item) {
	
		return item.getQuantidadeDiarias()*item.getValorDiaria();
	}
	

	@Override
	public void updateAluguel() {
		
		
		
	}

	@Override
	public void readReservaAluguel(Item item) {
	
		if(item.isOcupado()) {
			System.out.println("Casa já está alugada");
		}else {
			System.out.println("Casa já está disponivel para alugar!");
		}
		
		
	}

	@Override
	public void enviarMensagem() {
	
		
	}

	@Override
	public void historicoAlugueis() {
		
		
	}

	@Override
	public void alugar(Item item) {
	
		
	}

	@Override
	public void historicoAlugueis(Object object) {
		// TODO Auto-generated method stub
		
	}

	



	
}
