/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author macha
 */
@Alternative
@ApplicationScoped
public class CalcularHorasExtras implements SalarioCalculator{

    @Override
    public double calcularSalario(Empleado e) {
        return e.getSalarioBase() + e.getHorasExtras() * 10000;
    }
    
}
