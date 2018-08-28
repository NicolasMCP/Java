package xyz.infodata.agenda;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Fulano de Tal");
        p.setEndereco("Rua do Principe, 1.300");
        p.setCidade("Joinville");
        p.setUf("SC");
        p.setCep("89201-002");
        Telefone t = new Telefone();
        t.setTipo(Telefone.TipoTelefone.CELULAR);
        t.setTelefone("(47) 9 8888-3333");
        p.setFone1(t);
        System.out.println(p);
    }
}
