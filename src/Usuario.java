import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    //id, nome, lista de ids de livros emprestados)

    private int idUsuario = 0;
    private String nomeUsuario;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    ArrayList<Livro> listaLivrosEmprestados = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void cadastroDeUsuario(ArrayList<Usuario> usuarios) {
        idUsuario = usuarios.size();
        System.out.println("Para cadastrar o usuario, siga os próximos passas..\n");
        System.out.println("O seu id é " + idUsuario);
        System.out.println("Qual o nome do usuário?");
        nomeUsuario = scanner.nextLine();

        usuarios.add(this);
        System.out.println("Usuario cadastrado!!");
    }
    public void buscarUsuarioId(ArrayList<Usuario> usuarios){
        System.out.println("Digite o id do Usuario desejado..");
        int buscaId = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);

            if (u.getIdUsuario() == buscaId) {

                System.out.println("Usuario encontrado!");
                System.out.println("ID: " + u.getIdUsuario());
                System.out.println("Nome: " + u.getNomeUsuario());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Usuario não encontrado.");
        }
    }
}
