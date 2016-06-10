import javax.swing.JOptionPane;

public class cuadroDeDialogos {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "hola mundo"); 
		
		String valoringresado = JOptionPane.showInputDialog("ingrese un valor"); 
	    JOptionPane.showMessageDialog(null, valoringresado);
	   
	    String nota1 = JOptionPane.showInputDialog("ingrese nota 1");
	    String nota2 = JOptionPane.showInputDialog("ingrese nota 2");
	    String nota3 = JOptionPane.showInputDialog("ingrese nota 3");

	    int n1 = Integer.parseInt(nota1); 
	    int n2 = Integer.parseInt(nota2); 
	    int n3 = Integer.parseInt(nota3); 
	    
	    JOptionPane.showMessageDialog(null, n1+ n2+ n3);
	    
	    int promedio = (n1+n2+n3)/3; 
	    
	    JOptionPane.showMessageDialog(null, promedio);
        	
	
	
	}
	
}