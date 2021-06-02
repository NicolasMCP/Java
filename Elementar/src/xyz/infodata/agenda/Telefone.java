package xyz.infodata.agenda;

/**
 * Contem o tipo e número do telefone.
 * 
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 * Java 11 (testado em Java 8)
 */
public class Telefone {
    public enum TipoTelefone{ TRABALHO, PARTICULAR }
    private TipoTelefone tipo;
    private String telefone;

    public Telefone(TipoTelefone tipo, String telefone) {
        setTipo(tipo);
        setTelefone(telefone);
    }

    public TipoTelefone getTipo() {
        return tipo;
    }
    public String getTelefone() { return telefone; }

    public void setTipo(TipoTelefone tipo) {
        if(tipo == null || (tipo != TipoTelefone.PARTICULAR && tipo != TipoTelefone.TRABALHO)) {
            throw new IllegalArgumentException("Erro. 'Tipo de Telefone' obrigatório, pode ser TRABALHO ou PARTICULAR!");
        }
        this.tipo = tipo;
    }

    public void setTelefone(String telefone) {
        if(telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro. Telefone de deve ser informado!");
        }
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return getTipo() == null || getTelefone() == null || getTelefone().trim().isEmpty()? "" : "[" +  getTipo() + ", " + getTelefone() + "]";
    }

}
