package fp.daw.examen2ev;

public abstract class VehÝculo implements PrecioAlquiler {

	private String matrÝcula;
	public double precioBase = 50;

	public VehÝculo(String matrÝcula, double precioBase) {
		this.matrÝcula = matrÝcula;
		this.precioBase = precioBase;
	}

	public String getMatrÝcula() {
		return matrÝcula;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	@Override
	public String toString() {
		return "matrÝcula=" + matrÝcula + ", precioBase=" + precioBase;
	}

}
