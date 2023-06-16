package com.prog.cliente;

import java.util.*;
public class ProfesionElectricist implements ProfesionStrategy{
    int telefono;
    String nombre;
    public ProfesionElectricist(int telefono, String nombre){
        this.telefono=telefono;
        this.nombre=nombre;
    }
@Override
    public void llamar(){
    System.out.println("Llamando al Electricista "+nombre);
    System.out.println("marcando numero "+telefono);
    System.out.println("El Electricista esta en camino");
    }
@Override  
    public void realizarTrabajo(){
    System.out.println("El Electricista va a comenzar a trabajar");
    System.out.println("El electricista ha realizado la instalacion completa. Indica cuantos enchufes quieres:");
    Scanner entrada=new Scanner(System.in);
    int numero=0;
    while(numero==0){
        try{
        numero=Integer.parseInt(entrada.nextLine());
        System.out.println("EL electricista está poniendo los "+ numero+ " enchufes que has pedido");
    
        }
        catch(Exception e){
        System.out.println("Numero no válido: "+ e.getMessage());
        numero=0;
        }
    }
    
    }
@Override     
    public void facturar(){
    System.out.println("El Electricista "+nombre +" te ha pasado la factura por el trabajo realizado.");
    }    
}