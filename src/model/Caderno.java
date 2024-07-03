package model;

import java.util.Date;

public class Caderno {
    private int    IdCaderno;
    private int    IdAluno;
    private Date   Data;
    private float  Valor;
    private String Descricao;
    private int    Quantidade;
    private int    IdProduto;

    public int getIdCaderno() {
        return IdCaderno;
    }

    public void setIdCaderno(int IdCaderno) {
        this.IdCaderno = IdCaderno;
    }

    public int getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(int IdAluno) {
        this.IdAluno = IdAluno;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }
}