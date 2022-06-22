/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citasmedicas;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author gabri
 */
public class Receta {
    protected Date fecha;
    protected Paciente paciente;
    protected PlanNutricional planNut;
    protected ArrayList<Medicamento> medicamentos;
    protected Doctor doctor;

    public Receta(Date fecha, Paciente paciente, PlanNutricional planNut, ArrayList<Medicamento> medicamentos, Doctor doctor) {
        this.fecha = fecha;
        this.paciente = paciente;
        planNut = new PlanNutricional();
        this.medicamentos = medicamentos;
        this.doctor = doctor;
    }
    
    
}
