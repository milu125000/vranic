package Supermercado;



public class ItemCarrito{
	protected int idItem;
	protected Producto producto;
	protected int cantidad;
	
	
	public ItemCarrito (int idItem, Producto producto2, int cantidad) {
		
		
		this.idItem = idItem;
		this.producto = producto2;
		this.cantidad = cantidad;
		
		
	}


	public int getIdItem() {
		return idItem;
	}


	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}



	public Producto getProductos() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
}
