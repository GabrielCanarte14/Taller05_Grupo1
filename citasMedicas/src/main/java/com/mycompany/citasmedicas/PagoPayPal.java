/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citasmedicas;

/**
 *
 * @author gabri
 */
public class PagoPayPal implements Pago{
    protected float monto;
    protected String email;

    @Override
    public boolean realizarPago(float monto) {
        return true;
    }
}
