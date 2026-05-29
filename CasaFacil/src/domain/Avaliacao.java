package domain;

import java.util.Date;

/**
 * Representa o feedback final dado pelo cliente.
 */
public class Avaliacao {
    private int idAvaliacao;
    private int nota;
    private String comentario;
    private Date data;

    public Avaliacao(int idAvaliacao, int nota, String comentario, Date data) {
        this.idAvaliacao = idAvaliacao;
        this.nota = nota;
        this.comentario = comentario;
        this.data = data;
    }

    public int getIdAvaliacao() { return idAvaliacao; }
    public int getNota() { return nota; }
    public String getComentario() { return comentario; }
    public Date getData() { return data; }
}