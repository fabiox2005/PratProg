package Ex01;

public class Cilindro extends Circulo{

	private double altura, base;

	public Cilindro(double raio, double base, double altura) {
		super(raio);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double Area() {
		return Math.PI * Math.pow(getRaio(),2);	}

	@Override
	public double Perimetro() {
		return Math.pow(base,2);
	}

	@Override
	public double Volume() {
		return (Area()*altura);
	}

}
