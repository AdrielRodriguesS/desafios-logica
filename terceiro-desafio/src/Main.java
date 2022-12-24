import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorAlvo = 0;
		int tamanhoArray = 0;
		int subtracao = 0;
		int resposta = 0;
		
		boolean flag =false;
		
		System.out.println("digite o valor alvo: ");
		valorAlvo = sc.nextInt();

		System.out.println("Digite o tamanho do array:");
		
		while(!flag) {
			tamanhoArray = sc.nextInt();
			
			if(tamanhoArray <=0 ) {
				System.out.println("Valor inválido!");
				System.out.println("Digite o tamanho do array:");
			} else {
				flag = true;
			}
		}
		
		Integer[] arr = new Integer[tamanhoArray];

		for (int i = 0; i < tamanhoArray; i++) {
			System.out.println("digite o " + (i + 1) + "º número: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < tamanhoArray; i++) {

			for (int j = 0; j < tamanhoArray; j++) {

				if (i != j) {
					subtracao = arr[i] - arr[j];
					if (valorAlvo == subtracao) {
						resposta++;
					}

				}

			}
		}

		System.out.println("Pares que satisfazer o critério: " + resposta);
		
		sc.close();

	}

}
