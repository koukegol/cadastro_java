package cadastro_novo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

		private static List<Cliente> clientes = new ArrayList<>();
		private static int nextId = 1;
		
		public static void main	(String[] args) {
			Scanner scanner = new Scanner  (System.in);
			int opcao;
			
			do {
				System.out.println("Menu:");
				System.out.println("1. Adicionar Cliente");
				System.out.println("2. Listar Cliente");
				System.out.println("3. Sair");
				System.out.println("Escolha uma opca1o: ");
				opcao = scanner.nextInt();
				scanner.nextLine();
				
				switch (opcao) {
				case 1:
					adcionarCliente(scanner);
					 break;
				case 2:
					listarClientes();
					break;
					
				case 3:
					System.out.println("Saindo...");
					break;
					
				default:
	                System.out.println("Opção inválida. Tente novamente.");
				
				}
				
		}while (opcao !=3);
			scanner.close();
			
		}
		

		private static void adcionarCliente(Scanner scanner) {
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.nextLine();
			
			Cliente cliente = new Cliente(nextId++, nome, email);
	        clientes.add(cliente); 
		
			System.out.println("Cliente adicionado com sucesso!");
			
			
			
		}
		
		
		 private static void listarClientes() {
		        if (clientes.isEmpty()) {
		            System.out.println("Nenhum cliente cadastrado.");
		        } else {
		            System.out.println("Lista de Clientes:");
		            for (Cliente cliente : clientes	) {
		                System.out.println(cliente);
		            }
		        }
		    }
		}

