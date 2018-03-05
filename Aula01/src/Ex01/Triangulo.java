package Ex01;

public class Triangulo extends Poligono implements Diagonal{

	private double ladoA, ladoB;
	
	public Triangulo(double base, double altura, double ladoA, double ladoB) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Area() {
		return ( getBase() * getAltura() ) / 2;
	}

	@Override
	public double Perimetro() {
		return ( getBase() + ladoA + ladoB);
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