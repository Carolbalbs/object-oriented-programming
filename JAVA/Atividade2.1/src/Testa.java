import java.util.ArrayList;
import java.util.List;

/*
 * Crie uma classe Teste com um método main que cria um objeto de cada tipo e os armazena em uma lista e depois calcula a folha salarial dos três funcionários e imprime o valor total.  
 ~
 */
public class Testa {

	public static void main(String[] args) {
		List<Funcionario> opcoesSalario = new ArrayList();
		
		opcoesSalario.add(new Assistente());
		opcoesSalario.add(new Gerente());
		opcoesSalario.add(new Vendedor());
		int somaTotal = 0;
		for(Funcionario count: opcoesSalario) {
			System.out.println("Salario: " + count.calculaSalario());
			somaTotal += count.calculaSalario();
		}
		System.out.println("O valor total dos salarios e: " + somaTotal);
	}

}
