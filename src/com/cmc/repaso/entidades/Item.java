package com.cmc.repaso.entidades;

public class Item {

    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    public Item(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Producto: " + nombre);
        System.out.println("  Productos actuales: " + productosActuales);
        System.out.println("  Productos devueltos: " + productosDevueltos);
        System.out.println("  Productos vendidos: " + productosVendidos);
    }

    public void vender(int cantidad) {
        this.productosActuales -= cantidad;
        this.productosVendidos += cantidad;
    }

    public void devolver(int cantidad) {
        this.productosActuales += cantidad;
        this.productosVendidos -= cantidad;
        this.productosDevueltos += cantidad;
    }

    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }
}