package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String colorAsiento) {
		String[] colors = {"rojo","verde","amarillo","negro","blanco"};
		for(String x : colors) {
			if(x.equals(colorAsiento)) {
				color = colorAsiento;
			}
		}
	}
}
