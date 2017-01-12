package br.oberdan.brincando.escola;

import java.util.Scanner;

public class TestaEscola {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ordem = 1;
		

		System.out.println("Digite o nome do curso: ");
		String nomeCurso = input.next(); // Recebe o nome do Curso
		System.out.println("Digite o horario do curso: ");
		String horarioCurso = input.next(); //Recebe o horario do curso
		
		System.out.println("Digite o Nome do Professor do curso: ");
		String nomeProfessor = input.next(); //Recebe o nome do professor
		System.out.println("Digite o Departamento do Professor: ");
		String departamento = input.next(); //Recebe o departamento do professor
		System.out.println("Digite o Email do Professor: ");
		String email = input.next(); //Recebe o email do professor
		
		Curso curso = new Curso(); //Instancia um novo objeto do tipo Curso
		curso.setNomeCurso(nomeCurso); //Altera o nome do objeto curso 
		curso.setHorarioCurso(horarioCurso); //Altera o horario do objeto curso
		
		Professor professor = new Professor(); //Instancia um objeto do tipo professor 
		professor.setNomeProfessor(nomeProfessor); //Altera o nome do professor 
		professor.setDepartamento(departamento); //Altera o departamento do professor 
		professor.setEmail(email); //Altera o email do professor
		
		curso.setProfessor(professor); //Relaciona a instancia do objeto professor ao objeto curso de 1 para 1
		
		Aluno[] alunos = new Aluno[5]; //Cria um vetor de alunos de 5 indices
		

		for (int i = 0; i < alunos.length; i++) {
			int ordemNotas = 1;
			Aluno aluno = new Aluno(); //Cria um objeto aluno dentro do looping, que será instanciado cada vez que rodar
			
			double[] notas = new double[4]; //ATENÇÃO
			
			System.out.print("Digite o nome do " + ordem + "º aluno: ");
			String nomeAluno = input.next();
			aluno.setNomeAluno(nomeAluno);
			
			System.out.print("Digite a matricula do " + ordem + "º aluno: ");
			String matriculaAluno = input.next();
			aluno.setMatriculaAluno(matriculaAluno);
			
			ordem++;
			for (int j = 0; j < notas.length; j++) {
				
				System.out.print("Digite a " +ordemNotas+ "º nota do aluno: ");
				double nota = input.nextDouble();
				notas[j] = nota;
				ordemNotas++;
			}
			aluno.setNotas(notas);
			alunos[i] = aluno;
			System.out.println();
		}
		
		curso.setAlunos(alunos);
		
		if(alunos != null){
			double mediaTurma = 0;
			for(Aluno aluno : alunos){
				double mediaAluno = 0;
				mediaAluno = aluno.calcularMedia(aluno.getNotas());
				System.out.println("Media do aluno " + aluno.getNomeAluno() + " é = " +mediaAluno);
				if(mediaAluno >= 7){
					System.out.println("Aluno Aprovado!! :)\n");
				} else{
					System.out.println("Aluno Reprovado!! :(\n");
				}
				mediaTurma += mediaAluno;
			}
			System.out.println("Média da Turma é=" +Aluno.calcularMediaTurma(mediaTurma));
		}
		
		

	}

}
