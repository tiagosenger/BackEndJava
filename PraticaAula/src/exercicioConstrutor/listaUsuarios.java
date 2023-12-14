package exercicioConstrutor;
import java.util.ArrayList;
import java.util.List;

public class listaUsuarios {
	private List<Usuarios> usuarios;

    public listaUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuarios usuario) {
        usuarios.add(usuario);
    }

    public void excluirUsuario(Usuarios usuario) {
        usuarios.remove(usuario);
    }

    public void listar() {
        for (Usuarios usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }

    public void listar(int x) {
        for (int i = x; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).getNome());
        }
    }

    public void listar(int x, int y) {
        for (int i = x; i <= y && i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).getNome());
        }
    }
}
