package xyz.infodata.agenda;

public class Main {

    public static void main(String[] args) {

        Pessoa p=null;
        Telefone t;
        try {
            p = new Pessoa("Fulano de Tal");
            p.setEndereco("Rua do Principe, 1.500");
            p.setCidade("Joinville");
            p.setUf("SC");
            p.setCep("89201-002");
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone();
            t.setTipo(Telefone.TipoTelefone.TRABALHO);
            t.setTelefone("(47) 9 8888-3333");
            p.setFone1(t);
        } catch (IllegalArgumentException e){

        }
        System.out.println(p);
    }
}
