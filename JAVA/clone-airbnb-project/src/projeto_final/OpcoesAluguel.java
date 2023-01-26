package projeto_final;

public interface OpcoesAluguel {
//METODOS ABSTRATOS
		public abstract void pesquisarItens(Item pesquisaImovel);//buscar imovel para alugar
		public abstract void updateAluguel();//confirmar ou cancelar reserva 
		public abstract void readReservaAluguel(Item item);//vizualizar ocupacao do imovel
		public abstract void historicoAlugueis();//historico de alugueis
		public abstract void enviarMensagem();
		void historicoAlugueis(Object object);

}
