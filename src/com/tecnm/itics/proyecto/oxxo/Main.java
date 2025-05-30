package com.tecnm.itics.proyecto.oxxo;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        Personal trab1 = new Personal(1001, "Rogelio", "Zepeda", true);
        //Escribir Texto
        FileHandler.writeTextFile("C:\\Users\\rogep\\Desktop\\Escuela\\texto.txt", List.of("1001", "Rogelio", "Zepeda", "true"));
        //Leer Texto
        List<String> logEngtries = FileHandler.readTextFile("C:\\Users\\rogep\\Desktop\\Escuela\\texto.txt");
        //Escribir binario
        ObjectsFileHandler.writeBinaryFile("C:\\Users\\rogep\\Desktop\\Escuela\\prueba.dat", trab1);
        //Leer binario
        byte[] imageData = FileHandler.readBinaryFile("C:\\Users\\rogep\\Desktop\\Escuela\\prueba.dat");
    }

}
