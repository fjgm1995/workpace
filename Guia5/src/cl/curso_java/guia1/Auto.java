package cl.curso_java.guia1;

 public class Auto  
 {
	String color ;
	String marca ; 
	String patente ;
	Motor motor; 
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void avanzar()
	{
		System.out.println("avanzar");
	}

	public Auto() 
	{
		color = "azul";
		marca = "honda";
		patente = "fjgm21";
		
	}
public Auto(String color, String marca, String patente)
{
	this.color = color;
	this.marca = marca;
	this.patente = patente; 
}
	public void Avanzar()
	{
		System.out.println("avanzar"+ this.marca);
	}
	
	public void encerder()
	{
		this.motor.
	}
}
	
	
	

