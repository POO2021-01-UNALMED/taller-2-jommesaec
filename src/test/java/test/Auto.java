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
		String msg;
		for (int x = 0; x <= asientos.length; x++) {
			if (asientos[x] != null) {
				if ((motor.registro != this.registro) || (motor.registro != asientos[x].registro) || this.registro != asientos[x].registro) {
					msg = "Las piezas no son originales";
					
				}
				else {
					msg = "Auto original";
				}
			}
		}
		return msg;
	}
		
}
