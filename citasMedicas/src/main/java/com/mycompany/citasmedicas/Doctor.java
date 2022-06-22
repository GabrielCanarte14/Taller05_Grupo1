/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citasmedicas;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria;
    protected ArrayList<AreaMedica> areas;
    protected ArrayList<Cita> citasPendientes;
    
    public void recetar(){
        
    }
    
    public void agregarPlanNut(){
        
    }
    
    public void imprimirReceta(){
        
    }
    
    public void registrarSecretaria(Secretaria sec){
        secretaria = sec;
    }
}
