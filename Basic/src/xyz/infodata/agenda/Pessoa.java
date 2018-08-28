package xyz.infodata.agenda;

public class Pessoa {
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private Telefone fone1;
    private Telefone fone2;
    private Telefone fone3;
    private Telefone fone4;

    public Pessoa(String nome) { this.nome = nome; }

    public Pessoa(String nome, String endereco, String cidade, String uf, String cep) {
        this(nome);
        setEndereco(endereco);
        setCidade(cidade);
        setUf(uf);
        setCep(cep);
    }

    public String getUf() { return uf; }

    public void setUf(String uf) { if(Uf.isUf(uf)) { this.uf = uf; }  }

    public String getNome() { return nome; }

    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getCidade() { return cidade; }

    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getCep() { return cep; }

    public void setCep(String cep) { this.cep = cep; }

    public Telefone getFone1() { return fone1; }

    public void setFone1(Telefone fone1) { this.fone1 = fone1; }

    public Telefone getFone2() { return fone2; }

    public void setFone2(Telefone fone2) { this.fone2 = fone2; }

    public Telefone getFone3() { return fone3; }

    public void setFone3(Telefone fone3) { this.fone3 = fone3; }

    public Telefone getFone4() { return fone4; }

    public void setFone4(Telefone fone4) { this.fone4 = fone4; }

    @Override
    public String toString() {
        String s = "[" + this.nome;
        s = this.endereco == null ? s : this.endereco.isEmpty() ? s : s + ", " + this.endereco;
        s = this.cidade == null ? s : this.cidade.isEmpty() ? s : s + ", " + this.cidade;
        s = this.uf == null ? s : this.uf.isEmpty() ? s : s + ", " + this.uf;
        s = this.cep == null ? s : this.cep.isEmpty() ? s : s + ", " + this.cep;
        s += "]";
        return s;
    }
}
