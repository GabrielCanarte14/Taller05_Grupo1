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
public class Paciente extends Persona {

    protected String email;
    protected Cita cita;
    protected HistoriaClinica historia;
    protected ArrayList<Receta> recetas;
    
    public Paciente(String email, Cita cita, ArrayList<Receta> recetas) {
        this.email = email;
        this.cita = cita;
        historia = new HistoriaClinica();
        this.recetas = recetas;
    }
    
    public boolean solicitarCita(){
        return true;
    }
}
