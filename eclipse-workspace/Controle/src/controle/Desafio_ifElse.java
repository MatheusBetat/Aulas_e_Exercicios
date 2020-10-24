package controle;

import java.util.Scanner;

public class Desafio_ifElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = scan.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Primeiro dia da semana.");
		}else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("Segundo dia da semana.");
		}else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("Terceiro dia da semana.");
		}else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("Quarto dia da semana.");
		}else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("Quinto dia da semana.");
		}else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("Sexto dia da semana.");
		}else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("Sétimo dia da semana.");
		}else
			System.out.println("Dia inválido.");
		
				
		scan.close();

	}

}
