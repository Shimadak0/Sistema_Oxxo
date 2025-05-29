package com.tecnm.itics.proyecto.oxxo;

import java.util.ArrayList;
import java.io.Serializable;

public class Personal implements Serializable {
    private static final long serialVersionUID = 1L;

    private int numeroDeEmpleado;
    private String nombre;
    private String apellido;
    private int ventas;
    private int retiros;
    private int depositos;
    private boolean estaActivo;
    private int horasActivo;

    public Personal(int numeroDeEmpleado, String nombre, String apellido, boolean estaActivo){
        this.numeroDeEmpleado = (int)(Math.random()*9999);
        this.nombre = nombre;
        this.apellido = apellido;
        this.estaActivo = false;
    }

    public void mostrarInformacion() {
        System.out.println("El numero de empleado es: " + numeroDeEmpleado);
        System.out.println("El nombre y apellio del empleado es: " + nombre + " " + apellido);
        System.out.println("Es un empleado " + estaActivo);
    }



}
