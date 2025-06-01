public class ComChocolate extends PedidoDecorator {

    public ComChocolate(Pedido pedido) {
        super(pedido);
    }

    public String getDescricao() {
        return getPedido().getDescricao() + ", com chocolate";
    }

    public float getPreco() {
        return getPedido().getPreco() + 2.0f;
    }
}