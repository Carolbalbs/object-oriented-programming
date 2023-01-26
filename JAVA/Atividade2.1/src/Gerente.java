
public class Gerente  extends Funcionario{
	// O gerente recebe duas vezes o salário_base

	//CONSTRUTOR
	public Gerente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
		
	}
	public Gerente(){
		
	}
	//METODO
	public double calculaSalario() {

		return salarioBase*2;
	}
}
