package negocio;

public class Auto {
	protected int id;
	protected String marca;
	protected String modelo;
	protected double precioVenta;
	
	public Auto(int id, String marca, String modelo, double precioVenta) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precioVenta = precioVenta;
	}
	public Auto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double calcularGanancia(){
		return precioVenta;
	}
	

}
