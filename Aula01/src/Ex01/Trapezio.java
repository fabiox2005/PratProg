package Ex01;

public class Trapezio extends Poligono implements Diagonal {

	private double ladoA, ladoB, cima;

	public Trapezio(double base, double altura, double ladoA, double ladoB, double cima) {
		super(base, altura);
	}
	
	@Override
	public double Area() {
		return ( ((getBase() + cima) * getAltura())/2 );
	}

	@Override
	public double Perimetro() {
		return ( getBase() + cima + ladoA + ladoB);
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
