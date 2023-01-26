
public class Vendedor extends Funcionario{
//o vendedor recebe o salário_base mais uma comissão definida no construtor de sua classe
	//ATRIBUTOS 
	private double comissao;
	//GET N SET
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	//CONSTRUTOR
	public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
		super(nome, matricula, salarioBase);
		this.comissao = comissao;
	}
	public Vendedor(){
		
	}
	//METODO
	public double calculaSalario() {

		return salarioBase + comissao;
	}
}
