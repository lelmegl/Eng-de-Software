package repository;

import domain.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositório aplicando o padrão SINGLETON.
 */
public class RepositorioUsuario {
    private static RepositorioUsuario instancia;
    private List<Cliente> clientes;

    private RepositorioUsuario() {
        this.clientes = new ArrayList<>();
        // Mock do Cliente para testar
        clientes.add(new Cliente(1, "Carlos", "123", "carlos@email.com", "123", "01000-000", "999", true)); 
    }

    public static RepositorioUsuario getInstance() {
        if (instancia == null) {
            instancia = new RepositorioUsuario();
        }
        return instancia;
    }

    public Cliente buscarPorId(int id) {
        // Método simulado
        if (!clientes.isEmpty()) {
            return clientes.get(0);
        }
        return null;
    }
}