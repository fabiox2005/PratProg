package Ex01;

import java.util.ArrayList;

public class Geometria {

	public Geometria() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(5));
		figuras.add(new Triangulo(4, 3.4641, 4, 4));
		figuras.add(new Quadrado(5, 5));
		figuras.add(new Retangulo(10, 5));
		figuras.add(new Losango(5, 5));
		figuras.add(new Trapezio(5, 8, 4, 4, 10));
		figuras.add(new Cubo(5, 5));
		figuras.add(new Esfera(5));
		figuras.add(new Cilindro(4, 10, 10));
		figuras.add(new Triangulo(5, 5, 5, 5));

		for (Figura fig : figuras) {
			System.out.println("\n\n***********************************\n" + fig.getClass().getSimpleName());
			System.out.println("\nArea: " + fig.Area());
			System.out.println("Perimetro: " + fig.Perimetro());
			if (fig instanceof Diagonal) {
				System.out.println("Diagonal: " + ((Diagonal) fig).diagonal());
			}
			if (fig instanceof Cubo) {
				System.out.println("volume: " + fig.Volume());
			}
			if (fig instanceof Esfera) {
				System.out.println("volume: " + fig.Volume());
			}
			if (fig instanceof Cilindro) {
				System.out.println("volume: " + fig.Volume());
			}
		}
	}

}
