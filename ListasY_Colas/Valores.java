package EjTN;

import java.util.ArrayList;
import java.util.LinkedList;

public class Valores {

	private LinkedList<Integer> listaValores;
	
	public Valores() {
		listaValores = new LinkedList<Integer>();
	}
	public void agregarValor(Integer entero) {
		listaValores.add(entero);
	}
	public int getCantidadElementos() {
		return listaValores.size();
	}
	public ArrayList<Boolean> pertenencia(Valores valores){
		ArrayList<Boolean> arrayList = new ArrayList<Boolean>(valores.getCantidadElementos());
		for(Integer integer : valores.listaValores)
			arrayList.add((listaValores.indexOf(integer)!=-1)? Boolean.TRUE : Boolean.FALSE);
		return arrayList;
	}
	
}
