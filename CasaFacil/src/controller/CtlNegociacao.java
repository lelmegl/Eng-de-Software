package controller;

import domain.Pedido;
import repository.RepositorioPedido;

/**
 * Classe <<facade>>
 */
public class CtlNegociacao {

    public void registrarProposta(int idPedido, double valor, int prazo) {
        Pedido pedido = RepositorioPedido.getInstance().buscarPorId(idPedido);
        if(pedido != null) {
            pedido.setProposta(valor, prazo);
            RepositorioPedido.getInstance().atualizarPedido(pedido);
        }
    }

    public boolean fecharAcordoTecnico(int idPedido) {
        Pedido pedido = RepositorioPedido.getInstance().buscarPorId(idPedido);
        
        if (pedido != null) {
            // Atualiza o Status de forma simples usando a String
            pedido.setStatus("Aguardando Pagamento");
            return RepositorioPedido.getInstance().atualizarPedido(pedido);
        }
        return false;
    }
    
    public void avaliarProposta() {
        System.out.println("[CtlNegociacao] Avaliando proposta...");
    }
}