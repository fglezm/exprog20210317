package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAlquiler {

	
	public static void main(String[] args) {

		Scanner t=new Scanner(System.in);
		System.out.println("�Cu�ntos d�as? ");
		int d�as=t.nextInt();
		
		ArrayList<PrecioAlquiler> alquileres = new ArrayList<>();
		alquileres.add(new Cami�n("0211BBB", 50, 70, 10));
		

		for (PrecioAlquiler p : alquileres)
			System.out.println(p.toString());
	}

}
