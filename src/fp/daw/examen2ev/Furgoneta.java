package fp.daw.examen2ev;

public class Furgoneta extends Vehículo {

	private int pma;
	private double precio = precioBase + 20.0;
	double alquiler;

	public Furgoneta(String matrícula, double precioBase, double precio, int pma) {
		super(matrícula, precioBase);
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
	public void getPrecioAlquiler(int días) {

		alquiler = (días * pma * precio);
		System.out.println(toString());
	}

}
