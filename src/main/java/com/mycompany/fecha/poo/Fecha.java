package com.mycompany.fecha.poo;

import java.util.HashMap;

public class Fecha {
    int dia;
    int mes;
    int ano;


    Fecha (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
    }

    public String fechaCorta(){
        return dia  + "/" + mes + "/" + ano;
    }

    public boolean validarFecha(){
        if(dia < 32 && dia > 0 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
            return true;
        }else if(dia < 29 && dia > 0 && mes == 2){
            return true;
        }
        else if(dia < 31 && dia > 0 && ( mes == 4 || mes == 6 || mes == 7 || mes == 9 || mes == 11)){
            return true;
        }else{
            return false;
        }
    }

    public String mesLetra(){
        HashMap<Integer, String> meses = new HashMap<>();
        meses.put(1,"enero");
        meses.put(2,"febrero");
        meses.put(3,"marzo");
        meses.put(4, "abril");
        meses.put(5, "mayo");
        meses.put(6, "junio");
        meses.put(7, "julio");
        meses.put(8, "agosto");
        meses.put(9, "septiembre");
        meses.put(10, "octubre");
        meses.put(11, "noviembre");
        meses.put(12, "diciembre");

        return meses.get(mes);
    }

    public String fechaLarga(){
        return dia  + " de " + mesLetra() + " de " + ano;
    }

}