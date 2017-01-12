package br.oberdan.brincando.agenda;

public class TestaAgenda {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda(); //Cria objeto de Agenda
		agenda.setNomeAgenda("Agenda Familia");
		
		Contato[] contatos = new Contato[3]; //Cria vetor de contatos
		
		Contato contato1 = new Contato(); //Cria novo objeto contato
		contato1.setNome("Joaozinho");
		contato1.setEmail("joaozinhofamilia@email.com");
		contato1.setTelefone("9 1111-1111");
		contatos[0] = contato1; //Aloca o objeto contato no indice 0 do vetor de contatos
		
		Contato contato2 = new Contato(); //Cria novo objeto contato
		contato2.setNome("Mariazinha");
		contato2.setEmail("mariazinhafamilia@email.com");
		contato2.setTelefone("9 2222-2222");
		contatos[1] = contato2; //Aloca o objeto contato no indice 1 do vetor de contatos
		
		Contato contato3 = new Contato(); //Cria novo objeto contato
		contato3.setNome("Pedrinho");
		contato3.setEmail("pedrinhofamilia@email.com");
		contato3.setTelefone("9 3333-3333");
		contatos[2] = contato3; //Aloca o objeto contato no indice 2 do vetor de contatos
		
		agenda.setContatos(contatos); // Aloca o vetor de contatos criados ao contatos da agenda
		
		System.out.println("RETORNANDO APENAS UM CONTATO DA AGENDA");
		System.out.println(contato1.retornaContato()); // Retorna apenas um contato por vez
		
		System.out.println();
		
		System.out.println("RETORNANDO O NOME DA AGENDA E TODOS SEUS CONTATOS");
		if(agenda != null){
		System.out.println(agenda.retornaContatosAgenda()); // Retorna toda a lista de contatos da agenda
		}
		
	}

}
