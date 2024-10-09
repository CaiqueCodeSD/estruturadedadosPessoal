package com.caiquecodesd.estruturadados.vetor.labs;

import com.caiquecodesd.estruturadados.vetor.Lista;

public class Ex01 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("Iron Man");
		lista.adiciona("Hulk");
		lista.adiciona("Spider Man");

		System.out.println(lista.contem("Spider Man"));
		System.out.println(lista.contem("Hulk"));
		System.out.println(lista.contem("Thanos"));
		
	}
	
}
