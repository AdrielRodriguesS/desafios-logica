import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int qtdNumeros = 0;
		int numeroDigitado;
		List<Integer> numerosPares = new ArrayList<>();
		List<Integer> numerosImpares = new ArrayList<>();
		
		
		int primeiroNumeroDigitado = 0;
		
		Scanner sc = new Scanner (System.in);
		
		boolean numeroCorreto = false;
		
		while(!numeroCorreto) {
			System.out.println("Digite a quantidade de números:");
			primeiroNumeroDigitado = sc.nextInt();
			
			if(primeiroNumeroDigitado > 1 && primeiroNumeroDigitado <= 100000 ) {
				numeroCorreto = true;
			} else {
				System.out.println("Digite um valor entre 1 e 100000");
			}
			
		}
		
		qtdNumeros = primeiroNumeroDigitado;
		

		
		int i = 1;
		
		while(i <= qtdNumeros) {
			System.out.println("digite o " + i + "º numero:");
			numeroDigitado = sc.nextInt();
			if ( numeroDigitado <= 0 || numeroDigitado > 100000  ) {
				System.out.println("Digite um numero entre 1 e 100000");
			} else {
				if(numeroDigitado % 2 == 0 ) {
					numerosPares.add(numeroDigitado);
				} else {
					numerosImpares.add(numeroDigitado);
				}
				i++;
			}			
		}
		
		Collections.sort(numerosPares);
		Collections.sort(numerosImpares, Collections.reverseOrder());		
		
		System.out.println("Saída:");
		for(int n: numerosPares) {
			System.out.println(n);
		}
		
		for(int n: numerosImpares) {
			System.out.println(n);
		}
		
		sc.close();
		
		System.out.println("Fim!!");

	}

}
