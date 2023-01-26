
public class Building implements CarbonFootprint{
	//ATRIBUTOS

	private int consumoEnergia;
	private static double emissaoCO2 =  0.1016;
	
	//METODO
	@Override
	public double getCarbonFootprint() {
		
		return consumoEnergia*emissaoCO2;
	}		

	//CONSTRUTOR

	public Building() {
		
	}

	public Building(int consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}
	
		
}