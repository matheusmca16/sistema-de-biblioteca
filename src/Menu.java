import java.util.Scanner;

public class Menu {
    private void execultaOpcaoInicial() {
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        do {
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Você saiu da biblioteca.");
                    break;
                case 1:
                    System.out.println("Indo para cadastro de livros..");
                    break;
                case 2:
                    System.out.println("Listando todos os livros..");
                    break;
                case 3:
                    System.out.println("Buscando livros..");
                    break;
                case 4:
                    System.out.println("Indo para cadastro de usuários..");
                    break;
                case 5:
                    System.out.println("Indo para Empréstimo de livro..");
                    break;
                case 6:
                    System.out.println("Indo para Devolução..");
                    break;
                case 7:
                    System.out.println("Indo para Relatórios..");
                    break;
                default:
                    System.out.println("Escreva uma opção valida..");
            }

        } while(opcao < 0 || opcao > 7);
    }

    private void mostrarMenuInicial() {

        System.out.println("=================================");
        System.out.println("|         BEM-VINDO!!           |");
        System.out.println("|    SISTEMA DE BIBLIOTECA.     |");
        System.out.println("=================================");
        System.out.println("|   [0] Sair.                   |");
        System.out.println("|   [1] Cadastro de livros.     |");
        System.out.println("|   [2] Listar todos os livros. |");
        System.out.println("|   [3] Busca livros.           |");
        System.out.println("|   [4] Cadastro de usuários.   |");
        System.out.println("|   [5] Empréstimo de livro.    |");
        System.out.println("|   [6] Devolução.              |");
        System.out.println("|   [7] Relatórios.             |");
        System.out.println("|   Digite a opção desejada:    |");
        System.out.println("=================================");
    }

    public void processaMenuInicial() {
        mostrarMenuInicial();
        execultaOpcaoInicial();
    }
}
