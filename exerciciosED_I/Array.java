package exerciciosED_I;

import java.util.Scanner;

public class Array {
	
	
	public Array() {
		
	}
	
	static int[] vetor;
	
	//a. tamanho do vetor
	public void criaVetor(int tamanho) {
		Scanner in = new Scanner(System.in);
		vetor = new int[tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira o valor para o index [" + i  + "] -> ");
			vetor[i] = in.nextInt();
		}
	}
	
	//b. somar elementos do vetor
	public void somatorio() {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		System.out.println("Soma dos elementos -> " + soma);
	}
	
	//c. encontrar média dos valores
	public void media() {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		
		double media = (double)soma/vetor.length;
		System.out.println("Média -> " + media);
	}
	
	//d. obter elemento na posição desejada
	public void obtemElementoVetor(int posicao) {
		if (posicao < 0 || posicao > vetor.length) {
			System.out.println("Index Inválido!");
		} else {
			System.out.println("Elemento do Index[" + posicao + "] -> " + vetor[posicao]);
		}
	}
	
	//e. inserir elemento no vetor
	public void insereElementoVetor(int posicao, int elemento) {
		if (posicao < 0 || posicao > vetor.length) {
			System.out.println("Index Inválido!");
		} else {
			vetor[posicao] = elemento;
		}
	}
	
	//f. trocar elementos ímpares por 0
	public void substituiImparPorZero() {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				vetor[i] = 0;
			}
			//System.out.print(vetor[i] + "\t");
		}
	}
	
	//g. encontrar o maior elemento
	public void maiorElemento() {
		int maior = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("Maior elemento -> " + maior);
	}
	
	//h. encontrar o menor elemento
	public void menorElemento() {
		int menor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("Menor elemento -> " + menor);
	}
	
	//i. imprimir vetor
	public void imprimeVetor() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
	}
	
	public static void main(String[] args) {
		Array array = new Array();
		array.criaVetor(4);
		array.somatorio();
		array.media();
		array.obtemElementoVetor(2);
		array.insereElementoVetor(1, 2486);
		array.substituiImparPorZero();
		array.maiorElemento();
		array.menorElemento();
		array.imprimeVetor();
	}
	
}
