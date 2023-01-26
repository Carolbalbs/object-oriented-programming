
public class Bicycle implements CarbonFootprint{
	//ATRIBUTO
	private double distanciaPecorrida;
	private static double emissaoCO2 =  0.1016;
	
	//METODO
	@Override
	public double getCarbonFootprint() {
		return distanciaPecorrida*emissaoCO2;
		
	}

	//CONSTRUTOR
	public Bicycle() {
		}

	public Bicycle(double distanciaPecorrida) {
		this.distanciaPecorrida = distanciaPecorrida;
	}
	
}
