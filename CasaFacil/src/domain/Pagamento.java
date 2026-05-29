package domain;

/**
 * Representa a transação financeira de um pedido.
 */
public class Pagamento {
    private int idPagamento;
    private String tokenFinanceiro;
    private double valor;

    public Pagamento(int idPagamento, String tokenFinanceiro, double valor) {
        this.idPagamento = idPagamento;
        this.tokenFinanceiro = tokenFinanceiro;
        this.valor = valor;
    }

    public int getIdPagamento() { return idPagamento; }
    public String getTokenFinanceiro() { return tokenFinanceiro; }
    public double getValor() { return valor; }
}