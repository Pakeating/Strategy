public class ProfesionElectricist implements ProfesionStrategy{
    int telefono;
    String nombre;
    public void ProfesionAlbanil(int telefono, String nombre){
        this.telefono=telefono;
        this.nombre=nombre;
    }
@Override
    void llamar(){
    System.out.println("Llamando al Electricista "+nombre);
    System.out.println("marcando numero "+telefono);
    System.out.println("El Electricista esta en camino");
    }
@Override  
    void realizarTrabajo(){
    System.out.println("El Electricista va a comenzar a trabajar");
    System.out.println("El electricista ha realizado la instalacion completa. Indica cuantos enchufes quieres:");
    Scanner entrada=new Scanner(System.in);
    int numero=entrada.nextInt();
    entrada.close();
    System.out.println("EL electricista está poniendo los "+ numero+ " enchufes que has pedido");
    
    }
@Override     
    void facturar(){
    System.out.println("El Electricista "+nombre +" te ha pasado la factura por el trabajo realizado.");
    }    
}