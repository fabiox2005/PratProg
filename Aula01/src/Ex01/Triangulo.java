package Ex01;

public class Triangulo extends Poligono implements Diagonal{

	private double ladoA, ladoB;
	
	public Triangulo(double base, double altura, double ladoA, double ladoB) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	public double getladoA() {
		return ladoA;
	}

	public void setladoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getladoB() {
		return ladoB;
	}

	public void setladoB(double ladoB) {
		this.ladoB = ladoB;
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
    
}