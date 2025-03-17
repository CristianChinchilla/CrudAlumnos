
package newpackage;
import java.util.Scanner;
import java.util.ArrayList;

public class Metodos {
  
     Scanner scanner = new Scanner (System.in);
    ArrayList <Alumnos> lista = new ArrayList<>();
    
    //Menu principal
    public void Menu(){
        
         while(true){
        
         int opcion = 0;
       
        System.out.println("Ingrese una opción");
        System.out.println("1- Agregar Alumnos");
        System.out.println("2- Modificar Alumnos");
        System.out.println("3- Eliminar Alumnos");
        System.out.println("4- Mostrar");
        opcion = scanner.nextInt();
      
       switch(opcion){
           
           case 1 :
               Agregar();//llama al metodo agregar
               break;
               
           case 2 :
               Modificar();//llama al metodo modificar
               break;
           
           case 3 :
               Eliminar();//llama al metodo mostrar
               break;    
               
           case 4 :
               Mostrar();//llama al metodo eliminar
               break;
               
             }    
         } 
    }
    
    public void Precarga() {
    
    }
    
    public void Mostrar(){
        //Imprime toda la lista
        for (Alumnos alumnos : lista) {
            System.out.println(alumnos);
        }
        
    }
    
   public void Agregar() {
       scanner.nextLine();
        System.out.println("Ingrese ID del alumno:");
        String id = scanner.nextLine();
        
        System.out.println("Ingrese nombre del alumno:");
        String nombre = scanner.nextLine();
         
        System.out.println("Ingrese la carrera del alumno:");
        String carrera = scanner.nextLine();
        
        System.out.println("Ingrese edad del alumno:");
        String edad = scanner.nextLine();
        
        System.out.println("Ingrese el promedio del alumno:");
        String ponderado = scanner.nextLine();
        
        lista.add(new Alumnos(nombre,id,carrera,edad,ponderado));
        System.out.println("Alumno agregado");
   }
    
  /**
   * 
   * 
   *  
   */ 
 public void Modificar() {
    System.out.println("Ingrese un ID para modificar un alumno");
    scanner.nextLine();
    String id = scanner.nextLine();
   
    for (Alumnos alumnos : lista) {
        if (id.equals(alumnos.getId())) {
            int opcion = 0;
            System.out.println("Seleccione el campo a modificar:");
            System.out.println("1-Modificar nombre");
            System.out.println("2-Modificar carrera");
            System.out.println("3-Modificar edad");
            System.out.println("4-Modificar ponderado");
            System.out.println("5-Cancelar");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un nuevo nombre ");
                    alumnos.setNombre(scanner.nextLine());
                    Modificar();
                    break;
                case 2:
                    System.out.println("Ingrese una nueva carrera");
                    alumnos.setCarrera(scanner.nextLine());
                    Modificar();
                    break;
                case 3:
                    System.out.println("Ingrese una nueva edad ");
                    alumnos.setEdad(scanner.nextLine());
                    Modificar();
                    break;
                case 4:
                    System.out.println("Ingrese un nuevo ponderado ");
                    alumnos.setPonderado(scanner.nextLine());
                    Modificar();
                    break;
                case 5:
                    Menu();
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println("Alumno modificado correctamente.");
            return;
        }
    }
    System.out.println("Alumno no encontrado.");
}
     
  
  public void Eliminar() {
    System.out.print("Ingrese el ID del alumno a borrar");
    String id = scanner.nextLine();
    for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).getId().equals(id)) {
            lista.remove(i);
            System.out.println("Alumno borrado con exito");
         
        }
    }
    System.out.println("Alumno no encontrado");
  }
  
  
  
  
}
