/*
   Clase Profesor Interino Hereda de clase Profesor
 */
package ejem_2_git;

import java.util.Calendar;

/**
 *
 * @author jjggs_000
 */
public class ProfesorInterino extends Profesor {
    
    private Calendar FechaComienzoInterinidad;

    public ProfesorInterino(Calendar fechaComienzaInterinidad) {

        super();

        FechaComienzoInterinidad = fechaComienzaInterinidad;
    }

    public ProfesorInterino(String nombre, String apellidos, int edad, Calendar fechaComienzaInterinidad) {

        super(nombre, apellidos, edad);

        FechaComienzoInterinidad = fechaComienzaInterinidad;
    }

    public Calendar getFechaComienzoInterinidad() {
        return FechaComienzoInterinidad;
    }
   //metodo sobreescrito respecto al de la Superclase Profesor
    public void mostrarDatos() {
        System.out.println("Datos ProfesorInterino. Comienzo interinidad: "
                + FechaComienzoInterinidad.getTime().toString());
    }
}
