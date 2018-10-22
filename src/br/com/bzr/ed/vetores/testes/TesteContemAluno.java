package br.com.bzr.ed.vetores.testes;

import br.com.bzr.ed.Aluno;
import br.com.bzr.ed.vetores.Vetor;

public class TesteContemAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno aluno = new Aluno();

		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1) + " - ALUNO a1 = " + a1);
		System.out.println(lista.contem(a2) + " - ALUNO a2 = " + a2);
		
		
		aluno.setNome("Ana");
		//System.out.println(lista.contem(aluno)); // nao esta dentro do vetor lista
	}
}
