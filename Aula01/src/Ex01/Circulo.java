package Ex01;

public class Circulo extends Figura{

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double Area(){
		return Math.PI * Math.pow(raio, 2);
	}
	
	@Override
	public double Perimetro(){
		return 2 * Math.PI * this.getRaio();
	}

	@Override
	public double Volume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}	
