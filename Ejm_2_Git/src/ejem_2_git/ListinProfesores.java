/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_2_git;

import java.util.ArrayList;

/**
 *
 * @author stela
 */
public class ListinProfesores {
    private ArrayList<Profesor> listinProfesores;
    private ArrayList<Alumno> listinAlumnos;
    
    public ListinProfesores(){
        listinProfesores = new ArrayList<Profesor>();
        listinAlumnos = new ArrayList<Alumno>();
    }
    
    public void addProfesor(Profesor profesor){
        listinProfesores.add(profesor);
    }
    
    public void addAlumno(Alumno alumno){
        listinAlumnos.add(alumno);
    }
    
    public void listar(){
        System.out.println("Se procede a mostrar los datos de los profesores existentes en el listin");
        
        for (Profesor tmp : listinProfesores){
            tmp.mostrarDatos();
        }
        
        System.out.println("Se procede a mostrar los datos de los alumnos existentes en el listin");
        
        for (Alumno tmt : listinAlumnos){
            tmt.mostrarDatos();
        }
    }
}
