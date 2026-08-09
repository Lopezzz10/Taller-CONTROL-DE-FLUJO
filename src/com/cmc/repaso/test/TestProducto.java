package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1000.0);
        Producto producto2 = new Producto("Mouse", 50.0);

        producto1.setPrecio(1200.0);
        System.out.println(producto1.getNombre() + " - Precio actualizado: " + producto1.getPrecio());

        producto2.setPrecio(-80.0);
        System.out.println(producto2.getNombre() + " - Precio actualizado: " + producto2.getPrecio());

        double precioPromo1 = producto1.calcularPrecioPromo(10); // 10% de descuento
        double precioPromo2 = producto2.calcularPrecioPromo(25); // 25% de descuento

        System.out.println(producto1.getNombre() + " - Precio con promo (10%): " + precioPromo1);
        System.out.println(producto2.getNombre() + " - Precio con promo (25%): " + precioPromo2);
    }
}