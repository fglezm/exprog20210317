package fp.daw.examen2ev;

public class Coche extends Veh�culo {

	private int plazas;
	private double precio = precioBase + 1.5;

	public Coche(String matr�cula, double precioBase, double precio, int plazas) {
		super(matr�cula, precioBase);
		this.plazas = plazas;
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	@Override
	public String toString() {
		return "Coche [plazas=" + plazas + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void getPrecioAlquiler(int d�as) {
		double alquiler;
		alquiler = (d�as * plazas * precio);
	}

}
