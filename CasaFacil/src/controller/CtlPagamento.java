package controller;

import domain.Pedido;
import repository.RepositorioPedido;

/**
 * Classe <<controller>> CtlPagamento.
 * Gerada a partir dos diagramas UML fornecidos.
 */
public class CtlPagamento {

    // Associações baseadas no Diagrama de Classes
    private RepositorioPedido repositorioPedido;
    // O diagrama mostra associação com GatewayPagamento, que é um ator, não uma classe local
    // Num sistema real, haveria um serviço de integração aqui.

    /**
     * Corresponde ao método '+ verificaSessaoAtivaCliente()' no Diagrama de Classes.
     */
    public void verificaSessaoAtivaCliente() {
        System.out.println("[CtlPagamento] Verificando sessão ativa do cliente.");
    }

    /**
     * Corresponde ao método '+ processarTransacao(Pedido, dadosCartao, valor)' no Diagrama de Classes.
     * Usei tipos esqueléticos (String, double) para os parâmetros simples.
     */
    public void processarTransacao(Pedido pedido, String dadosCartao, double valor) {
        System.out.println("[CtlPagamento] Processando transação para o pedido: " + pedido);
    }
}