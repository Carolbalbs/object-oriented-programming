package projeto_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Menu {
	static List<Item> opcoesImoveis = new ArrayList();
	
	private Scanner ler = new Scanner(System.in);
    private Locador locador = new Locador("Carol", "864545454566");
    private Locador locador2 = new Locador("Davi", "8645574566");
    private Locatario locatario = new Locatario ("Jonas", "24456767");
    private SuperUsuario admin = new SuperUsuario ("Joao Neto", "3456787909"); 
    
    private Locador perfilLocador;
    private Locatario perfilLocatario;
    private SuperUsuario perfilUser;
    
		public void logar() {
		
		
		 System.out.println("Bem vindo! Como dejesa logar : \n"
			 		+ "1 - Super usuario \n"
					+ "2 - Locatario \n"
					+ "3 - Locador\n");
			 
			 int userSelecionado = ler.nextInt();
			 
			 	if (userSelecionado == 2) {
				 
				 perfilLocatario = locatario;
				 menuLocatario();
				 
			 	}else if(userSelecionado == 3) {
				 
				 perfilLocador = locador;
				 menuLocador();
				 
			 }else {
				 perfilUser = admin;
				 superUsario();
			 }
		}
		private void menuLocatario() {
			
			 System.out.println("\n Bem vindo de volta " + locatario.nome + " o que deseja fazer?\n"
			 		+ "1. Pesquisar imovel para realizar reserva\n"
			 		+ "2. Verificar reserva\n"
			 		+ "3. Histórico de alugueis\n"
			 		+ "4. Voltar ao menu inicial\n"
			 		);
				 
				 int opcaoSelecionada = ler.nextInt();
				 	if(opcaoSelecionada == 4) {
		
				 		logar();
				 		
				 	}else if(opcaoSelecionada == 1){
				 		//implementa metodo pesquisarItens() e verificaValor();;
				 	
				 		Item pesquisaImovel = new Item();
				 		Localizacao pesquisaLocalizacao = new Localizacao();
				 		
				 		System.out.println("Nome da cidade\n");
				 		pesquisaLocalizacao.setCidade(ler.next());
				 		
				 		System.out.println("Nome do bairro\n");
				 		pesquisaLocalizacao.setBairro(ler.next());
				 						 		System.out.println("Digite a quantidade de pessoas\n");
				 		pesquisaImovel.setQuantidadePesssoas(ler.nextInt());
				 						 		System.out.println("Digite a quantidade de diárias\n");
				 		pesquisaImovel.setQuantidadePesssoas(ler.nextInt());
				 						 		System.out.println("Informe tipo de aventuras (tours, passeios,trackings)"
				 				+"ou experiências (aulas de "
				 				+ "yoga, boxe, culinária, música) "
				 				+ "do seu imovel\n");
				 		pesquisaImovel.setTipo(ler.next());

				 		perfilLocatario.pesquisarItens(pesquisaImovel);
				 		menuLocatario();
				 		perfilLocatario.alugar(pesquisaImovel);
				 		menuLocatario();
				 	}else if(opcaoSelecionada == 2) {
				 		//
				 		int opcaoUsuario = ler.nextInt();
				 		
				 		System.out.println("Ok " + locatario.nome 
				 				+ " O que deseja fazer?\n"
						 		+ "1. Aceitar ou cancelar Reserva\n"
						 		+ "2. Enviar mensagem para locador\n"
						 		+ "3. Vizualizar ocupação do imovel\n"
						 		+ "4. Voltar ao menu inicial\n");
				 		if(opcaoUsuario == 4) {
				 			
				 			logar();
				 			
				 		}else if(opcaoUsuario == 1) {
				 			//implementar metodo updateAlguel();
				 			perfilLocatario.updateAluguel();
					 		menuLocatario();
				 		}
				 		 else if(opcaoUsuario == 2) {
				 			//implementar metodo enviarMensagem();
				 			perfilLocatario.enviarMensagem();
					 		menuLocatario();
				 		 }
				 		 else {
				 			//vizualizar ocupacao do imovel (implementar metodo readReservaAluguel());
				 			perfilLocatario.readReservaAluguel(null);
					 		menuLocatario();
				 		 }
				 	}else {
				 	// implementa metodo historicoAlugueis();
				 		perfilLocatario.historicoAlugueis();
				 		menuLocatario();
				 	}
		}	 	
		private void menuLocador() {

			
			 System.out.println("\n Bem vindo de volta " + locador.nome 
					 +" O que deseja fazer?\n"
					 +"1. Disponibilizar imovel para alugar\n"// cadastrar imovel para alugar
					 +"2. Pesquisar imovel para realizar reserva\n"// alugar imovel de alguem
					 +"3. Verificar reserva\n" // cancelar ou aceitar imovel aluguel 
					 +"4. Histórico de alugueis\n" // 1. imoveis que alugou de alguem 
					 								//2.imoveis que alugou para alguem   
					 +"5. Voltar ao menu inicial\n");
			 
				 int opcaoSelecionada = ler.nextInt();
				 
				 	if(opcaoSelecionada == 5) {
		
				 		logar();
				 		
				 	}else if(opcaoSelecionada == 1) {
				 		
				 		Item imovel = new Item();
				 		
				 		imovel.setOcupado(false);
				 		
				 		imovel.setLocador(locador2);
				 		Localizacao localizacao = new Localizacao();
				 				
				 		System.out.println("Informe o titulo do seu imovel\n");
				 		imovel.setTitulo(ler.next());
				 		
				 		System.out.println("Informe o valor da diaria do seu imovel\n");
				 		imovel.setValorDiaria(ler.nextFloat());
				 		
				 		System.out.println("Informe a quantidade de dias minima que permite ficar imovel\n");
				 		imovel.setQuantidadeDiarias(ler.nextInt());
				 		
				 		System.out.println("Informe tipo de aventuras (tours, passeios,trackings)"
				 				+"ou experiências (aulas de "
				 				+ "yoga, boxe, culinária, música) "
				 				+ "do seu imovel\n");
				 		imovel.setTipo(ler.next());
				 		
				 		System.out.println("Informe a cidade\n");
				 		localizacao.setCidade(ler.next());
				 		
				 		System.out.println("Informe o bairro\n");
				 		localizacao.setBairro(ler.next());
				 		imovel.setLocalizacao(localizacao);
				 		
				 		System.out.println("Informe o limite maximo de pessoas no imovel \n");
						imovel.setQuantidadePesssoas(ler.nextInt());
						
						
				 		perfilLocador.createAnuncioAluguel(imovel);
				 		menuLocador();
				 		
				 	}else if(opcaoSelecionada == 2) {
				 		
				 		Item pesquisaImovel = new Item();
				 		Localizacao pesquisaLocalizacao = new Localizacao();
				 		
				 		System.out.println("Nome da cidade\n");
				 		pesquisaLocalizacao.setCidade(ler.next());
				 		
				 		System.out.println("Nome do bairro\n");
				 		pesquisaLocalizacao.setBairro(ler.next());
				 		
				 		System.out.println("Digite a quantidade de pessoas\n");
				 		pesquisaImovel.setQuantidadePesssoas(ler.nextInt());
				 		
				 		System.out.println("Digite a quantidade de diárias\n");
				 		pesquisaImovel.setQuantidadePesssoas(ler.nextInt());
				 		
				 		System.out.println("Informe tipo de aventuras (tours, passeios,trackings)"
				 				+"ou experiências (aulas de "
				 				+ "yoga, boxe, culinária, música) "
				 				+ "do seu imovel\n");
				 		pesquisaImovel.setTipo(ler.next());

				 		perfilLocador.pesquisarItens(pesquisaImovel);
				 		menuLocador();
				 		
				 	}else if(opcaoSelecionada == 3) {
				 		
				 		int opcaoUsuario = ler.nextInt();
				 		
				 		System.out.println(" " + locador.nome 
				 				+ " O que deseja fazer?\n"
						 		+ "1. Aceitar ou cancelar Reserva\n"
						 		+ "2. Enviar mensagem para locador\n"
						 		+ "3. Vizualizar ocupação do imovel\n"
						 		+ "4. Voltar ao menu inicial\n");
				 		if(opcaoUsuario == 4) {
				 			
				 			logar();
				 			
				 		}else if(opcaoUsuario == 1) {
				 			//implementar metodo updateAlguel();
				 			perfilLocador.updateAluguel();
					 		menuLocador();
				 		}
				 		 else if(opcaoUsuario == 2) {
				 			//implementar metodo enviarMensagem();
				 			 perfilLocador.enviarMensagem();
					 		menuLocador();
				 		 }
				 		 else {
				 			 //vizualizar ocupacao do imovel (implementar metodo readReservaAluguel)
				 			perfilLocador.readReservaAluguel(null);
					 		menuLocador(); 
				 		 }
				 	}else {
				 		// implementa metodo historicoAlugueis();
				 		perfilLocador.historicoAlugueis(null);
				 		menuLocador(); 
				 	}
			}	
		private void superUsario() {
			
			 System.out.println("Bem vindo de volta " + admin.nome 
					 +" O que deseja fazer?\n"
					 +"1. Lista de itens comercializados\n"
					 +"2. Reservas de imoveis já realizadas e confirmadas\n" // 
					 +"3. Valor comercializado em todo o site\n" //  
					 +"4. Voltar ao menu inicial\n"); // 
			 
			 int opcaoSelecionada = ler.nextInt();;
			 if(opcaoSelecionada == 4) {
					
			 		logar();
			 		
			 	}
		}
}		
