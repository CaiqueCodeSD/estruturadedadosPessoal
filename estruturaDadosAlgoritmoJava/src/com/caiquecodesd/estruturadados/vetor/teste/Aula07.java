package com.caiquecodesd.estruturadados.vetor.teste;

import com.caiquecodesd.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("Bb");
		vetor.adiciona("Cc");
		vetor.adiciona("Dd");
		vetor.adiciona("Ff");
		vetor.adiciona("Gg");
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "Aa");
		
		System.out.println(vetor);
		
		vetor.adiciona(4, "Ee");
		
		System.out.println(vetor);
	}
	
}
