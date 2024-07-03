package model;

public class Fornecedores {
    private int    IdFornecedores;
    private String Nome;
    private String Cidade;
    private String UF;
    private String Telefone;    
    private String CNPJ;
    private String Email;
    private String Representante;
    private String Fone;

    public int getIdFornecedores() {
        return IdFornecedores;
    }

    public void setIdFornecedores(int IdFornecedores) {
        this.IdFornecedores = IdFornecedores;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }
}