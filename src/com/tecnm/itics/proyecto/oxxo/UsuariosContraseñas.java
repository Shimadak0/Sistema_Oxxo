package com.tecnm.itics.proyecto.oxxo;

public class UsuariosContraseñas extends Personal{
    protected int usuario;
    protected int password;

    public UsuariosContraseñas(int numeroDeEmpleado, String nombre, String apellido, boolean estaActivo, int usuario, int password) {
        super(numeroDeEmpleado, nombre, apellido, estaActivo);
        this.usuario= 24121397;
        this.password= 123456;
    }
}
