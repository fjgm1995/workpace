package hilos;

public class Contador {

	public static void main(String[] args) {
		
	int Contador; 
			
	}

	private int contador;

	private Contador(Contador contador) {
      this.setContador(this.getContador() + 1); 
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	

}
