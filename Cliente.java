
import java.util.ArrayList;

public class Cliente {

    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public static ArrayList<Cliente> cadastrarClientes() {

        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Ana"));
        clientes.add(new Cliente("Maria"));
        clientes.add(new Cliente("Joao"));

        return clientes;
    }
}
