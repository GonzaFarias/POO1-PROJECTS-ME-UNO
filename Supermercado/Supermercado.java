package Supermercado;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Supermercado {

	private ConcurrentLinkedQueue<Cliente> colaA;
	private ConcurrentLinkedQueue<Cliente> colaB;

	
	public Supermercado() {
		colaA = new ConcurrentLinkedQueue<Cliente>();
	}
	
	public boolean isVacioColaA() {
		return colaA.isEmpty();
	}
	public void agregarClienteColaA(Cliente cliente) {
		cliente.setPosicion(this.getCantidadClientesColaA()+1);
		colaA.offer(cliente);
	}
	public void agregarClienteColaB(Cliente cliente) {
		cliente.setPosicion(this.getCantidadClientesColaA()+1);
		colaA.offer(cliente);
	}
	public int getCantidadClientesColaA() {
		return colaA.size();
	}
	public int getCantidadClientesColaB() {
		return colaB.size();
	}
	public void abrirColaB() {
		colaB=new ConcurrentLinkedQueue<Cliente>();
	}
	public void reorganizarColas() {
		this.abrirColaB();
		ConcurrentLinkedQueue<Cliente> colaAux = new ConcurrentLinkedQueue<>();
		while(!colaA.isEmpty()) {
			Cliente cli = colaA.poll();
			if(cli.getCantidad()<5)
				this.agregarClienteColaB(cli);	
			else colaAux.offer(cli);
		}
		while(!colaAux.isEmpty())
			this.agregarClienteColaA(colaAux.poll());
	}
	public String getColaAAsString() {
		return getColaAsString(colaA);
	} 
	public String getColaBAsString() {
		return getColaAsString(colaB);
	}
	private static String getColaAsString(ConcurrentLinkedQueue<Cliente> cola) {
		String representacion="";
		if(!cola.isEmpty()) {
			Cliente cli = cola.poll();
			int marca = cli.getPosicion();
			representacion+=cli;
			cola.offer(cli);
			while(cola.peek().getPosicion() != marca) {
				 cli = cola.poll();
				 representacion+=cli;
				 cola.offer(cli);
			}
		}
		return representacion;
	}
	}
