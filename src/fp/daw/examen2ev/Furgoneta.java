package fp.daw.examen2ev;

public class Furgoneta extends Veh�culo {

	private int pma;
	private double precio = precioBase + 20.0;

	public Furgoneta(String matr�cula, double precioBase, double precio, int pma) {
		super(matr�cula, precioBase);
		this.precio = precio;
		this.pma = pma;
	}

	public int getPma() {
		return pma;
	}

	@Override
	public String toString() {
		return "Furgoneta [pma=" + pma + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void getPrecioAlquiler(int d�as) {
		double alquiler;
		alquiler = (d�as * pma * precio);
	}

}
