package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws IOException{
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			String linea = in.readLine();
			System.out.print("calculadora> ");
			while (!(linea=in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.print("calculadora> ");
			}
		}
		catch(Exception e){ e.printStackTrace();}
		
		
	String calcular; 
	{
		String linea = null;
		Scanner s=new Scanner(linea);
		
		/*
		 * completa aquí este método para resolver el problema
		 */
		s.close();
	}
	}

	private static void calcular(String linea) {
		// TODO Auto-generated method stub

	}

}
