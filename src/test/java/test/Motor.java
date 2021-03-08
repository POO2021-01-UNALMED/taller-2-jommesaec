package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	public void cambiarRegistro(int numeroRegistro) {
		registro = numeroRegistro;
	}
	
	public void asignarTipo(String tipoMotor) {
		if (tipoMotor != "electrico" | tipoMotor != "gasolina") {
			tipo = tipoMotor;
		}
			
	}
}
