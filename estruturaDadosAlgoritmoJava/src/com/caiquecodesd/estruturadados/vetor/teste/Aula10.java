package com.caiquecodesd.estruturadados.vetor.teste;

import com.caiquecodesd.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    
    public static void main(String[] args) {
        
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Wilson", "123", "wilson@email.com");
        Contato c2 = new Contato("Guts", "456", "guts@email.com");
        Contato c3 = new Contato("Leon", "789", "leon@email.com");
        Contato c4 = new Contato("Leon", "789", "leon@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho: " + vetor.tamanho());

        System.out.println(vetor);

        int pos = vetor.busca(c4);

        if (pos > -1) {
            System.out.println("O elemento existe no vetor");
        } else {
            System.out.println("O elemento não existe no vetor");
        }

    }

}
