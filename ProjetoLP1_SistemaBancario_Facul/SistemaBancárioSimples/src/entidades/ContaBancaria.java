package entidades;

public class ContaBancaria {

	private String nomeCliente;
	private String numeroConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valorSaque) {
		if (!checarValorNegativo(valorSaque)) {
			if (saldo >= valorSaque) {
				this.saldo -= valorSaque;
				return true;
			} else
				return false;
		} else
			return false;

	}

	public boolean depositar(double valorDeposito) {
		if (!checarValorNegativo(valorDeposito)) {
			this.saldo += valorDeposito;
			return true;
		}
		return false;
	}

	public static boolean checarValorNegativo(double valor) {
		if (valor < 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Conta Bancaria: \n" + "Nome Cliente: " + nomeCliente + "\n" + "Numero Conta: " + numeroConta + "\n"
				+ "Saldo: " + saldo +"\n";

	}

}
