package cl.curso.java.abstrac.factory;

public class App {

    public static void main( String[] args )
    {
    	
    	String plataform = 
    			System.getProperty("os.name").toLowerCase();
    	
    	System.out.println(plataform);
    	GUIBuilder builder = new GUIBuilder();
    	if(plataform.startsWith("win"))
    		builder.builWindow(new MSWindowWidgetFactory());
    	
    	
    	
       
    
    }
}
