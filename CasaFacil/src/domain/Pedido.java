package domain;

import java.util.Date;

/**
 * Entidade central do sistema.
 * O status volta a ser controlado de forma simples por uma String.
 */
public class Pedido {
    private int idPedido;
    private double valorAcordado;
    private String detalhesProblema;
    private String status; // <-- Voltou a ser String
    private Date dataCriacao;
    
    private Cliente cliente;
    private Prestador prestador;
    private Pagamento pagamento;
    private Avaliacao avaliacao;

    public Pedido(int idPedido, Cliente cliente, String detalhesProblema) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.detalhesProblema = detalhesProblema;
        this.dataCriacao = new Date();
        this.status = "Criado"; // <-- Definido diretamente no construtor
    }

    public String getStatus() { 
        return status; 
    }

    public void setStatus(String status) { 
        this.status = status; 
    }

    public void setProposta(double valorAcordado, int prazo) {
        this.valorAcordado = valorAcordado;
    }

    public void vincularPrestadorFinal(Prestador prestador) {
        this.prestador = prestador;
    }

    public void vincularPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void vincularAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Prestador getPrestador() {
        return this.prestador;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public String getDadosCompletos() {
        return "Pedido [" + idPedido + "] - Status: " + status + " - Valor: R$" + valorAcordado;
    }
}