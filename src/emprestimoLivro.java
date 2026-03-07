import java.util.ArrayList;

public class emprestimoLivro {

    public void realizarEmprestimo(ArrayList<Usuario> usuarios, ArrayList<Livro> livros) {

        Usuario usuario = validaUso(usuarios);
        if (usuario == null) {
            System.out.println("Empréstimo cancelado.");
            return;
        }

        Livro livro = validaLivro(livros);
        if (livro == null) {
            System.out.println("Empréstimo cancelado.");
            return;
        }

        if (livro.getEmprestado()) {
            System.out.println("Este livro já está emprestado.");
            return;
        }

        if (usuario.listaLivrosEmprestados.size() >= 3) {
            System.out.println("Usuário já possui 3 livros emprestados.");
            return;
        }

        usuario.listaLivrosEmprestados.add(livro);
        livro.setEmprestado(true);

        System.out.println("Empréstimo realizado com sucesso!");
    }

    public Usuario validaUso(ArrayList<Usuario> usuarios) {
        Usuario auxiliar = new Usuario();
        Usuario usuarioEncontrado = auxiliar.buscarUsuarioId(usuarios);

        if (usuarioEncontrado != null) {
            System.out.println("Usuário válido!");
            return usuarioEncontrado;
        }

        return null;
    }

    public Livro validaLivro(ArrayList<Livro> livros) {

        Livro auxiliar = new Livro();
        Livro livroEncontrado = auxiliar.buscarLivroId(livros);

        if (livroEncontrado != null) {
            return livroEncontrado;
        }
        return null;
    }
    public static void chamaEmprestimoLivros(ArrayList<Usuario> usuarios, ArrayList<Livro> livros) {
        emprestimoLivro emprestimoLivro = new emprestimoLivro();
        emprestimoLivro.realizarEmprestimo(usuarios, livros);
    }
}