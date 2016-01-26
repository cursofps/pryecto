
package ejercicio2Bloq2;

/**
 *
 * @author Admin
 */
public class Categoria {
    String denominacion;
    float tarifa;
    public Categoria(String d, float t){
        denominacion=d;
        tarifa=t;
    }
    public Categoria(){}

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    
}
