package com.caiquecodesd.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];	
	}

	/*public void adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				this.tamanho = 0;
				break;
			}
		}
	}*/

	/*public void adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor cheio, não é possível adicionar novos elementos.");
		}

	}*/

	public boolean adiciona(String elemento) {

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

}
