package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos(){
		return asientos.length;
	}
	
	String verificarIntegridad() {
		boolean original;
		for (int x = 0; x <= asientos.length; x++) {
			if (asientos[x] != null) {
				if (asientos[x].registro == this.registro && this.registro == motor.registro) {
					original = true;
					
				}
			}
		}
		if (original){
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
		
}
