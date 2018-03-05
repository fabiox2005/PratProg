package Ex01;

import java.util.ArrayList;

public class Geometria {

	public Geometria() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(5));
		figuras.add(new Triangulo(5,5,5,5));
		figuras.add(new Quadrado(5,5));
		figuras.add(new Retangulo(10,5));
		figuras.add(new Losango(5,5));
		figuras.add(new Trapezio(5,10,4));
		
		for(Figura fig:figuras){
			System.out.println("\n"+fig.getClass().getSimpleName());
			System.out.printf("Area = %.2f %n",fig.Area());
			System.out.printf("Perimetro: %.2f %n",fig.Perimetro());
			if(fig instanceof Poligono){
				System.out.printf("Diagonal: %.2f %n",((Diagonal)fig).diagonal());
				//System.out.printf("Volume: %.2f %n",((Diagonal)fig).diagonal());
			}
		}

	}
	
}
