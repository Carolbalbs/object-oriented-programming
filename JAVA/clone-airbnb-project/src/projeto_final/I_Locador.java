package projeto_final;

public interface I_Locador extends OpcoesAluguel {
//METODOS ABSTRATOS
	
	public abstract void createAnuncioAluguel(Item item);//criar anuncio de imovel
	public abstract void deleteAnuncioAluguel(Item item);//deletar anuncio de imovel
	public abstract void historicoImoveisAlugados();
}
