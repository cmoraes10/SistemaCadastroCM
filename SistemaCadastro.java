import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastro {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao;
        do {
            System.out.println("=== Sistema de Cadastro de Usuários ===");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void cadastrarUsuario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        usuarios.add(new Usuario(nome, email));
        System.out.println("Usuário cadastrado com sucesso!\n");
    }

    private void listarUsuarios() {
        System.out.println("=== Usuários Cadastrados ===");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new SistemaCadastro().iniciar();
    }
}