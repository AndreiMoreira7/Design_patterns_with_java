    package Facade;

    public class TestePedidoFacade {
        public static void main(String[] args) {
            // Instanciar os subsistemas (Estoque , Financeiro , PosVenda)
            // Instanciar a fachada PedidoFacade passando os subsistemas criados
            // Instanciar um objeto Pedido com dados de teste
            // Executar o metodo registraPedido através da fachada
            Estoque estoque = new Estoque();
            Financeiro financeiro = new Financeiro();
            PosVenda posVenda = new PosVenda();
            PedidoFacade pedidoFacade = new PedidoFacade(estoque, financeiro, posVenda);
            Pedido pedido = new Pedido("Memória Ram 16Gb", "Anonymus", "Rua dos Bobos, 0");
            pedidoFacade.registraPedido(pedido);
        }
    }
