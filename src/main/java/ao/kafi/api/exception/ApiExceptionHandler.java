package ao.kafi.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(ProdutoNaoEncontradoException.class)
    public ProblemDetail tratarProdutoNaoEncontrado(
            ProdutoNaoEncontradoException erro) {

        ProblemDetail detalhe = ProblemDetail.forStatusAndDetail(
            HttpStatus.NOT_FOUND,
            erro.getMessage()
        );

        detalhe.setTitle("Produto não encontrado");

        return detalhe;
    }
}