package Supermercado;
import java.util.ArrayList;





public class Supermercado {

	private ArrayList<Producto> gondola ;


	public Supermercado() {
		
		this.gondola = new ArrayList<Producto>();
	}
	

 	public ArrayList<Producto> getGondola() {
		return gondola;
	}

	public void setGondola(ArrayList<Producto> gondola) {
		this.gondola = gondola;
	}
	
	public boolean agregarProducto (String producto, float precio)
	{
		int i = 0;
		Producto p = new Producto(i, producto, precio);
		
		if (gondola.isEmpty())  {gondola.add(p);return true;}
		
		
		
		while (i < gondola.size())
		{
			if(gondola.contains(p)) {throw new ArithmeticException("Contenido repetido") ;}
			i++;
			p.setIdProducto(i);
		}
		
		gondola.add(p);
		return true;
	}

	
	
}
