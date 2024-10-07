package com.caiquecodesd.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Batman");
        arrayList.add("Superman");
        arrayList.add(1, "Flash");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("Batman");

        System.out.println(existe);

        if (existe) {
            System.out.println("O elemento existe no array");
        } else {
            System.out.println("O elemento não está presente no array");
        }

        int posicao = arrayList.indexOf("Batman");

        if (posicao > -1) {
            System.out.println("O elemento existe no array | Posição: " + posicao);
        } else {
            System.out.println("O elemento não está presente no array");
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(1);

        System.out.println(arrayList);
        System.out.println(arrayList.size());

    }

}
