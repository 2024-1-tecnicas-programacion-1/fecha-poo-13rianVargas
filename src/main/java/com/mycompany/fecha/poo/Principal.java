package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Ingrese el día:");
        int dia = ent.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = ent.nextInt();
        System.out.println("Ingrese el año:");
        int ano = ent.nextInt();

        Fecha fecha = new Fecha(dia, mes, ano);

        if (fecha.validarFecha() == true){
            System.out.println(fecha.fechaLarga());
        }
    }
}