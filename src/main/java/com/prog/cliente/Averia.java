package com.prog.cliente;

public class Averia{
    
    
    public static void reparar(ProfesionStrategy profesion){
        profesion.llamar();
        profesion.realizarTrabajo();
        profesion.facturar();
    }
}