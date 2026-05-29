package view;

import controller.CtlOrcamento;
import domain.Prestador;

import java.util.List;
import java.util.Scanner;

/**
 * Camada de Apresentação (Boundary).
 * Simula o ecrã do telemóvel no terminal. Só interage com o utilizador e o Controlador.
 */
public class GuiAssistente {

    private CtlOrcamento ctlOrcamento;
    private Scanner scanner;

    // A interface recebe o controlador pronto a usar (Baixo acoplamento)
    public GuiAssistente(CtlOrcamento ctlOrcamento) {
        this.ctlOrcamento = ctlOrcamento;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Mapeamento do Passo 1 do UC02: iniciarSolicitacao()
     * Simula o fluxo principal (Caminho Feliz) e interage com o terminal.
     */
    public void iniciarSolicitacao() {
        System.out.println("=== BEM-VINDO AO ASSISTENTE DE SERVIÇOS ===");
        System.out.print("Por favor, introduza o seu ID de Cliente (Tente o ID 1): ");
        int idCliente = Integer.parseInt(scanner.nextLine());

        // Passo 2: verificaStatusSessao
        System.out.println("[Sistema] A verificar sessão...");
        boolean isLogado = ctlOrcamento.verificaStatusSessao(idCliente);

        if (!isLogado) {
            System.out.println("[Erro] Utilizador não encontrado ou sem sessão iniciada.");
            return; // Fluxo alternativo (Encerra)
        }

        System.out.println("\n--- Sessão Validada! ---");
        
        // Passos 5 a 12: Recolha de dados (resumida para o simulador)
        System.out.print("Qual o tipo de problema? (Digite 1 para Hidráulica, 2 para Elétrica): ");
        int idCat = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduza o seu Código Postal (Tente '01000-000'): ");
        String cep = scanner.nextLine();

        // Passo 13: buscarProfissionaisAptos
        System.out.println("\n[Sistema] A procurar os melhores profissionais na sua região...");
        List<Prestador> prestadores = ctlOrcamento.buscarProfissionaisAptos(idCat, cep);

        // Passo 22: apresentarVitrine
        if (prestadores == null || prestadores.isEmpty()) {
            System.out.println("[Aviso] Não encontrámos prestadores ativos para esta categoria e região.");
            return; // Fluxo alternativo
        }

        System.out.println("\n--- Profissionais Encontrados ---");
        for (Prestador p : prestadores) {
            System.out.println(p.getDadosPerfil());
        }

        // Passos 23 a 25: Seleção e confirmação
        System.out.print("\nDigite o ID do Prestador que deseja selecionar: ");
        int idPrestador = Integer.parseInt(scanner.nextLine());

        System.out.print("Descreva brevemente o problema para o prestador: ");
        String descricao = scanner.nextLine();

        // Passo 26: formalizarPedido
        System.out.println("\n[Sistema] A formalizar o seu pedido...");
        boolean sucesso = ctlOrcamento.formalizarPedido(idCliente, idPrestador, descricao);

        // Passo 33: exibirFeedbackFinal
        if (sucesso) {
            System.out.println("[Sucesso] Pedido formalizado com sucesso! O prestador foi notificado.");
        } else {
            System.out.println("[Erro] Ocorreu uma falha ao registar o pedido.");
        }
        
        System.out.println("=== FIM DA SIMULAÇÃO ===");
    }
}