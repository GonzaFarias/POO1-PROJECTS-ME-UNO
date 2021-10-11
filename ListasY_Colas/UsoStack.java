package EjTN;
import java.util.Stack;

public class UsoStack {

	public static void main(String[] args) {
		
		Stack<String> pila= new Stack<String>();
		System.out.println(pila.isEmpty()); //true
		pila.push("Obrigado");
		pila.push("Thanks");
		pila.push("Gracias");
		System.out.println(pila.peek());
		pila.pop();
		System.out.println(pila.peek());
		
		Stack<String> pilaux = new Stack<String>();
		
		while(!pila.isEmpty()) {
			String dato = pila.pop();
			System.out.println(dato);	
			pilaux.push(dato);
	}
		while(!pila.isEmpty()) {
			pilaux.push(pilaux.pop());
	}

	}
}
