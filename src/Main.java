import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int continuarSistema;
        ArrayList<Livro> livros = new ArrayList<>();
        Menu menuInicial = new Menu();

        menuInicial.processaMenuInicial();

        do {
            int opcaoInicial = menuInicial.getOpcao();

            switch (opcaoInicial) {
                case 0:
                    System.out.println("Você saiu da biblioteca.");
                    break;
                case 1:
                    Livro livro = new Livro("", "", "");
                    livro.cadastroDeLivro(livros);
                    break;
                case 2:
                    Livro livroInicial = new Livro();
                    livroInicial.listaLivros(livros);
                default:
            }
            do {
                System.out.println("Deseja continuar no sistema? 1-(sim) 2-(Não)");
                continuarSistema = scanner.nextInt();
            }while (continuarSistema < 0 || continuarSistema > 1);

        menuInicial.processaMenuSecundario();
        }while (continuarSistema == 1);
    }
}
