package br.oberdan.brincando.agenda;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contatos;
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String retornaContatosAgenda(){
		String info = "Nome Agenda: " + this.nomeAgenda + "\n\n"; 
		
		if(contatos != null){
		for(Contato c : contatos){
			info += c.retornaContato() + "\n";
			//System.out.println("Nome: " + c.getNome()+ "\nEmail: " +c.getEmail()+ "\nTelefone: " +c.getTelefone()+ "\n");
		}
		}
		
		return info;
		
	}
	
	
	
}
