package pilhaFila;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class FilaDoBanco {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<>();

		int codigo = 1;
		String nomeCliente;

		System.out.println("--- GERENCIA A FILA DE CLIENTES EM UM BANCO ---");

		while (codigo != 0) {

			System.out.println("\nEscolha uma opção para prosseguir: ");

			System.out.println("----------------------------------------");
			System.out.println("| CÓDIGO |            OPÇÃO            |");
			System.out.println("----------------------------------------");
			System.out.println("|   1    |  Adicionar cliente na fila  |");
			System.out.println("|   2    |   Listar todos os clientes  |");
			System.out.println("|   3    |    Chamar cliente da fila   |");
			System.out.println("|   0    |             Sair            |");
			System.out.println("----------------------------------------");

			System.out.println("OPÇÃO --> ");
			codigo = leia.nextInt();
			leia.nextLine();

			switch (codigo) {
			case 1:
				System.out.print("\nDigite o nome do cliente: ");
				nomeCliente = leia.nextLine();
				fila.add(nomeCliente);
				System.out.print("Cliente adicionado com sucesso!\n");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nNão há clientes na fila!");
				} else {
					System.out.println("\nClientes na fila: " + fila);
				}
				break;

			case 3:
				String clienteRemovido = fila.poll();
				if (clienteRemovido != null) {
					System.out.println("\nPróximo cliente: " + clienteRemovido);
					System.out.println("O cliente foi chamado!");

				} else {
					System.out.println("\nNão há clientes na fila!");
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