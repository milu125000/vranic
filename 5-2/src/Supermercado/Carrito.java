package Supermercado;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class  Carrito {

	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private ArrayList<ItemCarrito> stItem;
	
	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora, ArrayList<ItemCarrito> stItem) {
		
		this.idCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.stItem = stItem;
	}
	public int getIdCarrito() {
		return idCarrito;
	}
	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public ArrayList<ItemCarrito> getStItem() {
		return stItem;
	}
	public void setStItem(ArrayList<ItemCarrito> stItem) {
		this.stItem = stItem;
	}
	
	
	
	
	
	
}
