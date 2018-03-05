package Ex01;

public class Trapezio extends Poligono implements Diagonal {

	public Trapezio(double base, double altura, double ladoA) {
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

}
