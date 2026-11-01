package ao.kafi.api.exception;

public class ProdutoNaoEncontradoException
        extends RuntimeException {

    public ProdutoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}