package ao.kafi.api.mapper;

import java.math.BigDecimal;

import ao.kafi.api.dto.ProdutoResponse;
import ao.kafi.api.model.Produto;

public final class ProdutoMapper {

    private ProdutoMapper() {
    }

    public static ProdutoResponse paraResponse(Produto produto) {
        return new ProdutoResponse(
            produto.getId(),
            produto.getCodigo(),
            produto.getNome(),
            BigDecimal.valueOf(produto.getPreco()),
            produto.getQuantidade()
        );
    }
}