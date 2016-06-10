package cl.curso_java.guia1;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example ejercicio = new example();
		int promedio = ejercicio.promedio(30,50,60);
		System.out.println( promedio );
	}
	public int promedio( int nota1,int nota2,int nota3)
	{
		int promedio = (nota1 + nota2 + nota3)/3;
		return promedio;
	}
}

