package service;

import domain.Prestador;
import repository.RepositorioPrestador;

import java.util.ArrayList;
import java.util.List;

/**
 * Serviço responsável por cruzar as necessidades do cliente com os prestadores.
 */
public class MotorMatching {
    
    public List<Prestador> processarMatching(int idCat, String cep) {
        List<Prestador> prestadoresAptos = new ArrayList<>();
        
        // Acessa o Singleton do repositório para obter todos os prestadores
        List<Prestador> todos = RepositorioPrestador.getInstance().buscarTodos();

        // Utiliza o clássico laço 'for' (Sem o padrão Iterator)
        for (Prestador p : todos) {
            if (p.getCategoria() == idCat && p.getCep().equals(cep) && p.isLogado()) {
                prestadoresAptos.add(p);
            }
        }
        
        System.out.println("[MotorMatching] Processamento concluído. Encontrados " + prestadoresAptos.size() + " prestadores.");
        return prestadoresAptos;
    }
}