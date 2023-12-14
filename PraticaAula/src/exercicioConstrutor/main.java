package exercicioConstrutor;

public class main {
	public static void main(String[] args) {
        listaUsuarios lista = new listaUsuarios();

        lista.cadastrarUsuario(new Usuarios("Usuario1"));
        lista.cadastrarUsuario(new Usuarios("Usuario2"));
        lista.cadastrarUsuario(new Usuarios("Usuario3"));
        lista.cadastrarUsuario(new Usuarios("Usuario4"));
        lista.cadastrarUsuario(new Usuarios("Usuario5"));
        lista.cadastrarUsuario(new Usuarios("Usuario6"));

        System.out.println("Lista de todos os usuários:");
        lista.listar();

        System.out.println("\nLista a partir da posição 3:");
        lista.listar(3);

        System.out.println("\nLista entre as posições 2 e 5:");
        lista.listar(1, 4);
    }	
}