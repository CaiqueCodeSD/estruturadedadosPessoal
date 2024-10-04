package com.caiquecodesd.estruturadados.vetor.teste;

import com.caiquecodesd.estruturadados.vetor.Lista;

public class Aula11 {

    public static void main(String[] args) {
        
        Lista<String> vetor = new Lista<String>(1);

        vetor.adiciona("Guts");
        vetor.adiciona("Gandalf");
        vetor.adiciona("Bilbo");

        System.out.println(vetor);
        
    }

}
