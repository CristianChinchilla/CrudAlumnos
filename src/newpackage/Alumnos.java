
package newpackage;


public class Alumnos {
    String nombre;
    String id; 
    String carrera;
    String edad;
    String ponderado;

    public Alumnos() {
    }

    public Alumnos(String nombre, String id, String carrera, String edad, String ponderado) {
        this.nombre = nombre;
        this.id = id;
        this.carrera = carrera;
        this.edad = edad;
        this.ponderado = ponderado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPonderado() {
        return ponderado;
    }

    public void setPonderado(String ponderado) {
        this.ponderado = ponderado;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", id=" + id + ", carrera=" + carrera + ", edad=" + edad + ", ponderado=" + ponderado + '}';
    }
    
    
    
}
