package cl.curso_java.guia1;

public class Motor {

	int caballosDeFuerza;
	String tipo;
	boolean en7

	public Motor() {
		this.caballosDeFuerza = 1000;
	}

	public Motor(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;

	}

	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public Motor(int caballosDeFuerza, string tipo) {
		super();
		this.caballosDeFuerza = caballosDeFuerza;
		this.tipo = tipo;
	}
	 

}
