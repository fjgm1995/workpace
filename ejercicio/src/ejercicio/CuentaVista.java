package ejercicio;
;
public class CuentaVista {
	private int saldo;
	private int giromaximo;
		
	public CuentaVista()
	{
		this.saldo = 0;
		this.giromaximo = 200000;
	}

	public CuentaVista (int saldo,int giromaximo )
	{
		this.saldo = saldo;
		this.giromaximo = giromaximo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getGiromaximo() {
		return giromaximo;
	}

	public void setGiromaximo(int giromaximo) {
		this.giromaximo = giromaximo;
	}
	
	public void depositar(int deposito)
		{	
		this.saldo=this.saldo + deposito; 
		}
	public void girar(int montoagirar)
	{
		if(montoagirar>this.saldo)
		{
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
		
	







}
	
