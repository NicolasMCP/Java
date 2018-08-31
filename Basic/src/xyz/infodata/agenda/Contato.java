package xyz.infodata.agenda;

import java.util.List;
/*
 * Autor: Nicolas Ramos
 * Data : 30/8/2018
 * Nota : Contatos da Agenda...
 *
 */


public class Contato {
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private List<Telefone> telefones;

    public Contato(String nome) { this.nome = nome; }

    public Contato(String nome, String endereco, String cidade, String uf, String cep) {
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
        if(endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro. Endereço deve ser informado!");
        }
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        if(cidade == null || cidade.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro. Cidade deve ser informada!");
        }
        this.cidade = cidade;
    }


    public void setCep(String cep) { this.cep = cep; }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getCidade() { return cidade; }
    public String getUf() { return uf; }
    public String getCep() { return cep; }

    @Override
    public String toString() {
        String s = "[" + getNome();
        s = getEndereco() == null ? s : getEndereco().trim().isEmpty() ? s : s + ", " + getEndereco();
        s = getCidade() == null ? s : getCidade().trim().isEmpty() ? s : s + ", " + getCidade();
        s = getUf() == null ? s : getUf().trim().isEmpty() ? s : s + ", " + getUf();
        s = getCep() == null ? s : getCep().trim().isEmpty() ? s : s + ", " + getCep();

        if(getTelefones() != null) {
            for (Telefone t : getTelefones()) {
                s += " " + t.toString();
            }
        }

        s += "]";
        return s;
    }

}
