package prueba_cinco.fgonzalez;

import java.util.Date;

public class Transaccion {

	private static String id;
    private static String tipo; 
    private Date fecha; 
    private static int monto;
	
    public static String getId() {
		return id;
	}
	public static void setId(String id) {
		Transaccion.id = id;
	}
	public static String getTipo() {
		return tipo;
	}
	public static void setTipo(String tipo) {
		Transaccion.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public static int getMonto() {
		return monto;
	}
	public static void setMonto(int monto) {
		Transaccion.monto = monto;
	}

 
 	     
		 
       
        
        
	}

