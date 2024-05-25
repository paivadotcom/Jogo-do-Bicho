package JogoDoBicho;

import javax.swing.JOptionPane;
import JogoDoBicho.Modelos.Botoes;
import JogoDoBicho.Modelos.Menu;

public class Principal {
    public static void main(String[] args) {

        Botoes novoBotao = new Botoes();

        int primeiroPainel = novoBotao.getPalnelInicial();

        switch (primeiroPainel) {
            case JOptionPane.YES_OPTION:
                Menu.main(args);
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
                break;

            default:
                break;
        }

    }

}