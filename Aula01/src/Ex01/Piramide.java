package Ex01;

public class Piramide extends Poligono implements Diagonal {

	public Piramide(double base, double altura, double comprimento) {
		super(base, altura);
		// TODO Auto-generated constructor stub
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
