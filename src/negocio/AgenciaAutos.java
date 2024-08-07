package negocio;
import java.util.ArrayList;

public class AgenciaAutos {
	private ArrayList<Auto>listaAutos = new ArrayList<Auto>();
	
	public void agregarAuto(Auto a) {
		this.listaAutos.add(a);
	}
	public double calcularGanancia(int id) {
		for(Auto a: this.listaAutos) {
			if(a.getId() == id) {
				return a.calcularGanancia();
			}
		}
		return 0;
	}
	public void eliminar(int id) {
		Auto a;
		for(int i = 0; i<this.listaAutos.size(); i ++) {
			a = this.listaAutos.get(i);
			if(a.getId() == id) {
				this.listaAutos.remove(i);
			}
		}
	}
	public double calcularGanancia() {
		double gananciaTotal = 0;
		
		for(Auto a: this.listaAutos) {
			gananciaTotal += a.calcularGanancia();
		}
		return gananciaTotal;
		
	}
 
}
