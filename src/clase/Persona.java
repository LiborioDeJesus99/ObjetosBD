/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author lcastane6
 */
public class Persona {

    //Atributos
    private long identificacion;
    private String primer_nombre;
    private String primer_apellido;

    //Constructor-Parametros
    public Persona(long identificacion, String primer_nombre, String primer_apellido) {
        this.identificacion = identificacion;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
    }

    //Get
    public long getIdentificacion() {
        return this.identificacion;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    //Set
    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

}
