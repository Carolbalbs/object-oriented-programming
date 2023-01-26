
public class Car implements CarbonFootprint{
	//ATRIBUTO
	private double distanciaPecorrida;
	private static double emissaoCO2CarroGasolina = 1.69;
	
	//METODO
	@Override
	public double getCarbonFootprint() {
		return distanciaPecorrida*emissaoCO2CarroGasolina;
	
	
}
	//CONSTRUTOR
	public Car() {
		
	}
	public Car(double distanciaPecorrida) {
		
		this.distanciaPecorrida = distanciaPecorrida;
	}

}
