package fp.daw.examen2ev;

public class Microbus extends Vehículo {

	private int plazas;
	private double precio = precioBase + 2.0;

	public Microbus(String matrícula, double precioBase, double precio, int plazas) {
		super(matrícula, precioBase);
		this.plazas = plazas;
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	@Override
	public String toString() {
		return "Microbus [plazas=" + plazas + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void getPrecioAlquiler(int días) {
		double alquiler;
		alquiler = (días * plazas * precio);
	}

}
