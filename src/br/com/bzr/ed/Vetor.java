package br.com.bzr.ed;

import java.util.Arrays;


public class Vetor {
	private Object[] objetos = new Object[100];

	private int totalDeObjetos = 0;

	public void adiciona(Object objeto) {
		this.garantaEspaco();
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}

	public void adiciona(int posicao, Object objeto) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[i];
		}
		this.objetos[posicao] = objeto;
		this.totalDeObjetos++;
	}

	public Object pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.objetos[posicao];
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeObjetos--;
	}

	public void remove(Object objeto) {
		Vetor novoVetor = new Vetor();
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (!objeto.equals(objetos[i])) {
				novoVetor.adiciona(objetos[i]);
			}
		}
		this.objetos = novoVetor.objetos;
		this.totalDeObjetos = novoVetor.totalDeObjetos;
	}

	// Método "contem()" pela primeira maneira
	// public boolean contem(Object objeto) {
	// for (int i = 0; i < this.objetos.length; i++) {
	// if (objeto == this.objetos[i]) {
	// return true;
	// }
	// }
	// return false;
	// }

	// Método "contem()" pela segunda maneira
	public boolean contem(Object objeto) {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (objeto.equals(this.objetos[i])) {
				return true;
			}
		}
		return false;
	}

	public void clear() {
		this.objetos = new Object[100];
		this.totalDeObjetos = 0;
	}

	public int indexOf(Object objeto) {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (objeto.equals(objetos[i])) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(Object objeto) {
		for (int i = this.totalDeObjetos - 1; i >= 0; i--) {
			if (objeto.equals(objetos[i])) {
				return i;
			}
		}
		return -1;
	}

	public int tamanho() {
		return this.totalDeObjetos;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeObjetos;
	}

	private void garantaEspaco() {
		if (this.totalDeObjetos == this.objetos.length) {
			Object[] novaArray = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				novaArray[i] = this.objetos[i];
			}
			this.objetos = novaArray;
		}
	}

	@Override
	public String toString() {
		if (this.totalDeObjetos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		builder.append(this.objetos[this.totalDeObjetos - 1]);
		builder.append("]");
		return builder.toString();
	}
}
