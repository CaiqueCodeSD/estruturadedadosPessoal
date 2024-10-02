package com.caiquecodesd.estruturadados.vetor.teste;
 
import com.caiquecodesd.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

		vetor.adiciona("Aa");
		vetor.adiciona("Bb");
		vetor.adiciona("Cc");
		vetor.adiciona("Dd");
		vetor.adiciona("Ee");
		vetor.adiciona("Ff");
		vetor.adiciona("Gg");
		
		System.out.println(vetor);
		System.out.println(vetor.tamanho());
		
		vetor.remover(1);
		
		System.out.println(vetor);
		System.out.println(vetor.tamanho());
		
		vetor.remover(0);
		
		System.out.println(vetor);
		System.out.println(vetor.tamanho());
		
		int pos = vetor.busca("Ff");
		if (pos > -1) {
			vetor.remover(pos);
		} else {
			System.out.println("Elemento não existe");
		}
		
		System.out.println(vetor);
		System.out.println(vetor.tamanho());
		
	}
	
}
