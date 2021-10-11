package EjTN;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UsoQueue {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<String> cola = new ConcurrentLinkedQueue<String>();
		System.out.println(cola.isEmpty());
		cola.offer("Obrigado");
		cola.offer("Thanks");
		cola.offer("Gracias");
		System.out.println(cola.isEmpty());
		cola.poll();
		System.out.println(cola.peek());
		
		ConcurrentLinkedQueue<String> colaux = new ConcurrentLinkedQueue<String>();
		while(!cola.isEmpty()) {
			String dato=cola.poll();
			System.out.println(dato);
			colaux.offer(dato);
		}
		while(!colaux.isEmpty()) 
			cola.offer(colaux.poll());
			
		cola.clear();
		cola.offer("aa");
		cola.offer("bb");
		cola.offer("cc");
		cola.offer("dd");
		cola.offer("ee");

		System.out.println("___________");
		if(!cola.isEmpty()) {
			String marca=cola.poll();
			System.out.println(marca);
			cola.offer(marca);
			while(!cola.peek().equals(marca)) {
				String dato = cola.poll();
				System.out.println(dato);
				cola.offer(dato);
			}
		}
	}
}
