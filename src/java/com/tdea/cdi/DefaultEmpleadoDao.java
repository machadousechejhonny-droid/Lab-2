/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.cdi;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author macha
 */
@RequestScoped
public class DefaultEmpleadoDao implements EmpleadoDao{
    
    @Override
    public List<Empleado> fetchEmpleados(){
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new Empleado("Juan", 1000000, 5, 200000));
        empleados.add(new Empleado("Ana", 1200000, 2, 500000));
        empleados.add(new Empleado("Luis", 900000, 10, 0));

        return empleados;
    }
}
