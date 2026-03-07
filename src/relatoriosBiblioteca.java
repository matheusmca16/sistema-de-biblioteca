import java.util.ArrayList;

public class relatoriosBiblioteca {

    public void contagemLivros ( ArrayList<Livro> livros, ArrayList<Livro> listaLivrosEmprestados) {

        int quantidade = livros.size();

        int livrosEmprestados = 0;

        for(int i = 0; i < livros.size(); i++){

            Livro l = livros.get(i);

            if(l.getEmprestado()){
                livrosEmprestados++;
            }
        }

        System.out.println(("\n===== RELATÓRIO DA BIBLIOTECA ====="));
        System.out.println("Quantidade de livros cadastrados: " + quantidade);

        System.out.println("Quantidade de livros emprestados: " + livrosEmprestados);

        double percentual = (livrosEmprestados * 100) / quantidade;
        System.out.println("O percentual de livros emprestados é: " + percentual);

    }
}
