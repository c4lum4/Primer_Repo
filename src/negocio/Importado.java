package negocio;

public class Importado extends Auto {
	private double impuesto;
	
	public Importado(int id, String marca, String modelo, double precioVenta, double impuesto) {
		super(id, marca,modelo,precioVenta);
		this.impuesto = impuesto;
	}
	public Importado() {
		super();
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public double calcularGanancia() {
		return super.precioVenta + this.impuesto;
	}
		
}
