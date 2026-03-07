import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class devolverLivro {
    public void realizaDevolucao(emprestimoLivro emprestimo, ArrayList<Usuario> usuarios, ArrayList<Livro> livros) {
        Usuario usuario = emprestimo.validaUso(usuarios);

        if (usuario == null) {
            System.out.println("Devolução cancelado.");
            return;
        }

        System.out.println("Verificando se o livro existe..");
        Livro livro = emprestimo.validaLivro(livros);

        if (livro == null) {
            System.out.println("Devolução cancelada.");
            return;
        }
        System.out.println("Verificando se o livro está com você..");
        Livro p = validaLivroEmprestado(usuario);
        if (p == null) {
            System.out.println("Devolução cancelada, pois você não possui esse livro com você.");
            return;
        }

        usuario.listaLivrosEmprestados.remove(livro);
        livro.setEmprestado(false);

        System.out.println("Devolvido com sucesso!!");
    }

    public static Livro validaLivroEmprestado(Usuario usuario) {

        Livro auxiliar = new Livro();
        Livro livroEncontrado = auxiliar.buscarLivroId(usuario.getListaLivrosEmprestados());

        if (livroEncontrado != null) {
            System.out.println("O livro está com você.");
            return livroEncontrado;
        }

        System.out.println("Esse livro não está emprestado para você.");
        return null;
    }
}
