package controller;

import domain.Pedido;
import domain.Cliente;
import domain.Prestador;
import domain.CatalogoServico;
import repository.RepositorioPedido;
import repository.RepositorioUsuario;
import service.MotorMatching;
import java.util.List;

/**
 * Classe <<facade>>
 * Oculta a complexidade de criar pedidos e fazer o matching da Interface (View).
 */
public class CtlOrcamento {
    
    private MotorMatching motor;
    private CatalogoServico catalogo;

    public CtlOrcamento() {
        this.motor = new MotorMatching();
        this.catalogo = new CatalogoServico();
    }

    public boolean verificaStatusSessao(int idCliente) {
        // Usa o Singleton do utilizador
        Cliente c = RepositorioUsuario.getInstance().buscarPorId(idCliente);
        return c != null && c.isLogado();
    }

    public List<Prestador> buscarProfissionaisAptos(int idCat, String cep) {
        // Simulação do catalogo
        return motor.processarMatching(idCat, cep);
    }

    public boolean formalizarPedido(int idCliente, int idPrestador, String detalhes) {
        // Usa o Singleton para encontrar o cliente
        Cliente cliente = RepositorioUsuario.getInstance().buscarPorId(idCliente);
        
        int novoIdPedido = (int) (Math.random() * 1000); 
        Pedido novoPedido = new Pedido(novoIdPedido, cliente, detalhes);
        
        // Define o Status de forma simples usando a String
        novoPedido.setStatus("Solicitado"); 
        
        // Salva utilizando o Singleton de Pedidos
        return RepositorioPedido.getInstance().salvarPedido(novoPedido);
    }
}