package com.tecnm.itics.proyecto.oxxo;

import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
    Personal trab1 = new Personal(1001, "Rogelio", "Zepeda", true);
    ObjectsFileHandler.writeBinaryFile("C:\\Users\\rogep\\Desktop\\Escuela\\prueba.dat", trab1);
    }

}
