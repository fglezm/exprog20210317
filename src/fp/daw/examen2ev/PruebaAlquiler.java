package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAlquiler {

	
	public static void main(String[] args) {

		Scanner t=new Scanner(System.in);
		System.out.println("¿Cuántos días? ");
		int días=t.nextInt();
		
		ArrayList<PrecioAlquiler> alquileres = new ArrayList<>();
		alquileres.add(new Camión("0211BBB", 50, 70, 10));
		

		for (PrecioAlquiler p : alquileres)
			System.out.println(p.toString());
	}

}
