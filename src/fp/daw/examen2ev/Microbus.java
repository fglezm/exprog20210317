package fp.daw.examen2ev;

public class Microbus extends Veh�culo {

	private int plazas;
	private double precio = precioBase + 2.0;
	double alquiler;

	public Microbus(String matr�cula, double precioBase, double precio, int plazas) {
		super(matr�cula, precioBase);
		this.plazas = plazas;
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	@Override
	public String toString() {
		return "Microbus [plazas=" + plazas + ", " + super.toString() + " precio: " + precio + " alquiler= " + alquiler
				+ "]";
	}

	@Override
	public void getPrecioAlquiler(int d�as) {

		alquiler = (d�as * plazas * precio);
		System.out.println(toString());
	}

}
