package org.example;
import java.util.List;

public class LeerArchivo {

    private String prod;
    private String []partesProd;


    public LeerArchivo(List <String> ruta) {

        for (String s : ruta) {
            prod = s;
            partesProd= prod.split(",");
        }
    }

    public String getProd() {
        return prod;
    }

    public String[] getPartesProd() {
        return partesProd;
    }
}
