package aula00;

public class Pessoa {

	  private String nome; 
	  private int cpf;
	  private int ano_nascimento;
	  private double salario;
	  


// CONSTRUCTOR PATTERN
	public Pessoa(){
	  
	}
// CONSTRUCTOR   
	public Pessoa(String nome, int cpf){
	  this.nome = nome; 
	  this.cpf = cpf;
	  
	}
	public Pessoa(String nome, double salario){

	  this.nome = nome;
	  this.salario = salario;
	}
	
// METODOS
	
	  //Nome
	  public void setNome(String nome){
	    this.nome = nome;
	  }
	  public String getNome(){
	    return nome;
	  }
	  //CPF
	  public void setCpf( int cpf){
	    this.cpf = cpf;
	  }
	  public int getCpf(){
	    return cpf;
	  }
	  //Ano de nascimento
	  public void setAnoNascimento(int ano_nascimento){
	    this.ano_nascimento = ano_nascimento;
	  }
	  public int getAnoNascimento(){
	    return ano_nascimento; 
	  }
	  //Salario
	  public void setSalario(double salario){
	    this.salario = salario;
	  }
	  public double getSalario(){
	    return salario;
	  }
	  
	  
	  public int calculaSalario(){

	    return 2022 - getAnoNascimento();
	  }

}
