/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citasmedicas;
import java.util.Date;
/**
 *
 * @author gabri
 */
public class Cita{
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;
    protected Doctor doctor;

    public boolean realizarPago(Pago pago) {
        return true;
    } 
}
