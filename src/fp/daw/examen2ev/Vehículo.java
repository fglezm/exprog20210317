package fp.daw.examen2ev;

public abstract class Vehículo implements PrecioAlquiler {

	private String matrícula;
	public double precioBase = 50;

	public Vehículo(String matrícula, double precioBase) {
		this.matrícula = matrícula;
		this.precioBase = precioBase;
	}

	public String getMatrícula() {
		return matrícula;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	@Override
	public String toString() {
		return "Vehículo [matrícula=" + matrícula + ", precioBase=" + precioBase + "]";
	}
}
