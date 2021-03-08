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
		for (int x = 0; x <= asientos.length; ++x) {
			if ((motor.registro != this.registro) || (motor.registro != asientos[x].registro) || this.registro != asientos[x].registro) {
				String msg = "Las piezas no son originales";
			}
			else {
				String msg = "Auto original";
			}
		}
	}
		
}
