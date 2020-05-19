/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_2_git;

import java.util.Calendar;

/**
 *
 * @author stela
 */
public class AlumnoForaneo extends Alumno {
    
    private Calendar FechaComienzoForaneidad;

    public AlumnoForaneo(Calendar fechaComienzaForaneidad) {

        super();

        FechaComienzoForaneidad = fechaComienzaForaneidad;
    }

    public AlumnoForaneo(String nombre, String apellidos, int edad, Calendar fechaComienzaForaneidad) {

        super(nombre, apellidos, edad);

        FechaComienzoForaneidad = fechaComienzaForaneidad;
    }

    public Calendar getFechaComienzoInterinidad() {
        return FechaComienzoForaneidad;
    }
   //metodo sobreescrito respecto al de la Superclase Profesor
    public void mostrarDatos() {
        System.out.println("Datos AlumnoForaneo. Comienzo foraneidad: "
                + FechaComienzoForaneidad.getTime().toString());
    }
}

