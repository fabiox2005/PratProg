package Ex01;

public class Cubo extends Quadrado {

	public Cubo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double Area() {
		return (getBase()*12);
	}

	@Override
	public double Perimetro() {
		return Math.pow(getBase(),2);
	}

	@Override
	public double Volume() {
		return Math.pow(getBase(),3);
	}

}
