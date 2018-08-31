package xyz.infodata.agenda;

import java.util.*;
/*
 * Autor: Nicolas Ramos
 * Data : 30/8/2018
 * Nota : Visualizando como a Agenda se comporta com dados reais.
 *
 */

public class Main {

    public static void main(String[] args) {
        usaAgendaCampos();
        usaAgendaNome();
    }

    // Testando com apenas um telefone
    private static void usaAgendaCampos() {
        Contato c = null;
        Telefone t = null;
        List<Telefone> list = null;
        try {
            c = new Contato("Fulano de Tal", "Rua do Principe, 1.500", "Joinville", "SC", "89201-002");
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 9 8888-3333");
            list = notNull(c, t, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 9 9972-4410");
//            t = new Telefone(null, "(47) 9 9972-4410");
//            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "");
            list = notNull(c, t, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        if(c != null) {
            c.setTelefones(list);

            System.out.println(c);
        }


    }

    private static List notNull(Contato c, Telefone t, List list) {
        if(c != null && t != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(t);
        }
        return list;
    }

    private static void usaAgendaNome() {
        Contato c = null;
        Telefone t = null;
        List<Telefone> list = null;
        try {
            c = new Contato("Mengano da Silva");
            c.setEndereco("Rua Egon Otto Zulauf, 2.603");
            c.setCidade("São Bento");
            c.setUf("SC");
            c.setCep("89280-028");
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 9980-4774");
            list = notNull(c, t, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 3631-6003 R112");
            list = notNull(c, t, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 8 9943-1290");
            list = notNull(c, t, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 3631-6033");
//            t = new Telefone(null, "(47) 9 9972-4410");
//            t = new Telefone(Telefone.TipoTelefone.PARTICULAR, "");
            list = notNull(c, t, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        if(c != null) {
            c.setTelefones(list);

            System.out.println(c);
        }

    }
}
