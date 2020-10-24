package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class Escola_Almirante_Bacelar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Bem vindo ao cadastro de alunos! \nSe deseja cadastrar aluno digite 'C'. \nSe deseja encerrar digite 'E'.");
		String Cad = scan.nextLine();

		if (Cad.equalsIgnoreCase("C"))
			System.out.println("Por favor informe os dados a seguir:");
		if (Cad.equalsIgnoreCase("E"))
			System.out.println("Cadastro de alunos encerrado.");

		System.out.println("Digite os dados " + "\nNome: ");
		String nome = scan.nextLine();

		System.out.println("Sexo: ");
		String sexo = scan.nextLine();

		System.out.println("Idade: ");
		int idade = scan.nextInt();

		Cadastro aluno;
		aluno = new Cadastro();

		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setSexo(sexo);

		ArrayList<Cadastro> Escola_Almirante_Bacelar = new ArrayList<Cadastro>();
		Escola_Almirante_Bacelar.add(aluno);

		System.out.println(aluno.getNome() + "\n" + aluno.getIdade() + "\n" + aluno.getSexo());

		scan.close();

	}

}
