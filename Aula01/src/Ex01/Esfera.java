package Ex01;

public class Esfera extends Circulo {

	public Esfera(double raio) {
		super(raio);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double Area() {
		return ((4 * Math.PI) * Math.pow(getRaio(), 2));
	}

	@Override
	public double Perimetro() {
		return 2 * Math.PI * this.getRaio();
	}

	@Override
	public double Volume() {
		return (((4/3)*Math.PI)* Math.pow(getRaio(), 3));
	}

}
