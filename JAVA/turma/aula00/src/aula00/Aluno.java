package aula00;

public class Aluno {

	private int matricula;
	  private String nome;
	  private double nota1;
	  private double nota2;
	 
// CONSTRUCTOR PATTERN
	  public Aluno (){
	    
	  }
// CONSTRUCTOR 
	  public Aluno(String nome, int matricula){
	    this.nome = nome;
	    this.matricula = matricula;
	  }
	 
// METODOS GET N SET
	  
	  
	  
	  //Matricula

	  private void setMatricula(int matricula){
	    this.matricula = matricula;
	  }
	  private int getMatricula(){
	    return matricula;
	  }
	  //Nome
	  
	  private void setNome(String nome){
	    this.nome = nome;
	  }
	  private String getNome(){
	    return nome;
	  }
	  //Nota1
	  
	  private void setNota1(double nota1){
	    if(nota1 >= 0 && nota1 <= 10){
	      this.nota1 = nota1;
	    }
	  }
	  private double getNota1(){
	    return nota1;
	  }
	  //Nota2 
	  
	  private void setNota2(double nota2){
	    if(nota2 >= 0 && nota2 <= 10){
	      this.nota2 = nota2;
	    }
	  }
	  private double getNota2(){
	    return nota2;
	  }
// METODOS
	  
	  public double calculaMedia(double nota1,double nota2) {
	  
	  return ((this.nota1+this.nota2)/2); 
	  } 
	}


