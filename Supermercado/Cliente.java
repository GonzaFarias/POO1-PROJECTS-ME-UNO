package Supermercado;

public class Cliente {

	private int posicion,cantidad;
	
	public Cliente(int cantidad) {
		this.posicion=0;
		this.cantidad=cantidad;
	}
	public void setPosicion(int posicion) {
		this.posicion=posicion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public int getPosicion(){
		return posicion;
	}
	public void setCantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	public String toString() {
		return "["+posicion+" = "+cantidad+"]";
	} 
}
