package JogoDoBicho.Modelos;

// import java.util.Random;
import javax.swing.JOptionPane;

import JogoDoBicho.Library.FerramentaDeNumerosTexts;
import JogoDoBicho.Usuario.CarteiraDoUsuario;

public class FerramentaDeNumeros {

    static int milhar;
    static int centena;
    static int dezena;
    static int unidade;
    static int numeroSorteado = numeroAleatorioEmMilhar();
    static int premio;

    // Essa variavel é utulizada em todos os Metodos
    private static boolean entradaValida = false;

    // Variaveis utilidas nos Metodos ValidaEscolhaMilhar e PremiaMilhar
    static int numeroApostadoMilhar = 0;
    static int numeroDesmembradoMilhar = 0;

    // Variaveis utilidas nos Metodos ValidaEscolhaCentena e PremiaCentena
    static int numeroApostadoCentena = 0;
    static int numeroDesmembradoCentena = 0;

    // Variaveis utilidas nos Metodos ValidaEscolhaDezena e PremiaDezena
    static int numeroApostadoDezena = 0;
    static int numeroDesmembradoDezena = 0;

    public static CarteiraDoUsuario novaCarteira = new CarteiraDoUsuario();
    public static Botoes novoBotao = new Botoes();

    public static void main(String[] args) {

        desmembrarNumero(numeroSorteado,"");
        ValidaEscolhaMilhar(numeroSorteado);

    }

    // Aqui é gerado o numero aleatorio
    public static int numeroAleatorioEmMilhar() {
        // Random aleatorio = new Random();

        int numeroAleatorioEmMilhar = 5263; // aleatorio.nextInt(9000) + 1000;

        return numeroAleatorioEmMilhar;
    }

    /*
     * recebe um numero aleatorio e desmebra ele para ser usando nas validações de
     * Milhar, Centena, Dezena
     */
    public static int desmembrarNumero(int numeroAleatorioEmMilhar, String tipo) {

        if (tipo.equals("milhar")) {

            return numeroAleatorioEmMilhar;

        } else if (tipo.equals("centena")) {

            return numeroAleatorioEmMilhar % 1000;

        } else if (tipo.equals("dezena")) {

            return numeroAleatorioEmMilhar % 100;

        }else if (tipo.equals("unidade")) {
            
            return numeroAleatorioEmMilhar % 10;

        }else{
            return 0;
        }

       

    }

    /*
     * Aqui acontece o jogo de milhar onde é relizada valição do numero inserido
     * pelo usuario, a compração dos numeros e tambem para o usuario
     */
    public static void ValidaEscolhaMilhar(int numeroAleatorioEmMilhar) {

        do { // Valida escolha Milhar
            int numeroDoUsuario = Integer
                    .parseInt(JOptionPane.showInputDialog(null, FerramentaDeNumerosTexts.texto1));

            numeroApostadoMilhar = numeroDoUsuario;

            // Validar a entrada do usuário
            if (numeroApostadoMilhar < 1000 || numeroApostadoMilhar > 9999) {
                JOptionPane.showMessageDialog(null, FerramentaDeNumerosTexts.texto1_2);
            } else {
                entradaValida = true;
            }
        } while (!entradaValida);

        numeroDesmembradoMilhar = desmembrarNumero(numeroAleatorioEmMilhar, "milhar");

        Botoes.NovoJogoFinalizar();// Aqui é chamado o Painel onde aparece os botões

        if (Botoes.salvaNovoJogoFinalizar == 2)// Aqui é utilizado o valor dos botões para autorizar a ação
        {
            System.out.println("Acessou o painel NovoJogo Finalizar");
            // se o numero apostado for igual ao numero desmebrado
            if (numeroApostadoMilhar == numeroDesmembradoMilhar) {
                JOptionPane.showMessageDialog(null, FerramentaDeNumerosTexts.texto1_3
                        + numeroAleatorioEmMilhar);
                System.out.println("Numero que o usuario digitou: " + numeroApostadoMilhar);

            } else {
                // Caso o numero sorteado em milhar esteja errado
                JOptionPane.showMessageDialog(null, FerramentaDeNumerosTexts.texto1_4
                        + numeroAleatorioEmMilhar);
                System.out.println("Numero que o usuario digitou: " + numeroApostadoMilhar);
            }
            PremiaMilhar(numeroAleatorioEmMilhar);
        }

    }

