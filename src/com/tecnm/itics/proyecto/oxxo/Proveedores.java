package com.tecnm.itics.proyecto.oxxo;

public class Proveedores extends Personal{

    public Proveedores(int numeroDeEmpleado, String nombre, String apellido, boolean estaActivo){
        super(numeroDeEmpleado, nombre, apellido, estaActivo);
    }
    private int numeroProveedor;
    private int numeroProductosProveedor;
    private int numeroProductosTienda;
    private double precioProductos;



    public boolean verificarProductos(){
        boolean verificarProductos = false;
        if(numeroProductosProveedor == numeroProductosTienda){
            verificarProductos = true;
        }

        return verificarProductos;
    }

    public void aceptarProductos(){
        if (verificarProductos() == true){
            System.out.println("Los productos han sido aceptados, imprimiendo recibo");
        }
    }

    public double totalProductos(){
       double totalProductos = precioProductos + precioProductos;
       return totalProductos;
    }




}
