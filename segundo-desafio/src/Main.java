import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale locale = new Locale("en", "US");
		Locale.setDefault(locale);
		
		Scanner sc = new Scanner (System.in);
		
		Double valor = 0.00;
		int notaDeCem = 0;
		int notaDeCinquenta = 0;
		int notaDeVinte = 0;
		int notaDeDez = 0;
		int notaDeCinco = 0;
		int notaDeDois = 0;
		int moedaDeUmReal = 0;
		int moedaDe50Centavos = 0;
		int moedaDe25Centavos = 0;
		int moedaDe10Centavos = 0;
		int moedaDe5Centavos = 0;
		int moedaDe1Centavo = 0;
		
		boolean flag =false;
		
		System.out.println("Digite o valor entre R$0.00 e R$ 1000000.00: ");
		
		while(!flag) {
			
			valor = sc.nextDouble();
			
			if(valor < 0 || valor > 1000000) {
				System.out.println("Valor inválido!");
				System.out.println("Digite um valor entre R$ 0.00 e R$ 1000000.00");
			} else {
				flag = true;
			}
		}
		
		while(valor >= 100.00) {
				valor -= 100.00;
				notaDeCem++;
		}
		
		while(valor >= 50.00) {
				valor -= 50.00;
				notaDeCinquenta++;
		}
		
		while(valor >= 20.00) {
				valor -= 20.00;
				notaDeVinte++;
		}
		
		while(valor >= 10.00) {
				valor -= 10.00;
				notaDeDez++;
		}
		
		while(valor >= 5.00) {
				valor -= 5.00;
				notaDeCinco++;
		}
		
		while(valor >= 2.00) {
				valor -= 2.00;
				notaDeDois++;
		}
		
		while(valor >= 1.00) {
				valor -= 1.00;
				moedaDeUmReal++;
		}
		
		while(valor >= 0.50) {
			valor -= 0.50;
			moedaDe50Centavos++;
		}
		
		while(valor >= 0.25) {
			valor -= 0.25;
			moedaDe25Centavos++;
		}
		
		while(valor >= 0.10) {
			valor -= 0.10;
			moedaDe10Centavos++;
		}
		
		while(valor >= 0.05) {
			valor -= 0.05;
			moedaDe5Centavos++;
		}
		
		while(valor >= 0.01) {
			valor -= 0.01;
			moedaDe1Centavo++;
		}
		
		System.out.println("NOTAS:");
		System.out.println(notaDeCem + "  Nota(s) de R$ 100.00");
		System.out.println(notaDeCinquenta + "  Nota(s) de R$ 50.00");
		System.out.println(notaDeVinte + "  Nota(s) de R$ 20.00");
		System.out.println(notaDeDez + "  Nota(s) de R$ 10.00");
		System.out.println(notaDeCinco + "  Nota(s) de R$ 5.00");
		System.out.println(notaDeDois + "  Nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS");
		System.out.println(moedaDeUmReal + "  moeda(s) de R$ 1.00");
		System.out.println(moedaDe50Centavos + "  moeda(s) de R$ 0.50");
		System.out.println(moedaDe25Centavos + "  moeda(s) de R$ 0.25");
		System.out.println(moedaDe10Centavos + "  moeda(s) de R$ 0.10");
		System.out.println(moedaDe5Centavos + "  moeda(s) de R$ 0.05");
		System.out.println(moedaDe1Centavo + "  moeda(s) de R$ 0.01");
		
		sc.close();

	}
}
