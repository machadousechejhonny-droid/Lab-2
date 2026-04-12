/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.cdi;

/**
 *
 * @author macha
 */
public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasExtras;
    private double comisiones;

    public Empleado(String nombre, double salarioBase, int horasExtras, double comisiones) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.comisiones = comisiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salarioBase=" + salarioBase + ", horasExtras=" + horasExtras + ", comisiones=" + comisiones + '}';
    }
}
