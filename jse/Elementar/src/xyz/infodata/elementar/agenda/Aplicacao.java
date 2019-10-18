package xyz.infodata.elementar.agenda;
import java.util.List;
import java.util.ArrayList;

/**
 * Visualizando como a Agenda se comporta com dados reais.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Java 11 (testado com Java 8)
 */
public class Aplicacao {

    public static void main(String[] args) {
        usaAgendaCampos();
        usaAgendaNome();
    }

    // Testando com apenas um telefone
    @SuppressWarnings("unchecked")
	private static void usaAgendaCampos() {
        Contato contato = null;
        Telefone telefone = null;
        List<Telefone> list = null;
        try {
            contato = new Contato("Fulano de Tal", "Rua do Principe, 1.500", "Joinville", "SC", "89201-002");
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString().substring(10));
        }

        try {
            telefone = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 9 8888-3333");
            list = ifNotNullAddList(contato, telefone, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            telefone = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 9 9972-4410");
            // telefone = new Telefone(null, "(47) 9 9972-4410");
            // telefone = new Telefone(Telefone.TipoTelefone.PARTICULAR, "");
            list = ifNotNullAddList(contato, telefone, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        if(contato != null) {
            contato.setTelefones(list);

            System.out.println(contato);
        }


    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	private static List ifNotNullAddList(Contato contato, Telefone telefone,  List list) {
        if(contato != null && telefone != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(telefone);
        }
        return list;
    }

    @SuppressWarnings("unchecked")
	private static void usaAgendaNome() {
        Contato contato = null;
        Telefone telefone = null;
        List<Telefone> list = null;
        try {
            contato = new Contato("Mengano da Silva");
            contato.setEndereco("Rua Egon Otto Zulauf, 2.603");
            contato.setCidade("São Bento");
            contato.setUf("SC");
            contato.setCep("89280-028");
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString().substring(10));
        }

        try {
            telefone = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 9980-4774");
            list = ifNotNullAddList(contato, telefone, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            telefone = new Telefone(Telefone.TipoTelefone.TRABALHO, "(47) 3631-6003 R112");
            list = ifNotNullAddList(contato, telefone, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            telefone = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 8 9943-1290");
            list = ifNotNullAddList(contato, telefone, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        try {
            telefone = new Telefone(Telefone.TipoTelefone.PARTICULAR, "(47) 3631-6033");
            // telefone = new Telefone(null, "(47) 9 9972-4410");
            // telefone = new Telefone(Telefone.TipoTelefone.PARTICULAR, "");
            list = ifNotNullAddList(contato, telefone, list);
        } catch (IllegalArgumentException e){
            System.err.println(e.toString().substring(10));
        }

        if(contato != null) {
            contato.setTelefones(list);

            System.out.println(contato);
        }

    }
}
