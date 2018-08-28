package xyz.infodata.agenda;

public class Uf {

    private static String[] UF = {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS",
            "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" };

    public static boolean isUf(String uf) {

        if (uf == null) { return false; }

        if (uf.isEmpty()) { return false; }

        for (String estado : UF) {
            if (uf.equals(estado)) { return true; }
        }
        return false;
    }
}