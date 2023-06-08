public class ProfesionFontanero implements ProfesionStrategy{
    int telefono;
    String nombre;
    public void ProfesionFontanero(int telefono, String nombre){
        this.telefono=telefono;
        this.nombre=nombre;
    }
@Override
    void llamar(){
    System.out.println("Llamando al Fontanero "+nombre);
    System.out.println("marcando numero "+telefono);
    System.out.println("El Fontanero esta en camino");
    }
@Override  
    void realizarTrabajo(){
    System.out.println("El Fontanero va a comenzar a trabajar");
    System.out.println("Indica el numero de tuberias que debe reparar:");
    Scanner entrada=new Scanner(System.in);
    int numero=entrada.nextInt();
    entrada.close();
    System.out.println("EL fontanero esta reparando "+ numero+ " tuberias.");
    
    }
@Override     
    void facturar(){
    System.out.println("El Fontanero "+nombre +" te ha pasado la factura por el trabajo realizado.");
    }    
}