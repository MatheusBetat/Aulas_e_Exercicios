package controle;

import java.util.Scanner;

public class Switch_Sem_Break {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a cor da sua faixa?");
		String faixa = scan.nextLine();
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
			break;
		case "marrom":
		System.out.println("Sei o Tekki Shodan");
		    break;
		case"roxa":
			System.out.println("Sei o Heian godan");
			break;
		case"verde":
			System.out.println("sei o Heian Yodan");
			break;
		case"laranja":
			System.out.println("sei o Heian Sandan");
			break;
			default:
				System.out.println("Não sei nada!");
				break;
		}

		scan.close();
	}

}
