package com.caiquecodesd.estruturadados.vetor.teste;

import com.caiquecodesd.estruturadados.vetor.Vetor;

public class aula04 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(7);

		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		vetor.adiciona("Elemento 4");
		vetor.adiciona("Elemento 5");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
		
	}
	
}
