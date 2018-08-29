package xyz.infodata.agenda;

public class Main {

    public static void main(String[] args) {
        usaAgendaCampos();
        usaAgendaNome();
    }

    private static void usaAgendaCampos() {
        Pessoa p = null;
        Telefone t = null;
        try {
            p = new Pessoa("Fulano de Tal", "Rua do Principe, 1.500", "Joinville", "SC", "89201-002");
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString().substring(10));
        }

        try {
//            t = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 9 8888-3333");
            t = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 9 8888-3333");
            if(p != null && t != null) { p.setFone1(t); }
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 3467-6060");
            if(p != null && t != null) { p.setFone2(t); }
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 9 9972-4410");
//            t = new Telefone(null, "(47) 9 9972-4410");
//            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "");
            if(p != null && t != null) { p.setFone3(t); }
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }
        if(p != null) { System.out.println(p); }


    }

    private static void usaAgendaNome() {
        Pessoa p = null;
        Telefone t = null;
        try {
            p = new Pessoa("Mengano da Silva");
            p.setEndereco("Rua Egon Otto Zulauf, 2.603");
            p.setCidade("São Bento");
            p.setUf("SC");
            p.setCep("89280-028");
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 9980-4774");
            if(p != null && t != null) { p.setFone1(t); }
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 3631-6003 R112");
            if(p != null && t != null) { p.setFone2(t); }
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 8 9943-1290");
            if(p != null && t != null) { p.setFone3(t); }
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 3631-6033");
//            t = new Telefone(null, "(47) 9 9972-4410");
//            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "");
            if(p != null && t != null) { p.setFone4(t); }
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }
        if(p != null ) { System.out.println(p); }

    }
}
