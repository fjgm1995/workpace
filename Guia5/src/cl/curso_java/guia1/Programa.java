package cl.curso_java.guia1;

public class Programa {

	public static void main(String[] args) {

		Auto Autotoyota = new Auto("azul", "toyota", "fjgm21");
		Motor motortoyota = new Motor(2000, "bencina");
		Autotoyota.setMotor(motortoyota);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Auto Autohonda = new Auto("negro", "honda", "aaa21");
		Auto Autodefecto = new Auto();
		Autotoyota.avanzar();
		System.out.println(Autotoyota.getColor());
		Autotoyota.setColor("verde");

		Autohonda.avanzar();
		Autodefect.avanzar();

	}
}
