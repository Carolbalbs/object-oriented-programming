import java.util.LinkedList;

public class Main {
/*Escreva um programa e no método main crie uma LinkedList de CartaoWeb. Insira instâncias dos 3 tipos de cartões nesta LinkedList. Após, use um laço for para exibir as mensagens deste cartão chamando o método showMessage().*/
	public static void main(String[] args) {
		
		LinkedList<CartaoWeb> cartoesList = new LinkedList<CartaoWeb>();
	
		cartoesList.add(new Aniversario("Rosana!"));
		cartoesList.add(new DiaDosNamorados("Carol! <3"));
		cartoesList.add(new Natal(" Ciddy!"));
		
		// exibir list
		for(CartaoWeb count: cartoesList ) {
			count.showMessage();
		}
		
	}

}
