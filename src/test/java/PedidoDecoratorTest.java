import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoDecoratorTest {

    @Test
    void deveRetornarDescricaoCafeSimples() {
        Pedido pedido = new CafeBase();
        assertEquals("Café simples", pedido.getDescricao());
    }

    @Test
    void deveRetornarPrecoCafeSimples() {
        Pedido pedido = new CafeBase();
        assertEquals(4.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarDescricaoCafeComLeite() {
        Pedido pedido = new ComLeite(new CafeBase());
        assertEquals("Café simples, com leite", pedido.getDescricao());
    }

    @Test
    void deveRetornarPrecoCafeComLeite() {
        Pedido pedido = new ComLeite(new CafeBase());
        assertEquals(5.5f, pedido.getPreco());
    }

    @Test
    void deveRetornarDescricaoCafeComChocolate() {
        Pedido pedido = new ComChocolate(new CafeBase());
        assertEquals("Café simples, com chocolate", pedido.getDescricao());
    }

    @Test
    void deveRetornarPrecoCafeComChocolate() {
        Pedido pedido = new ComChocolate(new CafeBase());
        assertEquals(6.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarDescricaoCafeComLeiteEChocolate() {
        Pedido pedido = new ComChocolate(new ComLeite(new CafeBase()));
        assertEquals("Café simples, com leite, com chocolate", pedido.getDescricao());
    }

    @Test
    void deveRetornarPrecoCafeComLeiteEChocolate() {
        Pedido pedido = new ComChocolate(new ComLeite(new CafeBase()));
        assertEquals(7.5f, pedido.getPreco());
    }
}