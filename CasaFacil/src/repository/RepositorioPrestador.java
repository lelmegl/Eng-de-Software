package repository;

import domain.Prestador;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositório aplicando o padrão SINGLETON.
 */
public class RepositorioPrestador {
    // 1. Atributo estático da instância única
    private static RepositorioPrestador instancia; 
    private List<Prestador> prestadores;

    // 2. Construtor Privado
    private RepositorioPrestador() {
        this.prestadores = new ArrayList<>();
        // Dados fictícios para simular a base de dados
        prestadores.add(new Prestador(101, "João Encanador", "111", "joao@email.com", "123", "01000-000", 1, 10.0, 50.0, true));
        prestadores.add(new Prestador(102, "Maria Eletricista", "222", "maria@email.com", "123", "02000-000", 2, 15.0, 60.0, true));
    }

    // 3. Ponto de acesso global
    public static RepositorioPrestador getInstance() {
        if (instancia == null) {
            instancia = new RepositorioPrestador();
        }
        return instancia;
    }

    // Retorna todos os dados para o MotorMatching usar o 'for' clássico
    public List<Prestador> buscarTodos() {
        return this.prestadores;
    }
    
    public List<Prestador> buscarPorCategoriaELocalizacao(int idCat, String cep) {
        List<Prestador> result = new ArrayList<>();
        for(Prestador p : prestadores) {
            if(p.getCategoria() == idCat && p.getCep().equals(cep)) {
                 result.add(p);
            }
        }
        return result;
    }
}