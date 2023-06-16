package com.prog.cliente;

import java.util.*;
public class ProfesionFontanero implements ProfesionStrategy{
    int telefono;
    String nombre;
    public ProfesionFontanero(int telefono, String nombre){
        this.telefono=telefono;
        this.nombre=nombre;
    }
@Override
    public void llamar(){
    System.out.println("Llamando al Fontanero "+nombre);
    System.out.println("marcando numero "+telefono);
    System.out.println("El Fontanero esta en camino");
    }
@Override  
    public void realizarTrabajo(){
    System.out.println("El Fontanero va a comenzar a trabajar");
    System.out.println("Indica el numero de tuberias que debe reparar:");
    Scanner entrada=new Scanner(System.in);
    int numero=0;
    while(numero==0){
        try{
        numero=Integer.parseInt(entrada.nextLine());
        System.out.println("EL fontanero esta reparando "+ numero+ " tuberias.");    
        }
        catch(Exception e){
        System.out.println("Numero no válido: "+ e.getMessage());
        numero=0;
        }
    }
    
    
    }
@Override     
    public void facturar(){
    System.out.println("El Fontanero "+nombre +" te ha pasado la factura por el trabajo realizado.");
    }    
}