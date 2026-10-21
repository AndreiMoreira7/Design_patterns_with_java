package Facade;

public class PedidoFacade {
    // Definir os atributos para armazenar as referencias dos subsistemas (Estoque , Financeiro , PosVenda)
    private Estoque estoque;
    private Financeiro financeiro;
    private PosVenda posVenda;


    public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posvenda) {
        // Inicializar os atributos da fachada via construtor
        this.estoque = estoque;
        this.financeiro = financeiro;
        this.posVenda = posvenda;
    }

    // Comportamento : Orquestrar as chamadas sequenciais para Estoque, Financeiro e PosVenda a partir do Pedido recebido .
    public void registraPedido(Pedido p){
        // Invocar o envio do produto no Estoque
        // Invocar a geracao da fatura no Financeiro
        // Invocar o agendamento no PosVenda
        estoque.enviaProduto(p.getProduto(), p.getEnderecoDeEntrega());
        financeiro.fatura(p.getCliente(),p.getProduto());
        posVenda.agendaContato(p.getCliente(),p.getProduto());
    }
}
