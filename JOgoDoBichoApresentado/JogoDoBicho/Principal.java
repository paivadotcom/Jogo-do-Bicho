package JogoDoBicho;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import JogoDoBicho.Modelos.Botoes;
import JogoDoBicho.Modelos.CarrinhoDeAposta;
import JogoDoBicho.Modelos.FerramentaDeNumeros;
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



        var novoCarroDeAposta = new CarrinhoDeAposta();
        novoCarroDeAposta.setNumeroGeradoAleatorio(FerramentaDeNumeros.numeroSorteado);
        novoCarroDeAposta.setNumeroInseridoPeloUsuario(FerramentaDeNumeros.numeroApostadoMilhar);
        novoCarroDeAposta.setValorPagoPeloUsuario(FerramentaDeNumeros.resultadoPreco);

        System.out.println("acessou o main");

        ArrayList<CarrinhoDeAposta> listaDeApostas = new ArrayList<>();
        listaDeApostas.add(novoCarroDeAposta);
        System.out.println("testando array: " + listaDeApostas.get(0).toString());
        System.out.println(listaDeApostas.size());

    }

}


















                                  












