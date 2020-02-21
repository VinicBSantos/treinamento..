package exec12;

import java.util.HashSet;

public class ExemploHashSet {
	
	public static void main (String[]args) {
		
		HashSet<String> listaString = new HashSet<String>();
		listaString.add("Madagascar");
		listaString.add("Fuga das Galinhas");
		listaString.add("A Era do Gelo");
		listaString.add("Matrix");
		
		System.out.println(listaString);
		
		HashSet<Integer> listaInt = new HashSet<Integer>();
		listaInt.add(13);
		listaInt.add(2);
		listaInt.add(30);
		listaInt.add(7);
		listaInt.add(5);
		
		System.out.println(listaInt);
	}

}
