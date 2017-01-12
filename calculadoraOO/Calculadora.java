package br.oberdan.brincando.calculadoraOO;

public class Calculadora {
		
	public static double somar(double valor1, double valor2){
		return valor1 + valor2;
	}
	
	public static double subtrair(double valor1, double valor2){
		return valor1 - valor2;
		
	}
	
	public static double multiplicar(double valor1, double valor2){
		return valor1 * valor2;
	}
	
	public static double dividir(double valor1, double valor2){
		return valor1 / valor2;
	}
	
	public static double potencia(double valor1, double valor2){
		return Math.pow(valor1, valor2);
	}
		
}
