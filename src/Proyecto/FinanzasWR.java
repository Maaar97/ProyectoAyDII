/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author GREENCYBER
 */
public class FinanzasWR implements Finanza{
    private float ingresos;
    private float egresos;
    private float impuestos;
    private float salarios;
    private float deudas;
    
    public FinanzasWR(){
    
    }

    public FinanzasWR(float ingresos, float egresos) {
        this.ingresos = ingresos;
        this.egresos = egresos;
    }
    
    public FinanzasWR(float ingresos, float egresos, float impuestos, float salarios, float deudas) {
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.impuestos = impuestos;
        this.salarios = salarios;
        this.deudas = deudas;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public void setSalarios(float salarios) {
        this.salarios = salarios;
    }

    public void setDeudas(float deudas) {
        this.deudas = deudas;
    }

    @Override
    public void ingresarRegistro() {
        System.out.println("Datos registrados: ");
        System.out.println("\tIngresos: " + ingresos);
        System.out.println("\tEgresos: " + egresos);
    }

    @Override
    public void calcularGanancia() {
        float ganancia = ingresos - (egresos+impuestos+salarios+deudas);
        System.out.println("La ganancia total es de: " + ganancia);
    }
    
}
