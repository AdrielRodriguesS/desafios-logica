import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String frase = "";
		int numeroFrases = 0;
		
		boolean flag =false;
		System.out.println("digite o número de frases a serem decifradas: ");
		
		while(!flag) {
			numeroFrases = sc.nextInt();
			
			if(numeroFrases <= 0) {
				System.out.println("Valor inválido!");
				System.out.println("digite o número de frases a serem decifradas: ");
			} else {
				flag = true;
			}
			
		}
		
		String[] frases= new String[numeroFrases];
		
		for(int i = 0; i < numeroFrases; i++) {
			
			if(i==0) {
				System.out.println("digite a " + (i+1) + "ª frase: ");
				sc.nextLine();
				frase = sc.nextLine();
				frases[i] = frase;
			} else {
				System.out.println("digite a " + (i+1) + "ª frase: ");
				frase = sc.nextLine();
				frases[i] = frase;				
			}
		}
		
		
		
		for(int i=0; i < numeroFrases; i++) {

			int qtdChar = (frases[i].length()-1);
			int charMeio = ((frases[i].length()/ 2)-1);

			int j = 0;
			char[] fraseChar = new char[qtdChar];
			fraseChar = frases[i].toCharArray();
			
			while(charMeio>=0) {
				fraseChar[j] = frases[i].charAt(charMeio);
				charMeio--;
				j++;
			}
			
			while(qtdChar>((frases[i].length()/ 2)-1)) {
				fraseChar[j] = frases[i].charAt(qtdChar);
				qtdChar--;
				j++;
			}
			
		
			frases[i] = new String(fraseChar);
		}
		
		
		
		for(String f: frases) {
			System.out.println(f);
		}
		sc.close();

	}

}
