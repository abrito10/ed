package br.com.bzr.ed;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Jo�o");
		a2.setNome("Jos�");
		System.out.println( a1 );
		Vetor lista = new Vetor();
		
		lista.adiciona(0,a1);
		lista.adiciona(1,a2);
		
		System.out.println("lista = " + lista);
	}

}
