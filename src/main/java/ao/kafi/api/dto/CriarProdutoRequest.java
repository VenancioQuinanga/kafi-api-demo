package ao.kafi.api.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record CriarProdutoRequest(
    @NotBlank
    @Size(max = 30)
    String codigo,

    @NotBlank
    @Size(max = 120)
    String nome,

    @NotNull
    @DecimalMin("0.01")
    BigDecimal preco,

    @NotNull
    @Min(0)
    Integer quantidade
) {}