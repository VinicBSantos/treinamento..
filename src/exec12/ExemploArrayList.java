package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {

		// criar objeto array list
		List<String> arrayList = new ArrayList<String>();

		// adicionar elementos ao final da lista
		arrayList.add("elemento n°1");
		arrayList.add("elemento n°2");
		arrayList.add("elemento n°3");

		System.out.println("posição 1 contem: " + arrayList.get(0));
		System.out.println("posição 2 contem: " + arrayList.get(1));
		System.out.println("posição 3 contem: " + arrayList.get(2));

		for (String s : arrayList) {
			System.out.println(s);
		}

		// tambem podemos adicionar um elemento sob um posição qualquer
		arrayList.add(1, "elemento n°1,5");
		System.out.println("\nApos adicionar o elemento 1,5\n");

		for (String s : arrayList) {
			System.out.println(s);
		}

		// obter tamanho da lista
		System.out.println("\nO tamanho da lista é: " + arrayList.size() + "\n");

		// podemos ver um determinado valor na lista
		if (arrayList.contains("elemento n°1,5")) {
			System.out.println("o elemento 1,5 existe");
		} else {
			System.out.println("o elemento 1,5 não existe");
		}

		int indice = arrayList.indexOf("elemento n°1,5");
		System.out.println("\nO indice do elemento 1,5 é: " + indice);
		
		//remover elemento da lista(elemento 1,5)
		System.out.println("removendo elemento n°1,5");
		arrayList.remove("elemento n°1,5");
		System.out.println("lista atualizada!");
		
		for(String s: arrayList) {
			System.out.println(s);
		}
		 //removendo com indice
		System.out.println("Removendo o ultimo elemento");
		arrayList.remove(arrayList.size()- 1);
		System.out.println("lista atualizada");

		for(String s: arrayList) {
			System.out.println(s);
		}
		
		//adicionando elementos na lista
		System.out.println("\nAdicionando elementos na lista\n");
		arrayList.add("elemento n°5");
		arrayList.add("elemento n°9");
		arrayList.add("elemento n°4");
		arrayList.add("elemento n°0");
		arrayList.add("elemento n°8");
		
		//exibir lista atualizada
System.out.println("\nLista atualizada\n");
		for(String s: arrayList) {
			System.out.println(s);
		}
	//ordenando a lista
		Collections.sort(arrayList);
		System.out.println("\nLista Ordenada\n");
		for(String s: arrayList) {
			System.out.println(s);
		}
		
	//criando uma lista de objeto filme
		list<Filme> arrayListFilme = new ArrayList<Filme>();
		
		//criando filmes
		Filme filme1 = new Filme();
		filme1.setCodigo(1);
		filme1.setNome("Matrix");
		
		Filme filme2 = new Filme();
		filme2.setCodigo(2);
		filme2.setNome("Star Wars");
		
		Filme filme3 = new Filme();
		filme3.setCodigo(3);
		filme3.setNome("Sonic");
		
	}

}
