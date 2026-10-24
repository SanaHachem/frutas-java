
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Clientes cadastrados
        ArrayList<Cliente> clientes =
            Cliente.cadastrarClientes();

        System.out.println("CLIENTES CADASTRADOS");

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + " - " +
                clientes.get(i).nome);
        }

        System.out.print("Escolha seu cliente: ");
        int opcaoCliente = entrada.nextInt();

        if (opcaoCliente < 1 ||
            opcaoCliente > clientes.size()) {
            System.out.println("Cliente invalido!");
            return;
        }

        Cliente cliente = clientes.get(opcaoCliente - 1);

        // Lista de bananas
        ArrayList<Banana> bananas = new ArrayList<>();

        bananas.add(new Banana("Nanica", 10));
        bananas.add(new Banana("Prata", 15));
        bananas.add(new Banana("Maca", 8));

        System.out.println("\nOla, " + cliente.nome);
        System.out.println("BANANAS DISPONIVEIS");

        for (int i = 0; i < bananas.size(); i++) {
            Banana b = bananas.get(i);

            System.out.println((i + 1) + " - Banana " +
                b.nome + " | Estoque: " + b.quantidade);
        }

        System.out.print("Escolha a banana: ");
        int escolha = entrada.nextInt();

        if (escolha < 1 || escolha > bananas.size()) {
            System.out.println("Opcao invalida!");
            return;
        }

        Banana selecionada = bananas.get(escolha - 1);

        System.out.print("Quantidade para comprar: ");
        int quantidade = entrada.nextInt();

        if (quantidade > 0 &&
            quantidade <= selecionada.quantidade) {

            selecionada.quantidade -= quantidade;

            System.out.println("\nCOMPRA REALIZADA!");
            System.out.println("Cliente: " + cliente.nome);
            System.out.println("Banana: " + selecionada.nome);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Estoque restante: " +
                selecionada.quantidade);

        } else {
            System.out.println("Quantidade indisponivel!");
        }

        entrada.close();
    }
}

