package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

    public static void main(String[] args) {
        Item item1 = new Item("Camiseta");
        item1.setProductosActuales(20);

        System.out.println("=== Valores iniciales - Camiseta ===");
        item1.imprimir();

        item1.vender(5);
        System.out.println("\n=== Después de vender 5 - Camiseta ===");
        item1.imprimir();

        item1.devolver(2);
        System.out.println("\n=== Después de devolver 2 - Camiseta ===");
        item1.imprimir();

        Item item2 = new Item("Pantalón");
        item2.setProductosActuales(20);

        System.out.println("\n=== Valores iniciales - Pantalón ===");
        item2.imprimir();

        item2.vender(8);
        System.out.println("\n=== Después de vender 8 - Pantalón ===");
        item2.imprimir();

        item2.devolver(3);
        System.out.println("\n=== Después de devolver 3 - Pantalón ===");
        item2.imprimir();
    }
}