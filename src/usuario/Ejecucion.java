package usuario;
import java.util.Scanner;

import negocio.* ;


public class Ejecucion {
	private static AgenciaAutos agencia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		agencia = new AgenciaAutos();
		String opcion = "";
		
		do {
			System.out.println(" i ingresar auto");
			System.out.println(" c calcular ganancia individual");
			System.out.println(" e eliminar");
			System.out.println(" t calcular total");
			System.out.println("Ingrese una opción: ");
			
			opcion = sc.next();
			if(opcion.equals("i")) {
				agregarAuto();
			}else if (opcion.equals("c")) {
				calcularGananciaIndividual();
				
			}
			
		}while(!opcion.equals("s"));

	}
	public static void agregarAuto() {
		Scanner sc = new Scanner(System.in);
		String tipo;
		
		System.out.println("Ingrese el tipo de auto que quiere crear (i importado/ n nacional");
		tipo = sc.next();
		
		if(tipo.equals("n")){
			Nacional a = new Nacional();
			
			System.out.println("Ingrese el codigo del auto: ");
			a.setId(sc.nextInt());
			
			System.out.println("Ingrese la marca del auto: ");
			a.setMarca(sc.next());
			
			System.out.println("Ingrese el modelo del auto:");
			a.setModelo(sc.next());
			
			System.out.println("Ingrese el precio de venta: ");
			a.setPrecioVenta(sc.nextDouble());
			
			System.out.println("Ingrese el costo de fabricación: ");
			a.setCostoFabricacion(sc.nextDouble());
			agencia.agregarAuto(a);
			
		}else if(tipo.equals("i")) {
			Importado a = new Importado();
			
			System.out.println("Ingrese el codigo del auto: ");
			a.setId(sc.nextInt());
			
			System.out.println("Ingrese la marca del auto: ");
			a.setMarca(sc.next());
			
			System.out.println("Ingrese el modelo del auto:");
			a.setModelo(sc.next());
			
			System.out.println("Ingrese el precio de venta: ");
			a.setPrecioVenta(sc.nextDouble());
			
			System.out.println("Ingrese el impuesto: ");
			a.setImpuesto(sc.nextDouble());
			
			agencia.agregarAuto(a);
		}else {
			System.out.println("Debe ingresar un tipo correcto (i o n)");
		}
		
		
	}
	
	public static void calcularGananciaIndividual() {
		int codigoAuto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el código del auto para calcular la ganancia individual: ");
		codigoAuto = sc.nextInt();
		
		System.out.println("La ganancia del auto: " + codigoAuto + "es: " + agencia.calcularGanancia(codigoAuto));
	}

}
