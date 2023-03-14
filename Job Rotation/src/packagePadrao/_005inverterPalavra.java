package packagePadrao;

import java.util.Scanner;

public class _005inverterPalavra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String palavra = sc.nextLine();

        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("A palavra/frase invertida é: " + palavraInvertida);
        
        sc.close();
	}

}
