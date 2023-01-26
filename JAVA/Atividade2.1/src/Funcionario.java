
public abstract class Funcionario {
	//ATRIBUTOS
	protected String nome;
	protected String matricula;
	protected static double salarioBase = 1200;
	
	//METODO ABSTRACT
	public abstract double calculaSalario();
	
	//GET N SET
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	
	//CONSTRUTOR
	public Funcionario() {}
	
	public Funcionario(String nome, String matricula, double salarioBase) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		
	}
	
}
