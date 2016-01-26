
package ejercicio2Bloq2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import numeros.Numero;
/**
 *
 * @author Admin
 */
public class Empresa {
    Empleado []misEmpleados;
    Categoria []categorias={new Categoria("10",6f),new Categoria("20",8f),new Categoria("30",10),new Categoria("40",14),};
    public Empresa(int nEmpleados){
        misEmpleados=new Empleado[nEmpleados];
    }
    public Empresa (){
        misEmpleados=new Empleado[10];
    }
    public void pedirEmpleados() throws IOException{
        for (int nEmpl=0;nEmpl < misEmpleados.length;nEmpl++)
        {
            String nombre;
            int horas;
            int categoria;
            nombre=pedirNombre();
            horas=Numero.pedirNumero("Introduce las horas: ", 0);
            
            
        }
    }
    public int comprobarCategoria() throws IOException{
        String nombre;
        nombre=pedirNombre();
        int pos=0;
        boolean encontrado=false;
        do{
            while (!encontrado&& pos < categorias.length)
            {// Inicio Mientras
                if(categorias[pos].getDenominacion().equalsIgnoreCase(nombre))
                {
                    encontrado=true;
                }
                else
                {
                    pos++;
                }
            }
        }//Fin DO
        while (!encontrado);
        return pos;
    }
    public String pedirNombre() throws IOException {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String nombre = "";

        try {
            System.out.print("Escribe el nombre: ");
            nombre = teclado.readLine();

            boolean bien = false;
            int n = 0;
            //  (nombre.equalsIgnoreCase("")|| nombre.equalsIgnoreCase(" ")) 
            while (nombre.equalsIgnoreCase("") || nombre.equalsIgnoreCase(" ")) {
                System.out.println("Nombre Incorrecto");
                System.out.print("Introduce el nombre: ");
                nombre = teclado.readLine();
            }
        } catch (IOException ex) {
            ex.getMessage();
            System.out.print("Nombre INCORRECTO");
        }
        return nombre;
    }
}
