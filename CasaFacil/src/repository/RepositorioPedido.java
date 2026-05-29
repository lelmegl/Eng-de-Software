package repository;

import domain.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositório aplicando o padrão SINGLETON.
 */
public class RepositorioPedido {
    // 1. Instância única
    private static RepositorioPedido instancia;
    private List<Pedido> pedidos;

    // 2. Construtor privado
    private RepositorioPedido() {
        this.pedidos = new ArrayList<>();
    }

    // 3. Acesso global
    public static RepositorioPedido getInstance() {
        if (instancia == null) {
            instancia = new RepositorioPedido();
        }
        return instancia;
    }

    public boolean salvarPedido(Pedido p) {
        return pedidos.add(p);
    }

    public boolean atualizarPedido(Pedido p) {
        // Na memória a referência já está atualizada, retornamos true.
        return true;
    }

    public Pedido buscarPorId(int id) {
        // Método simulado - na vida real faria a verificação do ID
        if (!pedidos.isEmpty()) {
            return pedidos.get(0); 
        }
        return null;
    }
}