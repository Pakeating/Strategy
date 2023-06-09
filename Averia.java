public class Averia{
    ProfesionStrategy profesion;
    
    public static void reparar(ProfesionStrategy profesion){
        profesion.llamar();
        profesion.realizarTrabajo();
        profesion.facturar();
    }
}