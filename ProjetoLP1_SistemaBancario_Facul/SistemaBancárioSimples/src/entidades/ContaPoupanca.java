package entidades;

public class ContaPoupanca extends ContaBancaria{
	
	private String diaRendimento;

	public String getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(String diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(){
		double novoSaldo = 0;
		novoSaldo = ((super.getSaldo() * Constantes.TAXA_RENDIMENTO_POUPANCA) / 100); 
		this.setSaldo(novoSaldo += super.getSaldo());
		
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "Dia de Rendimento: " + diaRendimento;
		return info;
	}

	
	
	
	
}

