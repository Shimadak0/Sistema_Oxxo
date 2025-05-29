package com.tecnm.morelia.itics.poo.u6.files.bags;

import com.tecnm.itics.proyecto.oxxo.ClaseEjemplo;
import com.tecnm.itics.proyecto.oxxo.FileHandler;
import com.tecnm.itics.proyecto.oxxo.ObjectsFileHandler;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Esta clase se utiliza para probar los metodos.

        // Ejemplo de como escribir un archivo de texto
        FileHandler.writeTextFile("logs\\app.log", List.of("Error: 500", "Time: " + LocalDateTime.now()));

        //Ejemplo de como leer un archivo de texto que ya existe
        List<String> logEntries = FileHandler.readTextFile("logs\\app.log");

        //Ejemplo de como leer un archivo binario que ya existe.
        byte[] imageData = FileHandler.readBinaryFile("itmorelia.png");

        //Ejemplo de como escribir un archivo binario, //se pasa el archivo que se acaba de abrir
        FileHandler.writeBinaryFile("images\\modifiedOutput.png", imageData);

        //Ejemplo usando objetos para escribir en binario

        // Ejemplo de un objeto recién creado y su contenido se escribio en el archivo data/employee.dat
        ClaseEjemplo emp = new ClaseEjemplo("John Doe", 1001);
        ObjectsFileHandler.writeBinaryFile(".\\data\\employee.dat", emp);

        //Ejemplo usando objetos para leer un objeto que se guardó en binario y cargando esos datos en un objeto llamado restored.
        try {
            ClaseEjemplo restored = ObjectsFileHandler.readBinaryFile("data\\employee.dat", ClaseEjemplo.class);
            System.out.println(restored.getName()); // "John Doe"
            //Aquí podría obtener cualquier valor de los atributos de la clase o mandar llamar alguno de los metodos

            //Por ejemplo, aquí solo mando llamar un metodo que imprime un mensaje de texto, pero podría invocar cualquier metodo.
            restored.metodoPrueba();


        } catch (ClassNotFoundException e) {
            System.err.println("Class version mismatch!");
        }

    }
}
