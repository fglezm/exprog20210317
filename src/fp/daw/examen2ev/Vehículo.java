package fp.daw.examen2ev;

public abstract class Veh�culo implements PrecioAlquiler {

	private String matr�cula;
	public double precioBase = 50;

	public Veh�culo(String matr�cula, double precioBase) {
		this.matr�cula = matr�cula;
		this.precioBase = precioBase;
	}

	public String getMatr�cula() {
		return matr�cula;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	@Override
	public String toString() {
		return "matr�cula=" + matr�cula + ", precioBase=" + precioBase;
	}

}
