package fp.daw.examen2ev;

public class Coche extends Vehículo {

	private int plazas;
	private double precio = precioBase + 1.5;
	double alquiler;

	public Coche(String matrícula, double precioBase, double precio, int plazas) {
		super(matrícula, precioBase);
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
	public void getPrecioAlquiler(int días) {

		alquiler = (días * plazas * precio);
		System.out.println(toString());
	}

}
