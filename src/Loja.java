import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Computador> estoque = new ArrayList<>();
            int opcao;
            
            do {
                System.out.println("\n### SISTEMA DE CONTROLE DA LOJA ###");
                System.out.println("1. Cadastrar Notebook");
                System.out.println("2. Cadastrar Desktop");
                System.out.println("3. Cadastrar Servidor");
                System.out.println("4. Listar Estoque");
                System.out.println("5. Sair");
                System.out.print("-> Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                
                switch (opcao) {
                    case 1 -> {
                        Computador novoNotebook = new Notebook();
                        novoNotebook.cadastrar();
                        estoque.add(novoNotebook);
                        System.out.println("\n>> Notebook cadastrado com sucesso!");
                    }
                    case 2 -> {
                        Computador novoDesktop = new Desktop();
                        novoDesktop.cadastrar();
                        estoque.add(novoDesktop);
                        System.out.println("\n>> Desktop cadastrado com sucesso!");
                    }
                    case 3 -> {
                        Computador novoServidor = new Servidor();
                        novoServidor.cadastrar();
                        estoque.add(novoServidor);
                        System.out.println("\n>> Servidor cadastrado com sucesso!");
                    }
                    case 4 -> {
                        System.out.println("\n--- RELATÓRIO DE ESTOQUE ---");
                        if (estoque.isEmpty()) {
                            System.out.println("Estoque vazio.");
                        } else {
                            for (Computador c : estoque) {
                                c.imprimir();
                            }
                        }
                    }
                    case 5 -> System.out.println("Encerrando o sistema.");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 5);
        }
    }
}
