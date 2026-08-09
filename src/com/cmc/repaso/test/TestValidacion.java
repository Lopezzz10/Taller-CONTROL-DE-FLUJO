package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

    public static void main(String[] args) {
        Validacion validacion = new Validacion();

        double monto1 = 150.50;
        double monto2 = -20.0;
        double monto3 = 0.0;

        System.out.println("Monto: " + monto1 + " Valido: " + validacion.validarMonto(monto1));
        System.out.println("Monto: " + monto2 + " Valido: " + validacion.validarMonto(monto2));
        System.out.println("Monto: " + monto3 + " Valido: " + validacion.validarMonto(monto3));
    }
}
