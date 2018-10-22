package br.com.bzr.ed;

public class TesteContemAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();

		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1) + " - ALUNO a1 = " + a1);
		System.out.println(lista.contem(a2) + " - ALUNO a2 = " + a2);
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		System.out.println(lista.contem(aluno)); // nao esta dentro do vetor lista
	}
}
