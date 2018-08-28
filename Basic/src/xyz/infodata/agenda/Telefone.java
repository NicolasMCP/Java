package xyz.infodata.agenda;

public class Telefone {
    public enum TipoTelefone{ CELULAR, FIXO }
    private TipoTelefone tipo;
    private String telefone;

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
