package fp.daw.examen2ev;

public class Furgoneta extends Veh�culo {

	private int pma;
	private double precio = precioBase + 20.0;
	double alquiler;

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
		return "Furgoneta [pma= " + " " + pma + " " + super.toString() + ", Precio= " + precio + " alquiler= "
				+ alquiler + "]";
	}

	@Override
	public void getPrecioAlquiler(int d�as) {

		alquiler = (d�as * pma * precio);
		System.out.println(toString());
	}

}
