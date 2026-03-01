import java.sql.ClientInfoStatus;
import java.util.Scanner;
import java.util.ArrayList;

/*
* Como criar construtor e pra que serve
*
* Como criar e manipular uma lista de objetos
*
* Como criar um banco de dados no formato de array list
*
* Solid
* */

public class Livro {

    private int id = 0;
    private String titulo;
    private String autor;
    private String ano;
    private boolean emprestado;

    public Livro(String titulo, String autor, String ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public Livro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    Scanner scanner = new Scanner(System.in);

    public void cadastroDeLivro(ArrayList<Livro> livros) {
        id = livros.size();
        System.out.println("Para cadastrar o livro desejado, siga os próximos passas..\n");
        System.out.println("O id do seu livro é " + id);
        System.out.println("Qual o título do livro?");
        titulo = scanner.nextLine();
        System.out.println("Qual o nome do autor livro?");
        autor = scanner.nextLine();
        System.out.println("Qual o ano do livro? formato mm/dd/aa");
        ano = scanner.nextLine();
        livros.add(this);
        System.out.println("Livro cadastrado com sucesso!!");
    }
    public void listaLivros(ArrayList<Livro> livros){

        if (livros.size() == 0) {
            System.out.println("Não há livros para listar.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                System.out.println("ID: " + i + " Título: " + livros.get(i).getTitulo());
            }
        }
    }
}

