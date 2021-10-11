package EjTN;

import java.util.ArrayList;

public class Listas_Coleccion {

	    public static void main(String[]args) {

	    ArrayList<String> vector = new ArrayList<String>();
	    System.out.println(vector.size());
	    vector.add("Medialuna");
	    System.out.println(vector.size());
	    vector.add("Cafe Cortado");
	    System.out.println(vector.size());
	    vector.remove(0);
	    System.out.println(vector.size());
	    vector.remove("Cafe Cortado");
	    System.out.println(vector.size());
//	    vector.remove(3);

	    ArrayList<Integer> VectorInteger = new ArrayList <Integer>();

	    ArrayList<Boolean> vectorBoolean = new ArrayList <Boolean>(30);
	    vectorBoolean.add(Boolean.TRUE);

	    ArrayList<ArrayList<Character>> VectorArrayListCharacter = new ArrayList<ArrayList<Character>>();

	    ArrayList<Character> VectorCaracter1 = new ArrayList<Character>();
	    VectorCaracter1.add('a');
	    VectorCaracter1.add('b');
	    VectorCaracter1.add('c');


	    ArrayList<Character> VectorCaracter2 = new ArrayList<Character>();
	    VectorCaracter2.add('d');
	    VectorCaracter2.add('e');
	    VectorCaracter2.add('f');

	    VectorArrayListCharacter.add(VectorCaracter1);
	    VectorArrayListCharacter.add(VectorCaracter2);

	    System.out.println(VectorArrayListCharacter.get(0).get(1));

	    for(ArrayList<Character> a: VectorArrayListCharacter) {
	        for(Character c: a)

	            System.out.print(c + " ");

	        System.out.println();
	    }


	    for(int i = 0; i < VectorArrayListCharacter.size(); i++) {
	        for(int j = 0; j < VectorArrayListCharacter.get(i).size(); j++)

	            System.out.print(VectorArrayListCharacter.get(i).get(j) + " ");

	        System.out.println();
	    }



	    }
}
