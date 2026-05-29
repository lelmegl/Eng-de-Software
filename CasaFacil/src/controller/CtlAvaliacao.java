package controller;

import domain.Pedido;
import repository.RepositorioPedido;

/**
 * Classe <<controller>> CtlAvaliacao.
 * Gerada a partir dos diagramas UML fornecidos.
 */
public class CtlAvaliacao {

    // Associações baseadas no Diagrama de Classes
    private RepositorioPedido repositorioPedido;
    // O diagrama também mostra associação com Cliente

    /**
     * Corresponde ao método '+ verificarAcessoAtiva(idCliente)' no Diagrama de Classes.
     * Adicionei o tipo 'int' para o parâmetro com base em padrões comuns.
     */
    public void verificarAcessoAtiva(int idCliente) {
        System.out.println("[CtlAvaliacao] Verificando acesso ativo para o cliente ID: " + idCliente);
    }

    /**
     * Corresponde ao método '+ processarEncerramento(Pedido, nota, comentario)' no Diagrama de Classes.
     * Adicionei tipos (int, String) para os parâmetros simples.
     */
    public void processarEncerramento(Pedido pedido, int nota, String comentario) {
        System.out.println("[CtlAvaliacao] Processando encerramento para o pedido: " + pedido);
    }
}