import java.util.Scanner;

public class Menu {
    private int opcao = -1;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public static void mostrarMenuInicial() {

        System.out.println("=================================");
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
}