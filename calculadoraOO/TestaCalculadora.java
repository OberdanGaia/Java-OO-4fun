package br.oberdan.brincando.calculadoraOO;

import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int escolha;

		
		do{
		System.out.println("Digite 1 para Somar\n"
				+ "Digite 2 para Subtrair\n"
				+ "Digite 3 para Multiplicar\n"
				+ "Digite 4 para Dividir\n"
				+ "Digite 5 para Potência de um número\n"
				+ "DIGITE 0 PARA SAIR");
		escolha = input.nextInt();
		
		double valor1 = 0, valor2 = 0;
		double valorFinal = 0;
				
		switch (escolha){
		case 1:
			System.out.print("Digite o Valor: ");
			valor1 = input.nextDouble();
			System.out.print("Digite o Valor: ");
			valor2 = input.nextDouble();
			valorFinal = Calculadora.somar(valor1, valor2);
			System.out.printf("Resultado = %.2f \n\n" , valorFinal);
			break;
		case 2:
			System.out.print("Digite o  Valor: ");
			valor1 = input.nextDouble();
			System.out.print("Digite o Valor: ");
			valor2 = input.nextDouble();
			valorFinal = Calculadora.subtrair(valor1, valor2);
			System.out.printf("Resultado = %.2f \n\n" , valorFinal);
			break;
		case 3:
			System.out.print("Digite o Valor: ");
			valor1 = input.nextDouble();
			System.out.print("Digite o Valor: ");
			valor2 = input.nextDouble();
			valorFinal = Calculadora.multiplicar(valor1, valor2);
			System.out.printf("Resultado = %.2f \n\n" , valorFinal);
			break;
		case 4:
			System.out.print("Digite o Valor: ");
			valor1 = input.nextDouble();
			System.out.print("Digite o Valor: ");
			valor2 = input.nextDouble();
			valorFinal = Calculadora.dividir(valor1, valor2);
			System.out.printf("Resultado = %.2f \n\n" , valorFinal);
			break;
		case 5:
			System.out.print("Digite o Valor: ");
			valor1 = input.nextDouble();
			System.out.print("Digite o Valor: ");
			valor2 = input.nextDouble();
			valorFinal = Calculadora.potencia(valor1, valor2);
			System.out.printf("Resultado = %.2f \n\n" , valorFinal);
			break;
		case 0 :
			System.out.printf("Saindo da Calculadora...");
			System.exit(0);
            break;
            
		default:
			System.out.println("ERRO! Você digitou um comando inválido!!");
			
		
		}
		} while (escolha != 0);
		
	}

}
