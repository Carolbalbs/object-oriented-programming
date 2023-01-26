import java.util.ArrayList;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) {
		//Cria um array de objetos do tipo CarbonFootprint
				ArrayList<CarbonFootprint> eventos = new ArrayList<CarbonFootprint>();
				eventos.add( new Bicycle(150));
				eventos.add( new Building(450));
				eventos.add( new Car(300.40));
				
				System.out.println("Calculo de CarbonFootprint para de cada objeto: ");
				
				
				
				Iterator<CarbonFootprint> it = eventos.iterator();
		        while(it.hasNext()){
		            CarbonFootprint i = it.next();
		            System.out.printf("O calculo da pegada de carbono - Carbon Footprint é %.2f kg.CO2 %n%n", 					i.getCarbonFootprint());
		        }
	}

}
