package com.tecnm.itics.proyecto.oxxo;

import java.io.Serializable;

public class ClaseEjemplo implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int id;

        // Constructor, getters, setters...

    public ClaseEjemplo(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void metodoPrueba(){
        System.out.println("Solo estoy ejecutando un metodo del objeto para probar que es posible");
    }
}

