package projeto_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Locador extends Pessoa implements I_Locador, I_Locatario{

	//CONSTRUTOR 
	
	public Locador(String nome, String cpf) {

		this.nome = nome;
		this.cpf = cpf;
	}
	
	//METODOS LOCADOR
	@Override
	public void createAnuncioAluguel(Item item) {
		
		
	//Criar lista - List<nome_classe> nomeLista = new ArrayList();
		Menu.opcoesImoveis.add(item);
		
		System.out.println("Casas: " + Menu.opcoesImoveis);
	}

	public String toString() {
		return "Locador - Nome " + nome + ", CPF =" + cpf + " ";
	}
	
	@Override
	public void deleteAnuncioAluguel(Item item) {
		
		Menu.opcoesImoveis.remove(item);
		
		System.out.println("Casas: " + Menu.opcoesImoveis);
	}
	
	@Override
	public void historicoImoveisAlugados() {
		
		
	}


	//METODOS LOCATARIO-LOCADOR

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
	
	public double verificaValor(Item item) {
		
		return item.getQuantidadeDiarias()*item.getValorDiaria();
	}

	public void readReservaAluguel(Item item) {
		
		if(item.isOcupado()) {
			System.out.println("Casa já está alugada");
		}else {
			System.out.println("Casa já está disponivel para alugar!");
		}
		
	}
	public void updateAluguel() {
		
		
	}

	@Override
	public void enviarMensagem() {
		
		
	}

	@Override
	public void historicoAlugueis(Object object) {
		
		
	}

	@Override
	public void alugar(Item item) {
		
		
	}

	@Override
	public void historicoAlugueis() {
		// TODO Auto-generated method stub
		
	}

	

	
	

	
}
