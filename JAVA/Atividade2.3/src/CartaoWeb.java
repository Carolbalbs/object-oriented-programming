
public abstract class  CartaoWeb {
	//ATRIBUTO
	protected String destinatario;
	
	//CONSTRUTOR
	public String getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}


	public CartaoWeb(String destinatario) {
		super();
		this.destinatario = destinatario;
	}
	//METODO
	public abstract void showMessage();
	
}
