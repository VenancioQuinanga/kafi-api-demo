package ao.kafi.api.dto;

import java.math.BigDecimal;

public record ProdutoResponse(
    Long id,
    String codigo,
    String nome,
    BigDecimal preco,
    int quantidade
) {}