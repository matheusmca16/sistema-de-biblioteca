import java.util.Scanner;

public class ExibirMenu {
    public static void menu(String[] args) {
        System.out.println("ss");
        Scanner s = new Scanner(System.in);
        int opcao = -1;

        do {
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

            opcao = s.nextInt();

            if (opcao == 0){
                    System.out.println("Você saiu da biblioteca.");
                    break;
            } else if (opcao == 1){
                System.out.println("Indo para cadastro de livros..");
            } else if (opcao == 2){
                System.out.println("Listando todos os livros..");
            } else if (opcao == 3){
                System.out.println("Buscando livros..");
            } else if (opcao == 4){
                System.out.println("Indo para cadastro de usuários..");
            } else if (opcao == 5){
                System.out.println("Indo para Empréstimo de livro..");
            } else if (opcao == 6){
                System.out.println("Indo para Devolução..");
            } else if (opcao == 7){
                System.out.println("Indo para Relatórios..");
            }else{
                System.out.println("Escreva uma opção valida..");
            }

        } while(opcao < 0 || opcao > 7);
    }
}
