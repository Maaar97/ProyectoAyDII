/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Alvarado Legrand
 */
public class Ingreso {
    private float VentasDeProductos, VentasDeServicios, GananciaBruta;
    private String mes;
    public Ingreso(){}

    public Ingreso(float VentasDeProductos, float VentasDeServicios, String mes) {
        this.VentasDeProductos = VentasDeProductos;
        this.VentasDeServicios = VentasDeServicios;
        this.GananciaBruta = 0;
        this.mes = mes;
    }

    public Ingreso(String mes) {
        this.VentasDeProductos = 0;
        this.VentasDeServicios = 0;
        this.GananciaBruta = 0;
        this.mes = mes;
    }
    
    

    public String getMes() {
        return mes;
    }

    public void setVentasDeProductos(float VentasDeProductos) {
        this.VentasDeProductos = VentasDeProductos;
    }

    public void setVentasDeServicios(float VentasDeServicios) {
        this.VentasDeServicios = VentasDeServicios;
    }
    
    public  void CalcularGanancias() {
        GananciaBruta = VentasDeProductos + VentasDeServicios;
    }

    public float getVentasDeProductos() {
        return VentasDeProductos;
    }

    public float getVentasDeServicios() {
        return VentasDeServicios;
    }

    public float getGananciaBruta() {
        CalcularGanancias();
        return GananciaBruta;
    }
    
    
    
}
