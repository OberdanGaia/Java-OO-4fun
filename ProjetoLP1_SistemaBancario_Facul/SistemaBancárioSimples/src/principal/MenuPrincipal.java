package principal;

import java.util.Scanner;

import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Variaveis
		String nomeTitular;
		String numeroConta;
		double limiteInicial = 0;
		double saldoInicial = 0;
		int escolhaMenu = 9;

		ContaPoupanca contaP = null;
		ContaEspecial contaE = null;

		do {
			double valor = 0;
			escolhaMenu = MenuAuxiliar.menuInicial();

			switch (escolhaMenu) {
			case 1:
				int escolhaConta = MenuAuxiliar.menuAddConta();

				switch (escolhaConta) {
				case 1:
					System.out.println("Conta Poupança Selecionada");
					System.out.println("Digite o nome do Titular da conta");
					nomeTitular = input.next();
					System.out.println("Digite o número da conta");
					numeroConta = input.next();
					System.out.println("Digite o valor do Saldo inicial da conta");
					saldoInicial = input.nextDouble();

					ContaPoupanca cp = new ContaPoupanca();
					cp.setNomeCliente(nomeTitular);
					cp.setNumeroConta(numeroConta);
					cp.setSaldo(saldoInicial);
					cp.setDiaRendimento("13");

					System.out.println("Conta poupança criada com sucesso!");
					contaP = cp;
					break;

				case 2:
					System.out.println("Conta Especial selecionada");
					System.out.println("Digite o nome do Titular da conta");
					nomeTitular = input.next();
					System.out.println("Digite o número da conta");
					numeroConta = input.next();
					System.out.println("Digite o valor do Saldo inicial da conta");
					saldoInicial = input.nextDouble();
					System.out.println("Digite o limite inicial da conta");
					limiteInicial = input.nextDouble();

					ContaEspecial ce = new ContaEspecial();
					ce = new ContaEspecial();
					ce.setNomeCliente(nomeTitular);
					ce.setNumeroConta(numeroConta);
					ce.setSaldo(saldoInicial);
					ce.setLimite(limiteInicial);

					System.out.println("Conta Especial criada com sucesso!");
					contaE = ce;
					break;
				default:
					System.out.println("Valor Invalido");
				}
				break;

			case 2:
				System.out.println("Sacar dinheiro Selecionado");
				System.out.println("Digite o número de sua conta");
				numeroConta = input.next();
				if (contaP != null && contaP.getNumeroConta().equalsIgnoreCase(numeroConta)) {
					System.out.println("Acesso efetuado a conta " + contaP.getNumeroConta());
					System.out.println("Digite o valor que deseja Sacar");
					valor = input.nextDouble();
					boolean efetuado = contaP.sacar(valor);
					if (efetuado) {
						System.out.println("Saque realizado com sucesso!\n" + "Aguarde a Contagem das notas");
						System.out.println("Novo saldo = " + contaP.getSaldo());
					} else {
						System.out.println("Não foi possivel realizar o saque");
					}
					break;
				} else if (contaE != null && contaE.getNumeroConta().equalsIgnoreCase(numeroConta)) {
					System.out.println("Acesso efetuado a conta " + contaE.getNumeroConta());
					System.out.println("Digite o valor que deseja Sacar");
					valor = input.nextDouble();
					boolean efetuado = contaE.sacar(valor);
					if (efetuado) {
						System.out.println("Saque realizado com sucesso!\n" + "Aguarde a Contagem das notas");
						System.out.println("Saldo atual= " + contaE.getSaldo());
						System.out.println("Limite atual = " + contaE.getLimite());
					} else {
						System.out.println("Não foi possivel realizar o saque");
					}
					break;
				}
				System.out.println("Conta não encontrada");
				break;

			case 3:
				System.out.println("Depositar dinheiro Selecionado");
				System.out.println("Digite o número de sua conta");
				numeroConta = input.next();

				if (contaP != null && contaP.getNumeroConta().equalsIgnoreCase(numeroConta)) {
					System.out.println("Acesso efetuado a conta " + contaP.getNumeroConta());
					System.out.println("Digite o valor que deseja depositar");
					valor = input.nextDouble();
					boolean efetuado = contaP.depositar(valor);
					if (efetuado) {
						System.out.println("Deposito realizado com sucesso!\n");
						System.out.println("Novo saldo = " + contaP.getSaldo());
					} else {
						System.out.println("Não foi possivel realizar o deposito");
					}
					break;

				} else if (contaE != null && contaE.getNumeroConta().equalsIgnoreCase(numeroConta)) {
					System.out.println("Acesso efetuado a conta " + contaE.getNumeroConta());
					System.out.println("Digite o valor que deseja depositar");
					valor = input.nextDouble();
					boolean efetuado = contaE.depositar(valor);
					if (efetuado) {
						System.out.println("Deposito realizado com sucesso!\n");
						System.out.println("Saldo atual= " + contaE.getSaldo());
					} else {
						System.out.println("Não foi possivel realizar o saque");
					}
				}
				System.out.println("Conta não encontrada");
				break;
			case 4:
				System.out.println("Verifica Rendimento Mensal de Conta poupança Selecionado");
				System.out.println("Digite o número de sua Conta Poupança");
				numeroConta = input.next();

				if (contaP != null && contaP.getNumeroConta().equalsIgnoreCase(numeroConta)) {
					System.out.println("Saldo atual = " + contaP.getSaldo());
					String dia = Integer.toString(MenuAuxiliar.pegaDiaAtual());
					if (contaP.getDiaRendimento().equalsIgnoreCase(dia)) {
						contaP.calcularNovoSaldo();
						System.out.println("Novo saldo = " + contaP.getSaldo());
					} else {
						System.out.println("Hoje não é dia de rendimento desta conta!");
					}
					break;
				}
				System.out.println("Conta não encontrada");
				break;
			case 5:
				System.out.println("Apresentar dados da Conta Selecionado");
				System.out.println("Digite o número de sua Conta");
				numeroConta = input.next();

				if (contaP != null && contaP.getNumeroConta().equalsIgnoreCase(numeroConta)) {
					System.out.println(contaP.toString());
				} else if (contaE != null && contaE.getNumeroConta().equalsIgnoreCase(numeroConta)) {
					System.out.println(contaE.toString());
				} else {
					System.out.println("Conta não encontrada");
				}
				break;
			}
		} while (escolhaMenu != 0);
		System.out.println("Sessão encerrada!");
	}

}
