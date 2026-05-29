import controller.CtlOrcamento;
import view.GuiAssistente;

public class Main {
    public static void main(String[] args) {

        CtlOrcamento ctl = new CtlOrcamento();
        GuiAssistente assistente = new GuiAssistente(ctl);
  
        System.out.println("Sistema CASAFACIL Iniciado...");
        
   
    }
}