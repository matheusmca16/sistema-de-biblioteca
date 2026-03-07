import java.util.ArrayList;
import java.util.Scanner;

public class processosMenu {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    ArrayList<Livro> listaLivrosEmprestados = new ArrayList<>();

    public void processandoMenu() {
        int opcao;

        do {
            imprimeMenu();
            opcao = scanner.nextInt();
            processaOpcao(opcao);
        } while (opcao != 0);
        System.out.println("Até logo!");
    }

    private void imprimeMenu() {
        Menu.mostrarMenuInicial();
    }

    private void processaOpcao(int opcao) {
        switch (opcao) {
            case 1:
                Livro livro = new Livro("", "", "");
                livro.cadastroDeLivro(livros);
                break;
            case 2:
                Livro livroInicial = new Livro();
                livroInicial.listaLivros(livros);
                break;
            case 3:
                Livro livroBusca = new Livro();
                livroBusca.buscarLivroId(livros);
                break;
            case 4:
                Usuario cadUsO = new Usuario();
                cadUsO.cadastroDeUsuario(listaUsuarios);
                break;
            case 5:
                emprestimoLivro emprestimo = new emprestimoLivro();
                emprestimo.realizarEmprestimo(listaUsuarios, livros);
                break;
            case 6:
                devolverLivro devolve = new devolverLivro();
                emprestimoLivro emprestimos = new emprestimoLivro();
                devolve.realizaDevolucao(emprestimos, listaUsuarios, livros);
                break;
            case 7:
                relatoriosBiblioteca relatorio = new relatoriosBiblioteca();
                relatorio.contagemLivros(livros, listaLivrosEmprestados);
                break;
            case 0:
                System.out.println("Você saiu da biblioteca.");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    public static void iniciarProcessos() {
        processosMenu menu = new processosMenu();
        menu.processandoMenu();
    }
}



