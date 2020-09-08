package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.text.html.CSS;

import Supermercado.Supermercado;
import Supermercado.Producto;

public class test {
	public static void main(String argv[]) {
		
		//Scanner in = new Scanner(System.in);
		
		Supermercado supermercado = new Supermercado();
		
		

	
		 File file = new File("C:\\Users\\AIT\\Desktop\\Objects JAVA\\5-2\\productos.txt"); 
		 Scanner sc;  
		 try {
			 
				sc = new Scanner(file);
			 
				while (sc.hasNextLine()) 
				{
			
					if (!(sc.nextLine().isBlank())) {
					String auxiString = sc.next();
					var data = auxiString.split("/");
		            supermercado.agregarProducto(data[0],Integer.parseInt(data[1]));
				}}
				
			
			} 
		     catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
		
		 
		
		 int i = 0;
		 for (i=0 ; i< supermercado.getGondola().size(); i++)
		 {System.out.println(supermercado.getGondola().get(i).getProducto());}
	
		
      return;
		
	
	}
}