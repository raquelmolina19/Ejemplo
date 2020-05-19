/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_2_git;

/**
 *
 * @author stela
 */
public class Alumno extends Persona {
    private String IdAlumno;

    public Alumno() {
        super();

        IdAlumno = "Unknown";
    }

    public Alumno(String nombre, String apellidos, int edad) {

        super(nombre, apellidos, edad);

        IdAlumno = "Unknown";
    }

    public void setIdAlumno(String IdProfesor) {
        this.IdAlumno = IdProfesor;
    }

    public String getIdAlumno() {
        return IdAlumno;
    }

    public void mostrarDatos() {

        System.out.println("Datos Alumno. Alumno de nombre: " + getNombre() + " " + getApellidos()
                + " con Id de alumno: " + getIdAlumno());
    } 
}

    

