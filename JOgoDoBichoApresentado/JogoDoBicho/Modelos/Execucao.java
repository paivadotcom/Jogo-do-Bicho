package JogoDoBicho.Modelos;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import JogoDoBicho.Library.ExecutarTexts;
import JogoDoBicho.Usuario.CarteiraDoUsuario;

public class Execucao {

    public static int motor() {

        ArrayList<CarrinhoDeAposta> listaDeApostas = new ArrayList<>();

        Botoes novoBotao = new Botoes();

        CarteiraDoUsuario novaCarteira = new CarteiraDoUsuario();
        int contador = 0;

        while (true) {

            if (contador >= 1) {
                switch (novoBotao.jogarNovamente()) {
                    case JOptionPane.YES_OPTION:

                        break;
                    case JOptionPane.NO_OPTION:
                        System.exit(0);
                    default:
                        break;
                }

            }
            // informa que o usuario esta sem saldo
            contador++;
            if (novaCarteira.getCarteira() <= 0) {

                JOptionPane.showMessageDialog(null, ExecutarTexts.texto1);
                return 0;
            }
            switch (novoBotao.getEstiloDeJogo()) {
                case 0: // Tabela Animal
                    JOptionPane.showMessageDialog(null,
                            """
                                    Para animal:
                                    Se apostar R$ 10,00 = premio vai ser R$ 20,00!
                                    Se apostar R$ 20,00 = premio vai ser R$ 40,00!
                                    Se apostar R$ 30,00 = premio vai ser R$ 60,00!
                                    Se apostar R$ 40,00 = premio vai ser R$ 80,00!
                                        """);

                    // Leva até o metodo que faz a cobrança para jogar
                    FerramentaDeNumeros.valorDosJogos();

                    // Executa a class onde estão o animais
                    TabelaAnimal.main(null);
                    break;
                case 1: // Milhar
                    JOptionPane.showMessageDialog(null,
                            """
                                    Para Milhar:
                                    Se apostar R$ 10,00 = premio vai ser R$ 10.000,00!
                                    Se apostar R$ 20,00 = premio vai ser R$ 20.000,00!
                                    Se apostar R$ 30,00 = premio vai ser R$ 30.000,00!
                                    Se apostar R$ 40,00 = premio vai ser R$ 40.000,00!
                                        """);
                    // Leva até o metodo que faz a cobrança para jogar
                    FerramentaDeNumeros.valorDosJogos();


                    // Leva até metodo que valida a escolha em milhar
                    FerramentaDeNumeros.ValidaEscolhaMilhar(FerramentaDeNumeros.numeroAleatorioEmMilhar());
                    

                    
                    // Vê o reultado dos outros Jogos
                    if (novoBotao.verOutrosJogos() == JOptionPane.YES_OPTION) {

                        FerramentaDeNumeros.resultadoDeTodosOsJogos(FerramentaDeNumeros.numeroAleatorioEmMilhar());
                    }
                    break;
                case 2:// Centena
                    JOptionPane.showMessageDialog(null,
                            """
                                    Para Centena:
                                    Se apostar R$ 10,00 = premio vai ser R$ 2.000,00!
                                    Se apostar R$ 20,00 = premio vai ser R$ 3.000,00!
                                    Se apostar R$ 30,00 = premio vai ser R$ 4.000,00!
                                    Se apostar R$ 40,00 = premio vai ser R$ 5.000,00!
                                        """);
                    // Leva até o metodo que faz a cobrança para jogar
                    FerramentaDeNumeros.valorDosJogos();

                    // Leva até metodo que valida a escolha em milhar
                    FerramentaDeNumeros.ValidaEscolhaCentena(FerramentaDeNumeros.numeroAleatorioEmMilhar());

                    // Vê o reultado dos outros Jogos
                    if (novoBotao.verOutrosJogos() == JOptionPane.YES_OPTION) {
                        FerramentaDeNumeros.resultadoDeTodosOsJogos(FerramentaDeNumeros.numeroAleatorioEmMilhar());
                    }
                    break;
                case 3:// Dezena
                    JOptionPane.showMessageDialog(null,
                            """
                                    Para Dezena:
                                    Se apostar R$ 10,00 = premio vai ser R$ 100,00!
                                    Se apostar R$ 20,00 = premio vai ser R$ 200,00!
                                    Se apostar R$ 30,00 = premio vai ser R$ 300,00!
                                    Se apostar R$ 40,00 = premio vai ser R$ 400,00!
                                        """);
                    // Leva até o metodo que faz a cobrança para jogar
                    FerramentaDeNumeros.valorDosJogos();

                    // Leva até metodo que valida a escolha em milhar
                    FerramentaDeNumeros.ValidaEscolhaDezena(FerramentaDeNumeros.numeroAleatorioEmMilhar());

                    // Vê o reultado dos outros Jogos
                    if (novoBotao.verOutrosJogos() == JOptionPane.YES_OPTION) {
                        FerramentaDeNumeros.resultadoDeTodosOsJogos(FerramentaDeNumeros.numeroAleatorioEmMilhar());
                    }

                    System.exit(0);
                    break;

                case 4:

                    // Volta para o Menu
                    Menu.main(null);
                    break;

                default:
            }

            CarrinhoDeAposta novaAposta = new CarrinhoDeAposta(FerramentaDeNumeros.numeroDoUsuario,FerramentaDeNumeros.tipoDeJogo, FerramentaDeNumeros.precoTickt);
            listaDeApostas.add(novaAposta);
        }

    }

}
