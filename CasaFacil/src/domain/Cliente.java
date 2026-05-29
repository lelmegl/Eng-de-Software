package domain;

/**
 * Representa o cliente no sistema.
 * Possui alta coesão: apenas mantém o estado e dados do cliente.
 */
public class Cliente {
    private String nome, cpf, email, senha, cep, telefone;
    private int idCliente;
    private boolean statusSessao;

    public Cliente(int id, String nome, String cpf, String email, String senha, String cep, String telefone, boolean status) {
        this.idCliente = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.cep = cep;
        this.telefone = telefone;
        this.statusSessao = status;
    }

    // Método identificado no diagrama de sequência para checar acesso
    public boolean isLogado() {
        return this.statusSessao;
    }

    // Getters e Setters de encapsulamento
    public int getIdCliente() {
        return idCliente;
    }

    public void setStatusSessao(boolean statusSessao) {
        this.statusSessao = statusSessao;
    }
}

