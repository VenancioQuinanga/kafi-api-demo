package ao.kafi.api.controller;

import ao.kafi.api.model.Produto;
import ao.kafi.api.service.ProdutoService;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ao.kafi.api.dto.CriarProdutoRequest;
import ao.kafi.api.dto.ProdutoResponse;
import ao.kafi.api.exception.ProdutoNaoEncontradoException;
import ao.kafi.api.mapper.ProdutoMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Produto procurarPorId(@PathVariable Long id) {
        return produtoService.procurarPorId(id)
            .orElseThrow(() ->
                new ProdutoNaoEncontradoException(
                    "Produto não encontrado: " + id
                )
            );
    }

    @PostMapping
    public ResponseEntity<ProdutoResponse> criar(
            @Valid @RequestBody CriarProdutoRequest pedido) {

        Produto criado = produtoService.criar(pedido);

        return ResponseEntity
            .created(URI.create("/api/produtos/" + criado.getId()))
            .body(ProdutoMapper.paraResponse(criado));
    }
        
    @DeleteMapping 
    public void Deletar(@PathVariable Long id){
        
    }
}