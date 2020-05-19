/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_2_git;

import java.util.Calendar;

/**
 *
 * @author jjggs_000
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Profesor profesor1 = new Profesor("Juan", "Hernández García", 33);

        profesor1.setIdProfesor("Prof 22-387-11");

        Calendar fecha1 = Calendar.getInstance();

        fecha1.set(2019, 10, 22); //Los meses van de 0 a 11, luego 10 representa noviembre

        ProfesorInterino interino1 = new ProfesorInterino("José Luis", "Morales Pérez", 54, fecha1);
        
        Alumno alumno1 = new Alumno("Raquel", "Molina Sanchez", 18);
        
        alumno1.setIdAlumno("Alum 19-55-08-03");
        
        Calendar fecha2 = Calendar.getInstance();
        
        fecha2.set(2020, 02, 01);
        
        AlumnoForaneo foraneo1 = new AlumnoForaneo("Maggy", "Sigala", 19, fecha2);        

        ListinProfesores listin1 = new ListinProfesores();

        listin1.addProfesor(profesor1);

        listin1.addProfesor(interino1);
        
        listin1.addAlumno(alumno1);

        listin1.addAlumno(foraneo1);

        listin1.listar();       
        
    } //Cierre del main
}
    

