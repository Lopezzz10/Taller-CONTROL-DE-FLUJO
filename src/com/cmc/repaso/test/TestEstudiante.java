package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Carlos");
        Estudiante estudiante2 = new Estudiante("María");
        Estudiante estudiante3 = new Estudiante("Pedro");

        estudiante1.calificar(9.5);
        estudiante2.calificar(7.0);
        estudiante3.calificar(8.0);

        System.out.println(estudiante1.getNombre() + " - Nota: " + estudiante1.getNota() + " - Resultado: " + estudiante1.getResultado());
        System.out.println(estudiante2.getNombre() + " - Nota: " + estudiante2.getNota() + " - Resultado: " + estudiante2.getResultado());
        System.out.println(estudiante3.getNombre() + " - Nota: " + estudiante3.getNota() + " - Resultado: " + estudiante3.getResultado());
    }
}