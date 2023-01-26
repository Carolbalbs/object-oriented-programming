
public class Assistente extends Funcionario{
// o assistente recebe o salário_base
	
	//CONSTRUTOR
	
	
	public Assistente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
		
	}
	public Assistente(){
		
	}


	//METODO
	@Override
	public double calculaSalario() {
		
		return salarioBase;
	}

}
