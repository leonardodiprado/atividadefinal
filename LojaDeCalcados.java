package AtividadeFinal;

public class LojaDeCalcados {
    public static void main(String[] args) {
        Tenis tenis = new Tenis("nike", 900.00, 42, "branco");
        Chinelo chinelo = new Chinelo("havaianas", 50.00, 39, "azul");

        Cliente cliente1 = new Cliente("Chico", "Avenida X, 12");
        Cliente cliente2 = new Cliente("Bento", "Rua Y, 34");

        double precoVenda1 = tenis.getPreco();
        System.out.println(cliente1.getNome() + " comprou:");
        System.out.println(tenis.getDescricao());
        System.out.println("Preço: R$" + precoVenda1);
        System.out.println("Endereço de entrega: " + cliente1.getEndereco());

        double precoVenda2 = chinelo.getPreco();
        System.out.println("\n" + cliente2.getNome() + " comprou:");
        System.out.println(chinelo.getDescricao());
        System.out.println("Preço: R$" + precoVenda2);
        System.out.println("Endereço de entrega: " + cliente2.getEndereco());

        processarPagamento(cliente1, precoVenda1);
        processarPagamento(cliente2, precoVenda2);
    }

    private static void processarPagamento(Cliente cliente, double valor) {
        System.out.println("\nProcessando pagamento para " + cliente.getNome() + " no valor de R$ " + valor);
        System.out.println("Pagamento realizado com sucesso.");
    }
}