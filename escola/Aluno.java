package br.oberdan.brincando.escola;

public class Aluno {

	private String nomeAluno;
	private String matriculaAluno;
	private double[] notas;

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia(double[] notas) {
		double media = 0;
		for (int i = 0; i < notas.length; i++) {

			media = media + notas[i];
		}
		return media = media / 4;
	}
	
	public static double calcularMediaTurma(double mediaTurma){
		return mediaTurma / 5;
	}
}
