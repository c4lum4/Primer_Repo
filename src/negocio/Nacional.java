package negocio;

public class Nacional extends Auto {
	private double costoFabricacion;
	
	public Nacional(int id, String marca, String modelo, double precioVenta, double costoFabricacion) {
		super(id,marca,modelo,costoFabricacion);
		this.costoFabricacion = costoFabricacion;
		
		
	}
	public Nacional() {
		
	}
	public double getCostoFabricacion() {
		return costoFabricacion;
	}
	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}
	public double calcularGanancia() {
		return this.precioVenta + this.costoFabricacion;
	}

}