    // Metodo que paga ao usuario o premio dele
    private static void PremiaMilhar(int numeroAleatorioEmMilhar) {
        System.out.println("Acessou o metodo PremiaMilhar");

        if (numeroApostadoMilhar == numeroDesmembradoMilhar) {
            // 10 Reais
            if (Botoes.salvaValor == 0) {
                premio += 10000;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);

            } // 20 reais
            else if (Botoes.salvaValor == 1) {
                premio += 20000;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            } // 30 reais
            else if (Botoes.salvaValor == 2) {
                premio += 30000;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            } // 40 reais
            else if (Botoes.salvaValor == 3) {
                premio += 40000;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            }
            premio = 0;
        }

    }

    /*
     * Aqui acontece o jogo de Centena onde é relizada valição do numero inserido
     * pelo usuario, a compração dos numeros e tambem para o usuario
     */
    public static void ValidaEscolhaCentena(int numeroAleatorioEmMilhar) {

        do { // Valida escolha Centena
            int numeroDoUsuario = Integer
                    .parseInt(JOptionPane.showInputDialog(null, FerramentaDeNumerosTexts.texto2));

            numeroApostadoCentena = numeroDoUsuario;

            // Validar a entrada do usuário
            if (numeroApostadoCentena < 100 || numeroApostadoCentena > 999) {
                JOptionPane.showMessageDialog(null, FerramentaDeNumerosTexts.texto2_2);
            } else {
                entradaValida = true;
            }
        } while (!entradaValida);

        numeroDesmembradoCentena = desmembrarNumero(numeroAleatorioEmMilhar, "centena");

        Botoes.NovoJogoFinalizar();// Aqui é chamado o Painel onde aparece os botões

        if (Botoes.salvaNovoJogoFinalizar == 2) // Aqui é utilizado o valor dos botões para autorizar a ação
        {
            System.out.println("Acessou o painel NovoJogo Finalizar");
            // se o numero apostado for igual ao numero desmebrado
            if (numeroApostadoCentena == numeroDesmembradoCentena) {
                JOptionPane.showMessageDialog(null,
                        FerramentaDeNumerosTexts.texto2_3 + numeroAleatorioEmMilhar % 1000);
                // Mensage que acertou
                System.out.println("Numero que o usuario digitou: " + numeroApostadoCentena);

            } else {

                // Caso o numero sorteado em centena esteja errado
                JOptionPane.showMessageDialog(null,
                        FerramentaDeNumerosTexts.texto2_4 + numeroAleatorioEmMilhar % 1000);
                        
                // Menssage que errou
                System.out.println("Numero que o usuario digitou: " + numeroApostadoCentena);
            }
            PremiaCentena(numeroAleatorioEmMilhar);
        }

    }

    // Metodo que paga ao usuario o premio dele
    public static void PremiaCentena(int numeroAleatorioEmMilhar) {

        System.out.println("Acessou o metodo PremiaCentena");

        if (numeroApostadoCentena == numeroDesmembradoCentena) {
            // 10 Reais
            if (Botoes.salvaValor == 0) {
                premio += 2000;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            } // 20 reais
            else if (Botoes.salvaValor == 1) {
                premio += 3000;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            } // 30 reais
            else if (Botoes.salvaValor == 2) {
                premio += 4000;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            } // 40 reais
            else if (Botoes.salvaValor == 3) {
                premio += 5000;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            }
            premio = 0;
        }

    }

    /*
     * Aqui acontece o jogo de Dezena onde é relizada valição do numero inserido
     * pelo usuario, a compração dos numeros e tambem para o usuario
     */
    public static void ValidaEscolhaDezena(int numeroAleatorioEmMilhar) {

        do {
            // Valida escolha Dezena
            int numeroDoUsuario = Integer
                    .parseInt(JOptionPane.showInputDialog(null, FerramentaDeNumerosTexts.texto3));

            numeroApostadoDezena = numeroDoUsuario;

            // Validar a entrada do usuário
            if (numeroApostadoDezena < 10 || numeroApostadoDezena > 99) {
                JOptionPane.showMessageDialog(null, FerramentaDeNumerosTexts.texto3_2);
            } else {
                entradaValida = true;
            }
        } while (!entradaValida);

        numeroDesmembradoDezena = desmembrarNumero(numeroAleatorioEmMilhar, "dezena");

        Botoes.NovoJogoFinalizar();// Aqui é chamado o Painel onde aparece os botões

        if (Botoes.salvaNovoJogoFinalizar == 2)// Aqui é utilizado o valor dos botões para autorizar a ação
        {
            System.out.println("Acessou o painel NovoJogo Finalizar");
            // se o numero apostado for igual ao numero desmebrado
            if (numeroApostadoDezena == numeroDesmembradoDezena) {
                JOptionPane.showMessageDialog(null, FerramentaDeNumerosTexts.texto3_3
                        + numeroAleatorioEmMilhar % 100);
                System.out.println("Numero que o usuario digitou: " + numeroApostadoDezena);

            } else {

                // Caso o numero sorteado em centena esteja errado
                JOptionPane.showMessageDialog(null,
                        FerramentaDeNumerosTexts.texto3_4 + numeroAleatorioEmMilhar % 100);
                System.out.println("Numero que o usuario digitou: " + numeroApostadoDezena);
            }
            PremiaDezena(numeroAleatorioEmMilhar);
        }
    }

    public static void PremiaDezena(int numeroAleatorioEmMilhar) {
        System.out.println("Acessou o metodo PremiaDezena");

        if (numeroApostadoDezena == numeroDesmembradoDezena) {

            // 10 Reais
            if (Botoes.salvaValor == 0) {
                premio += 100;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            } // 20 reais
            else if (Botoes.salvaValor == 1) {
                premio += 200;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            } // 30 reais
            else if (Botoes.salvaValor == 2) {
                premio += 300;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            } // 40 reais
            else if (Botoes.salvaValor == 3) {
                premio += 400;
                novaCarteira.depositarPremioNaCarteira(premio);
                JOptionPane.showMessageDialog(null, "Parabens vc ganhou " + premio);
            }
            premio = 0;
        }

    }

    public static void resultadoDeTodosOsJogos(int numeroAleatorioEmMilhar) {

        JOptionPane.showMessageDialog(null,
                FerramentaDeNumerosTexts.texto3_5 + numeroAleatorioEmMilhar + FerramentaDeNumerosTexts.texto3_5_6 + numeroAleatorioEmMilhar % 1000
                        + FerramentaDeNumerosTexts.texto3_5_6_7 + numeroAleatorioEmMilhar % 100);

    }

    /*
     * Aqui é onde o usuario escolher o valor que ele quer apostar, sendo os valores
     * 10, 20, 30, 40
     */
    public static void valorDosJogos() {
        var novoBotao = new Botoes();
        var novaCarteira = new CarteiraDoUsuario();
        switch (novoBotao.valorDaAposta()) {
            case 0:

                // Cobrar um valor da cateira toda vez que paga para jogar
                novaCarteira.debitarDaCarteira(novaCarteira.getCarteira(), FerramentaDeNumerosTexts.number1);

                break;
            case 1:

                // Cobrar um valor da cateira toda vez que paga para jogar
                novaCarteira.debitarDaCarteira(novaCarteira.getCarteira(), FerramentaDeNumerosTexts.number2);

                break;
            case 2:

                // Cobrar um valor da cateira toda vez que paga para jogar
                novaCarteira.debitarDaCarteira(novaCarteira.getCarteira(), FerramentaDeNumerosTexts.number3);

                break;
            case 3:

                // Cobrar um valor da cateira toda vez que paga para jogar
                novaCarteira.debitarDaCarteira(novaCarteira.getCarteira(), FerramentaDeNumerosTexts.number4);

                break;
            case 4:

                // Volta para o Menu
                Menu.main(null);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }

    }

}