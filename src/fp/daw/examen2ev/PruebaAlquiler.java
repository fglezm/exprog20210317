package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAlquiler {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		System.out.println("¿Cuántos días? ");
		int días = t.nextInt();
		
		ArrayList<PrecioAlquiler> alquileres = new ArrayList<>();
		alquileres.add(new Camión("0211BBB", 50, 70, 10));
		alquileres.add(new Furgoneta("0022BBB", 50, 70, 1));
		alquileres.add(new Microbus("0011BBB", 50, 52, 10));
		alquileres.add(new Coche("0202BBB", 50, 51.5, 5));

		

		
		for (PrecioAlquiler p : alquileres)
			p.getPrecioAlquiler(días);

	}

	
}
