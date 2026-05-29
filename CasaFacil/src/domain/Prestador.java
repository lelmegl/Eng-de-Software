package domain;

public class Prestador {
    private int idPrestador;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String cep;
    private int idCategoria;
    private double raioAtendimento;
    private double valorHora;
    private boolean logado;

    // CONSTRUTOR COMPLETO (Para resolver o erro de "actual and formal argument lists differ")
    public Prestador(int id, String nome, String cpf, String email, String senha, String cep, int idCategoria, double raio, double valor, boolean logado) {
        this.idPrestador = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.cep = cep;
        this.idCategoria = idCategoria;
        this.raioAtendimento = raio;
        this.valorHora = valor;
        this.logado = logado;
    }

    // MÉTODOS GETTERS (Para resolver o erro de "cannot find symbol" no MotorMatching)
    public int getCategoria() {
        return idCategoria;
    }

    public String getCep() {
        return cep;
    }

    public boolean isLogado() {
        return logado;
    }

    // Se precisar de outros getters futuramente, pode adicioná-los aqui
    public String getNome() {
        return nome;
    }
}