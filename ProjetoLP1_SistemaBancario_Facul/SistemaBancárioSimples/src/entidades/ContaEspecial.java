package entidades;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	

	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public boolean sacar(double valorSaque) {
		if (!checarValorNegativo(valorSaque)) {
			if (super.getSaldo() < valorSaque) {
				double novoSaldoLimite = super.getSaldo() + this.limite;
				if (novoSaldoLimite < valorSaque) {
				  	return false;
				} else {
					this.setSaldo(super.getSaldo() - valorSaque);
					this.limite = novoSaldoLimite -= valorSaque;
					super.setSaldo(0);
					return true;
				}
			} else {
				super.setSaldo(super.getSaldo() - valorSaque);
				return true;
			}
		}
		return false;
	}


	@Override
	public String toString() {
		String info = super.toString();
		info += "Limite: " + limite;
		return info;
	}
	
	

}
