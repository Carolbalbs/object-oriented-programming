package aula00;

public class Turma_graduacao extends Turma{
	
//ATRIBUTOS
	private static int  limite_turma = 5;
	private int  qtnd; 
	protected Pessoa professor;
	protected Aluno[] aluno;
	
// METODOS	
	public double calculaMediaTurma() {
		double soma = 0;
		for(i = 0; i <= qtnd; i++) {
			soma += this.Aluno.media();
		}
	}

	
//METODOS GET N SET	
	public static int getLimite_turma() {
		return limite_turma;}

	public static void setLimite_turma(int limite_turma) {
		Turma_graduacao.limite_turma = limite_turma;
	}

	public int getQtnd() {
		return qtnd;
	}
	
	public void setQtnd(int qtnd) {
		this.qtnd = qtnd;
	}
	
	public Pessoa getProfessor() {
		return professor;
	}
	public void setProfessor(Pessoa professor) {
		this.professor = professor;
	}
	
	public Aluno[] getAluno() {
		return aluno;
	}
	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}


	
	
}
