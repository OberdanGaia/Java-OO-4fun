package principal;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MenuAuxiliar {

		static Scanner input = new Scanner(System.in);
		
		public static int menuInicial(){
			System.out.println("\nMenu:");
			System.out.println("1 = Criar Conta\n" + "2 = Sacar Dinheiro\n" + "3 = Depositar Dinheiro\n"
					+ "4 = Verifica rendimento Conta Poupan�a\n" + "5 = Mostrar dados da Conta");
			int escolhaMenu = input.nextInt();
			return escolhaMenu;
		}
		
		public static int menuAddConta(){
			System.out.println("Cria��o de conta selecionada");
			System.out.println("1 = Criar conta Poupan�a\n" + "2 = Criar conta Especial");
			int escolhaConta = input.nextInt();
			return escolhaConta;
		}
		
		public static int pegaDiaAtual() {
			Calendar calendar = new GregorianCalendar();
			Date date = new Date();
			calendar.setTime(date);
			return calendar.get(calendar.DATE);
		}
		
		
	}

