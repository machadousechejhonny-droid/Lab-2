/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.cdi;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author macha
 */
@Alternative
@RequestScoped
public class CalcularSalarioBase implements SalarioCalculator{

    @Override
    public double calcularSalario(Empleado e) {
        return e.getSalarioBase();
    }
    
}
