package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args)throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();

        List<String> ruta = Files.readAllLines(Paths.get(args[0]));
        LeerArchivo archivo=new LeerArchivo(ruta);
        Producto prod=new Producto(archivo.getPartesProd());
        String json=objectMapper.writeValueAsString(prod);
        System.out.println(json);

    }
}