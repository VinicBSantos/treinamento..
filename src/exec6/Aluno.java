package exec6;


public class Aluno {

	public static void main (String[]args) {
	
	String nome, curso, cidade, dataNasc, data;
	
	public Aluno(String nome, String curso, String cidade, String dataNasc) {
		
		this.nome = nome;
		this.curso = curso;
		this.cidade = cidade;
		this.dataNasc = dataNasc;
		
	}

	public void exibirTudo() {
		System.out.println(nome);
		System.out.println(curso);
		System.out.println(cidade);
		System.out.println(dataNasc);
	}
	}
}