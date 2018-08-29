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


    private boolean isUf(String uf) {
        String[] UF = {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA",
                "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" };

        if (uf == null) { return false; }
        if (uf.isEmpty()) { return false; }
        uf = uf.trim().toUpperCase();
        for (String estado : UF) {
            if (uf.equals(estado)) { return true; }
        }
        return false;
    }

    public void setUf(String uf) {
        if(isUf(uf)) {
            this.uf = uf;
        } else {
            throw new IllegalArgumentException("Erro. UF deve ser informado!");
        }
    }

    public void setEndereco(String endereco) {
        if(endereco==null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro. Endereço deve ser informado!");
        }
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        if(cidade==null || cidade.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro. Cidade deve ser informada!");
        }
        this.cidade = cidade;
    }


    public void setCep(String cep) { this.cep = cep; }

    public void setFone1(Telefone fone1) { this.fone1 = fone1; }

    public void setFone2(Telefone fone2) { this.fone2 = fone2; }

    public void setFone3(Telefone fone3) { this.fone3 = fone3; }

    public void setFone4(Telefone fone4) { this.fone4 = fone4; }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getCidade() { return cidade; }
    public String getUf() { return uf; }
    public String getCep() { return cep; }
    public Telefone getFone1() { return fone1; }
    public Telefone getFone2() { return fone2; }
    public Telefone getFone3() { return fone3; }
    public Telefone getFone4() { return fone4; }

    @Override
    public String toString() {
        String s = "[" + getNome();
        s = getEndereco() == null ? s : getEndereco().trim().isEmpty() ? s : s + ", " + getEndereco();
        s = getCidade() == null ? s : getCidade().trim().isEmpty() ? s : s + ", " + getCidade();
        s = getUf() == null ? s : getUf().trim().isEmpty() ? s : s + ", " + getUf();
        s = getCep() == null ? s : getCep().trim().isEmpty() ? s : s + ", " + getCep();

        s += "]";
        return s;
    }

}
