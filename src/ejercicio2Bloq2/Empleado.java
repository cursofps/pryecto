
package ejercicio2Bloq2;

/**
 *
 * @author Admin
 */
public class Empleado {
    String nombre;
    int codCategoria;
    int horas;
    public Empleado (String nombre,int horas,int codCategoria){
        this.nombre=nombre;
        this.horas=horas;
        this.codCategoria=codCategoria;
    }
    public Empleado(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
}
