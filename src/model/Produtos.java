package model;

import java.util.Date;

public class Produtos {
    private int    idProduto;
    private char   Categoria;
    private String Descricao;
    private Date   Validade;
    private float  Preco_custo;
    private float  Preco_venda;
    private int    Quantidade;
    private int    Minimo;
    private int    idFornecedor;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public char getCategoria() {
        return Categoria;
    }

    public void setCategoria(char Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Date getValidade() {
        return Validade;
    }

    public void setValidade(Date Validade) {
        this.Validade = Validade;
    }

    public float getPreco_custo() {
        return Preco_custo;
    }

    public void setPreco_custo(float Preco_custo) {
        this.Preco_custo = Preco_custo;
    }

    public float getPreco_venda() {
        return Preco_venda;
    }

    public void setPreco_venda(float Preco_venda) {
        this.Preco_venda = Preco_venda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getMinimo() {
        return Minimo;
    }

    public void setMinimo(int Minimo) {
        this.Minimo = Minimo;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
}