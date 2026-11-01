package ao.kafi.api.service;

import ao.kafi.api.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProdutoService {

    private final List<Produto> produtos = new ArrayList<>();
    private final AtomicLong proximoId = new AtomicLong(1);

    public ProdutoService() {
        produtos.add(new Produto(
            proximoId.getAndIncrement(),
            "P001", "Rosa artificial", 2500, 10
        ));

        produtos.add(new Produto(
            proximoId.getAndIncrement(),
            "P002", "Orquídea artificial", 5000, 5
        ));
    }

    public List<Produto> listarTodos() {
        return new ArrayList<>(produtos);
    }

    public Optional<Produto> procurarPorId(Long id) {
        return produtos.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst();
    }

    public Produto criar(Produto produto) {
        produto.setId(proximoId.getAndIncrement());
        produtos.add(produto);
        return produto;
    }

    public Optional<Produto> deletarPorId(Long id) {
    return produtos.stream()
        .filter(p -> p.getId() != id)
        .findFirst();
    }
}