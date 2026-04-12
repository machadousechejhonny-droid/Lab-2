/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.cdi;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author macha
 */
@Named
@RequestScoped
public class SalarioProcessor{
    @Inject EmpleadoDao empleadoDao;
    
    @Inject SalarioCalculator salarioCalculator;
    
    public void execute(){
        List<Empleado> empleados = empleadoDao.fetchEmpleados();
        
        for(Empleado e : empleados){
            double salario = salarioCalculator.calcularSalario(e);
            System.out.println(e.getNombre() + ": " + salario);
        }
    }
}
