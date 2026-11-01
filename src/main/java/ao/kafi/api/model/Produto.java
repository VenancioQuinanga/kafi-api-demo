package ao.kafi.api.model;

public class Produto {

    private Long id;
    private String codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(
            Long id,
            String codigo,
            String nome,
            double preco,
            int quantidade) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorEmStock() {
        return preco * quantidade;
    }
}