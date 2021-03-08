package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int numeroRegistro) {
		registro = numeroRegistro;
	}
	
	void asignarTipo(String tipoMotor) {
		if (tipoMotor.equals("electrico")) {
			this.tipo = "electrico";
		}
		else if (tipoMotor.equals("electrico")) {
			this.tipo = "gasolina";
		}
			
	}
}
