package fp.daw.examen2ev;

public final class Cami�n extends Veh�culo {

	private int pma;
	private double precio = precioBase + 20.0;
	public double alquiler;

	public Cami�n(String matr�cula, double precioBase, double precio, int pma) {
		super(matr�cula, precioBase);
		this.pma = pma;
		this.precio = precio;
	}

	public int getPma() {
		return pma;
	}

	@Override
	public String toString() {
		return "Cami�n [pma=" + pma + super.toString() + ", Precio= " + precio + "alquiler= " + alquiler + "]";
	}

	@Override
	public void getPrecioAlquiler(int d�as) {

		alquiler = (d�as * pma * precio) + 40.0;
	}
}
