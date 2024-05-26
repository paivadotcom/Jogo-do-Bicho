package JogoDoBicho.Modelos;

public class CarrinhoDeAposta {

    int numeroInseridoPeloUsuario;

    int numeroGeradoAleatorio;

    String valorPagoPeloUsuario;

    int premioPelaAposta;

    String modalidadeDeJogo;

    public String getModalidadeDeJogo() {
        return modalidadeDeJogo;
    }

    public void setModalidadeDeJogo(String modalidadeDeJogo) {
        this.modalidadeDeJogo = modalidadeDeJogo;
    }

    public int getNumeroInseridoPeloUsuario() {
        return numeroInseridoPeloUsuario;
    }

    public void setNumeroInseridoPeloUsuario(int numeroInseridoPeloUsuario) {
        this.numeroInseridoPeloUsuario = numeroInseridoPeloUsuario;
    }

    public int getNumeroGeradoAleatorio() {
        return numeroGeradoAleatorio;
    }

    public void setNumeroGeradoAleatorio(int numeroSorteado) {
        this.numeroGeradoAleatorio = numeroSorteado;
    }

    public String getValorPagoPeloUsuario() {
        return valorPagoPeloUsuario;
    }

    public void setValorPagoPeloUsuario(String valorPagoPeloUsuario) {
        this.valorPagoPeloUsuario = valorPagoPeloUsuario;
    }

    public int getPremioPelaAposta() {
        return premioPelaAposta;
    }

    public void setPremioPelaAposta(int premioPelaAposta) {
        this.premioPelaAposta = premioPelaAposta;
    }

    @Override
    public String toString() {

        return "Estilo de Jogo: " + this.getModalidadeDeJogo() + "Numero apostado: "
                + this.getNumeroInseridoPeloUsuario() + "Valor pago na aposta: " + this.getValorPagoPeloUsuario();
    }

}