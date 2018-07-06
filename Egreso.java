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
public class Egreso {
    private float CostoDeMercancia,Alquiler, Seguros, ArticulosDeOficina, ServiciosPublicos, Impuestos, Sueldos, PerdidaTotal;
    private String mes;
    public Egreso(){}

    public Egreso(float CostoDeMercancia, float Alquiler, float Seguros, float ArticulosDeOficina, float ServiciosPublicos, float Impuestos, float Sueldos,String Mes) {
        this.CostoDeMercancia = CostoDeMercancia;
        this.Alquiler = Alquiler;
        this.Seguros = Seguros;
        this.ArticulosDeOficina = ArticulosDeOficina;
        this.ServiciosPublicos = ServiciosPublicos;
        this.Impuestos = Impuestos;
        this.Sueldos = Sueldos;
        this.PerdidaTotal = 0;
        this.mes = Mes;        
    }

    public Egreso(String mes) {
        this.CostoDeMercancia = 0;
        this.Alquiler = 0;
        this.Seguros = 0;
        this.ArticulosDeOficina = 0;
        this.ServiciosPublicos = 0;
        this.Impuestos = 0;
        this.Sueldos = 0;
        this.PerdidaTotal = 0;
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }
    public void CalcularPerdida(){
        PerdidaTotal = CostoDeMercancia+Alquiler+Seguros+ArticulosDeOficina+ServiciosPublicos+Impuestos+Sueldos;
    }

    public float getPerdidaTotal() {
        CalcularPerdida();
        return PerdidaTotal;
    }
    
    public float getCostoDeMercancia() {
        return CostoDeMercancia;
    }

    public float getAlquiler() {
        return Alquiler;
    }

    public float getSeguros() {
        return Seguros;
    }

    public float getArticulosDeOficina() {
        return ArticulosDeOficina;
    }

    public float getServiciosPublicos() {
        return ServiciosPublicos;
    }

    public float getImpuestos() {
        return Impuestos;
    }

    public float getSueldos() {
        return Sueldos;
    }

    public void setCostoDeMercancia(float CostoDeMercancia) {
        this.CostoDeMercancia = CostoDeMercancia;
    }

    public void setAlquiler(float Alquiler) {
        this.Alquiler = Alquiler;
    }

    public void setSeguros(float Seguros) {
        this.Seguros = Seguros;
    }

    public void setArticulosDeOficina(float ArticulosDeOficina) {
        this.ArticulosDeOficina = ArticulosDeOficina;
    }

    public void setServiciosPublicos(float ServiciosPublicos) {
        this.ServiciosPublicos = ServiciosPublicos;
    }

    public void setImpuestos(float Impuestos) {
        this.Impuestos = Impuestos;
    }

    public void setSueldos(float Sueldos) {
        this.Sueldos = Sueldos;
    }
    
}
