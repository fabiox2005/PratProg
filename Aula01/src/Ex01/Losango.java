package Ex01;

public class Losango extends Poligono implements Diagonal {

	public Losango(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Area() {
		return ( getBase() * getAltura() );
	}

	@Override
	public double Perimetro() {
		return ( getBase() + getAltura() ) * 2;
	}
	
	@Override
	public double diagonal() {
		return getAltura() * Math.sqrt(2);
	}

	@Override
	public double Volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}