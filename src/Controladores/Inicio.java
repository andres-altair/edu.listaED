package Controladores;

import java.util.ArrayList; //importa
import java.util.List;  //importa

public class Inicio {

	public static void main(String[] args) {

		//crear una lista de objeto y de tipo primitivo
		List objeto = new ArrayList();
		List lista = new ArrayList<String>();
		List lint = new ArrayList<Integer>();
		List lchar = new ArrayList<Character>();
		List lfloat = new ArrayList<Float>();
		
		//añadir elemeto a la lista
		objeto.add(objeto);
		objeto.add(lista);
		lista.add("listas");
		lista.add("lista2");
		lint.add(5);
		lchar.add("d");
		
		//recorrer lista
		/*1*/for(int indice = 0;indice<objeto.size();indice++)
		{
		    System.out.println(objeto.get(indice));
		}
		for(int indice = 0;indice<lint.size();indice++)
		{
		    System.out.println(lint.get(indice));
		} 
		/*2*/lista.forEach(System.out::println);
		lchar.forEach(System.out::println);
		
		//modificar elemento
		lista.set(0, "lista3");
		objeto.set(0, lista);
		
		//acceder a un elemento 
		lista.get(0);
		objeto.get(0);
		
		//eliminar elementos
		lista.remove(0);
		objeto.remove(0);
		lista.clear();
	
		

	}

}
