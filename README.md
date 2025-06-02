![Decorator](/Decorator.jpg)

# Decorator - Pedido de Café

## Descrição
Este projeto simula um sistema de pedidos de café onde o cliente pode personalizar sua bebida com ingredientes adicionais (leite e chocolate). Cada item adicional aumenta o preço e a descrição do pedido.

## Padrão Utilizado
O padrão Decorator permite adicionar funcionalidades a um objeto de forma dinâmica, sem alterar sua estrutura. Ele envolve uma classe abstrata que envolve o componente original e adiciona novas responsabilidades.

Neste contexto:
- `Cafe` é o componente base.
- Os ingredientes adicionais `Leite` e `Chocolate` são **decorators concretos** que estendem `PedidoDecorator`, e cada um altera preço e descrição.

## Aluno
- **Nome**: João Vitor Amorim Lopes
- **Matrícula**: 0900043180
- **Curso**: Sistemas de Informação
