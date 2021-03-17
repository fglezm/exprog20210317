package fp.daw.examen2ev;

public class Coche extends Veh�culo {

	private int plazas;
	private double precio = precioBase + 1.5;
	double alquiler;

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
		return "Coche [plazas=" + plazas + ", " + super.toString() + " precio: " + precio + " alquiler= " + alquiler
				+ "]";
	}

	@Override
	public void getPrecioAlquiler(int d�as) {

		alquiler = (d�as * plazas * precio);
		System.out.println(toString());
	}

}
