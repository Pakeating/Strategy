package com.prog.cliente;

import java.util.*;
public class ProfesionAlbanil implements ProfesionStrategy{
    int telefono;
    String nombre;
    public ProfesionAlbanil(int telefono, String nombre){
        this.telefono=telefono;
        this.nombre=nombre;
    }
@Override
    public void llamar(){
    System.out.println("Llamando al Albanil "+nombre);
    System.out.println("marcando numero "+telefono);
    System.out.println("El Albanil esta en camino");
    }
@Override  
    public void realizarTrabajo(){
    System.out.println("El Albanil va a comenzar a trabajar");
    System.out.println("Indica en que habitacion debe poner las baldosas:");
    Scanner entrada=new Scanner(System.in);
    String habitacion=entrada.nextLine();
    System.out.println("EL albanil esta poniendo las baldosas en la habitacion "+ habitacion);
    
    }
@Override     
    public void facturar(){
    System.out.println("El Albanil "+nombre +" te ha pasado la factura por el trabajo realizado.");
    }    
}