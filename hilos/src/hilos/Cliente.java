package hilos;



public class Cliente {

	private String nombre;
	private int[] carroCompramota;

	public Cliente() {
	}

	public Cliente(String nombre, int[] carroCompramota) {
		this.nombre = nombre;
		this.carroCompramota = carroCompramota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getCarroCompramota() {
		return carroCompramota;
	}

	public void setCarroCompra(int[] carroCompramota) {
		this.carroCompramota = carroCompramota;
		
	
	}
}
