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
public class PagoTarjeta implements Pago{
    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;

    @Override
    public boolean realizarPago(float monto) {
       return true;
    }
}
