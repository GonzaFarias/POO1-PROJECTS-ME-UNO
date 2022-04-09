package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Diccionario {
	
	public Map<Cuadrante, Integer> puntosEnCuadrantes(ArrayList<Punto> punto) {
		
		Map<Cuadrante, Integer> mapa = new TreeMap<Cuadrante,Integer>(); 
		
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		
		for (int i = 0; i < punto.size(); i++) {
            
			if(punto.get(i).EjeX() >= 0 && punto.get(i).EjeY() >= 0) {
				contador1++;
			}
			else if(punto.get(i).EjeX() < 0 && punto.get(i).EjeY() < 0) {
				contador3++;
			}
			else if(punto.get(i).EjeX() >= 0 && punto.get(i).EjeY() < 0) {
				contador4++;
			}
			else if(punto.get(i).EjeX() < 0 && punto.get(i).EjeY() >= 0) {
				contador2++;
			}    
        }
		mapa.put(new Cuadrante(1), contador1);
		mapa.put(new Cuadrante(2), contador2);
		mapa.put(new Cuadrante(3), contador3);
		mapa.put(new Cuadrante(4), contador4);

		return mapa;
	}
	
	
	public Map<String, String> obtenerDiccionario() {
		//modificarlo si fuera necesario para hacer más y mejores pruebas
		Map<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("amistad", "friendship");
		diccionario.put("la", "the");
		diccionario.put("el", "the");
		diccionario.put("uno", "one");
		diccionario.put("vida", "life");
		diccionario.put("buenos", "good");
		diccionario.put("importantes", "important");
		diccionario.put("más", "most");
		diccionario.put("tener", "to have");
		diccionario.put("pueden", "can");
		diccionario.put("difíciles", "difficult");

		return diccionario;
	}
	
	public static void main(String[] args) {
		
		Diccionario dicc = new Diccionario();
		
		Punto a = new Punto(4,5);
		Punto b = new Punto(-4,5);
		Punto c = new Punto(-4,-5);
		Punto d = new Punto(4,5);
		Punto e = new Punto(4,-5);
		Punto f = new Punto(-4,5);
		Punto g = new Punto(4,-5);
		Punto h = new Punto(4,5);
		Punto i = new Punto(-4,5);

		ArrayList<Punto> puntos = new ArrayList<Punto>();
		
		puntos.add(a);
		puntos.add(b);
		puntos.add(c);
		puntos.add(d);
		puntos.add(e);
		puntos.add(f);
		puntos.add(g);
		puntos.add(h);
		puntos.add(i);

		Map<Cuadrante,Integer> mapa = dicc.puntosEnCuadrantes(puntos);
		System.out.println(mapa);
	}

}
