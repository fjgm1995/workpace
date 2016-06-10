package cl.curso.java.abstrac.factory;

public class GUIBuilder {
	
	public Window builWindow(AbstractWidgetFactory factory){
		return factory.createWindow();
	}
	else
	{
		builder.bueldWindow(new MacOSXWidgetFactory());
	  }
	}
}
