public class ComLeite extends PedidoDecorator {

    public ComLeite(Pedido pedido) {
        super(pedido);
    }

    public String getDescricao() {
        return getPedido().getDescricao() + ", com leite";
    }

    public float getPreco() {
        return getPedido().getPreco() + 1.5f;
    }
}
