package controller;

import domain.Pedido;
import domain.Prestador;
import repository.RepositorioPedido;

/**
 * Controlador responsável por orquestrar o fluxo do UC03 (Negociar Proposta).
 */
public class CtlNegociacao {

    private RepositorioPedido repoPedido;

    public CtlNegociacao(RepositorioPedido repoPedido) {
        this.repoPedido = repoPedido;
    }

    // Passo 9 do UC03
    public boolean registrarProposta(int idPedido, double valorProposta, int prazoProposta) {
        Pedido pedido = repoPedido.buscarPorId(idPedido);
        
        if (pedido != null) {
            pedido.setProposta(valorProposta, prazoProposta);
            
            // Padrão State: Avança de "Solicitado" para "Aguardando Aceite"
            pedido.processarProximaEtapa();
            
            // Atualiza na Collection
            return repoPedido.atualizarPedido(pedido);
        }
        return false;
    }

    // Passo 21 do UC03
    public boolean fecharAcordoTecnico(int idPedido) {
        Pedido pedido = repoPedido.buscarPorId(idPedido);
        
        if (pedido != null) {
            // Padrão State: Avança de "Aguardando Aceite" para "Aguardando Pagamento"
            pedido.processarProximaEtapa();
            
            // Transforma o prestador temporário no prestador definitivo da obra
            Prestador prestador = pedido.getPrestador();
            pedido.vincularPrestadorFinal(prestador);
            
            return repoPedido.atualizarPedido(pedido);
        }
        return false;
    }
}