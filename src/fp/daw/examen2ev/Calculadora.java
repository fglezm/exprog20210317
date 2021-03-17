package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String linea;
		Sy in.readLine()stem.out.print("calculadora> ");
		while (!(linea=in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.print("calculadora> ");
		}
		
	static void calcular(String Linea) {
		Scanner s=new Scanner(linea);
		
		/*
		 * completa aquí este método para resolver el problema
		 */
		s.close();
	}
	}

}
