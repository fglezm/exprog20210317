package fp.daw.examen2ev;

public final class Camión extends Vehículo {

	private int pma;
	private double precio = precioBase + 20.0;
	public double alquiler;

	public Camión(String matrícula, double precioBase, double precio, int pma) {
		super(matrícula, precioBase);
		this.pma = pma;
		this.precio = precio;
	}

	public int getPma() {
		return pma;
	}

	@Override
	public String toString() {
		return "Camión [pma=" + pma + super.toString() + ", Precio= " + precio + "alquiler= " + alquiler + "]";
	}

	@Override
	public void getPrecioAlquiler(int días) {

		alquiler = (días * pma * precio) + 40.0;
	}
}
