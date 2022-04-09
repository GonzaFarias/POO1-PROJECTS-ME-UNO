package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CuentaNumero {
	public Integer contarNumeros(String texto) {
		Integer cantidadNumeros = 0;
		String[] arrTexto;
		@SuppressWarnings("unused")
		Integer numero = 0;
		arrTexto=texto.split(" ");
		for(int i=0; i<arrTexto.length;i++) {
			try {
				 numero = Integer.parseInt(arrTexto[i]);
				 cantidadNumeros++;
			}
			catch(Exception a) {
			}
		}
		
		
		return cantidadNumeros;
	}
	
	public String obtenerTextoDeArchivo(String archivoEntrada) throws FileNotFoundException {
		String texto = "";
		
		Scanner sc = new Scanner(new File(archivoEntrada));
		String[] arrTexto;
		
		while (sc.hasNext()) {

			arrTexto = sc.nextLine().split(" ");
			for(int i=0;i<arrTexto.length;i++) {
				texto+=" "+arrTexto[i];
			}
			
		}
		sc.close();
				
		return texto;		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		CuentaNumero c = new CuentaNumero();
		System.out.print("La cantidad de numeros en el string es de: ");
		System.out.println(c.contarNumeros(c.obtenerTextoDeArchivo("src/archivosParcial/texto.in")));
	}
}
