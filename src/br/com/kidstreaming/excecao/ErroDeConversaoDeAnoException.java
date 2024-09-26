package br.com.kidstreaming.excecao;

/*Se extender de Throwable todos terão que criar um try catch por isso vamos utilizar o RuntimeException*/
public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
