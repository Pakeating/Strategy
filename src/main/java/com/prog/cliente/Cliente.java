package com.prog.cliente;

import java.util.*;
public class Cliente {
    public static void main(String args[]) {
      int menu=10;
      ProfesionStrategy profesion;
      System.out.println("Bienvenido al sistema de reparacion de averías: ");
      while (menu!=0){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el tipo de avería que ha sufrido introduciendo el numero correspondiente:");
        System.out.println("0: Salir"+"\n"+"1: Eléctrica"+"\n"+"2: Fontanería"+"\n"+"3: Albannileria");
        try{menu=entrada.nextInt();}
        catch(Exception e){System.out.println("Entrada no válida: "+e.getMessage());}
        entrada.nextLine();
        
        switch (menu){
            case 0:
                System.out.println("Saliendo del sistema de reparacion de averías");
                break;
            case 1:
                profesion=new ProfesionElectricist(654433221, "Paco");
                Averia.reparar(profesion);
                break;
            case 2:
                profesion=new ProfesionFontanero(765544321,"Pepe");
                Averia.reparar(profesion);
                break;
            case 3:
                profesion=new ProfesionAlbanil(876655443,"Isidro");
                Averia.reparar(profesion);
                break;
            default:
                System.out.println("Entrada no válida");
                break;
        }
      }
    }
}