package domain;

import java.util.Arrays;
import java.util.List;

/**
 * Entidade responsável por verificar validade de categorias de serviço.
 */
public class CatalogoServico {
    // Simulando categorias cadastradas no sistema (1: Hidráulica, 2: Elétrica, etc.)
    private List<Integer> categoriasHabilitadas = Arrays.asList(1, 2, 3, 4, 5);

    // Mapeamento do UC02
    public boolean validarHabilitacao(int idCat) {
        return categoriasHabilitadas.contains(idCat);
    }
}