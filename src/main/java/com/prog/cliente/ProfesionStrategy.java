package com.prog.cliente;

public interface ProfesionStrategy{
    int telefono=0;
    String nombre="";
    
    public void llamar();
    public void realizarTrabajo();
    public void facturar();
    
}