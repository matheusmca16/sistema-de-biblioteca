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
        emprestado = false;
        livros.add(this);
        System.out.println("Livro cadastrado com sucesso!!");
    }
    public void listaLivros(ArrayList<Livro> livros){

        if (livros.size() == 0) {
            System.out.println("Não há livros para listar.");

            boolean emprestado = false;
            for (int i = 0; i < livros.size(); i++) {
                Livro l = livros.get(i);

                if (emprestado == true) {
                    System.out.println("Livro não disponível .");
                    System.out.println("ID: " + l.getId());
                    System.out.println("Título: " + l.getTitulo());
                    System.out.println("Emprestado: " + l.isEmprestado());
                }
                if (emprestado == false) {
                    System.out.println("Livro Disponível!");
                    System.out.println("ID: " + l.getId());
                    System.out.println("Título: " + l.getTitulo());
                    System.out.println("Emprestado: " + l.isEmprestado());

                }
            }
       }
    }
    public void buscarLivro(ArrayList<Livro> livros){

        System.out.println("Digite o título ou autor do livro que deseja buscar:");
        String busca = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < livros.size(); i++) {
                Livro l = livros.get(i);
                if (l.getTitulo().equalsIgnoreCase(busca) || l.getAutor().equalsIgnoreCase(busca)) {

                System.out.println("Livro encontrado!");
                System.out.println("ID: " + l.getId());
                System.out.println("Título: " + l.getTitulo());
                System.out.println("Autor: " + l.getAutor());
                System.out.println("Ano: " + l.getAno());
                System.out.println("Emprestado: " + l.isEmprestado());

                encontrado = true;
            }
            if (encontrado == false){
            System.out.println("Livro não encontrado.");
            }
        }
    }
}