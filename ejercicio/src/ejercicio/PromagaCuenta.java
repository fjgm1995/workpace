package ejercicio;

import java.util.Set;

public class PromagaCuenta {

	public static void main(String[] args) {
		CuentaVista cuenta1 = new CuentaVista();
		cuenta1.setsaldo(100000);
		cuenta1.setGiromaximo(50000);
        cuenta1.depositar(20000);
        cuenta1.girar(10000);
        
        
        
	}

}
