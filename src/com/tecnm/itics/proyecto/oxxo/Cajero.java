package com.tecnm.itics.proyecto.oxxo;

import java.util.Scanner;

public class Cajero extends UsuariosContraseñas {

    public Cajero(int numeroDeEmpleado, String nombre, String apellido, boolean estaActivo, int usuario, int password) {
        super(numeroDeEmpleado, nombre, apellido, estaActivo, usuario, password);

    }

    public boolean verificarEmpleado(boolean estaEnCaja) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su usuario");
        int tempUser = sc.nextInt();
        System.out.println("Escriba su contraseña");
        int tempPass = sc.nextInt();

        if (tempUser == usuario && tempPass == password) {
            estaEnCaja = true;
        }
        return estaEnCaja;
    }
}
