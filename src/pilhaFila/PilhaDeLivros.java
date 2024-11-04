package pilhaFila;

import java.util.Scanner;
import java.util.Stack;

public class PilhaDeLivros {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<>();

		int codigo = 1;
		String tituloLivro;

		System.out.println("--- GERENCIA LIVROS EM UMA PILHA ---");

		while (codigo != 0) {

			System.out.println("\nEscolha uma opção para prosseguir: ");

			System.out.println("----------------------------------------");
			System.out.println("| CÓDIGO |            OPÇÃO            |");
			System.out.println("----------------------------------------");
			System.out.println("|   1    |   Adicionar livro na pilha  |");
			System.out.println("|   2    |    Listar todos os livros   |");
			System.out.println("|   3    |        Retirar livro        |");
			System.out.println("|   0    |             Sair            |");
			System.out.println("----------------------------------------");

			System.out.println("OPÇÃO --> ");
			codigo = leia.nextInt();
			leia.nextLine();

			switch (codigo) {
			case 1:
				System.out.print("\nDigite o título do livro: ");
				tituloLivro = leia.nextLine();
				pilha.push(tituloLivro);
				System.out.print("Livro adicionado com sucesso!\n");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("\nNão há livros na pilha!");
				} else {
					System.out.println("\nLivros na pilha: " + pilha);
				}
				break;

			case 3:
				if (!pilha.isEmpty()) {
                    String livroRemovido = pilha.pop();
                    System.out.println("\nPróximo livro: " + livroRemovido);
                    System.out.println("O livro foi removido!");
                } else {
                    System.out.println("\nNão há livros na pilha!");
                }
                break;

			case 0:
				System.out.println("\nPrograma finalizado!");
				break;

			default:
				System.out.println("\nOpção inválida. Tente novamente.");
				break;

			}

		}

		leia.close();

	}
}