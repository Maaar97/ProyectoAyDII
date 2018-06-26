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
public class ConcreteBuilderEgresos implements Cuenta{
    Egreso egresos;
    public ConcreteBuilderEgresos(){}
    public ConcreteBuilderEgresos(Egreso eg){
        this.egresos = eg;
    }
    
    public void buildCostoDeMercaderia(float CDM){
        this.egresos.setCostoDeMercancia(CDM);
    }
    public void buildAlquiler(float AQ){
        this.egresos.setAlquiler(AQ);
    }
    public void buildArticuloDeOficina(float ADO){
        this.egresos.setArticulosDeOficina(ADO);
    }
    public void buildServiciosPublicos(float SP){
        this.egresos.setServiciosPublicos(SP);
    }
    public void buildImpuesto(float ip){
        this.egresos.setImpuestos(ip);
    }
    public void buildSueldos(float SL){
        this.egresos.setSueldos(SL);
    }
    
    @Override
    public void AgregarEgresos(float CostoMercaderia, float Alquileres, float ArticulosOficina, float ServicioPublicos, float impuesto, float Sueldos) {
        
        buildCostoDeMercaderia(CostoMercaderia);
        buildAlquiler(Alquileres);
        buildArticuloDeOficina(ArticulosOficina);
        buildServiciosPublicos(ServicioPublicos);
        buildImpuesto(impuesto);
        buildSueldos(Sueldos);
        egresos.CalcularPerdida();
    }
    public void MostrarEgresos(){
        System.out.println("Mes: "+egresos.getMes());
        System.out.println("Costos de Mercaderia: Q"+egresos.getCostoDeMercancia());
        System.out.println("Alquileres: Q"+egresos.getAlquiler());
        System.out.println("Articulos de Oficina Q"+egresos.getArticulosDeOficina());
        System.out.println("Servicios Publicos: Q"+egresos.getServiciosPublicos());
        System.out.println("Impuestos Q"+egresos.getImpuestos());
        System.out.println("Sueldos: Q"+egresos.getSueldos());
        System.out.println("Perdida Total Mes "+egresos.getMes()+", Q"+egresos.getPerdidaTotal());
    }

    @Override
    public void ModificarCantidad(float cant) {}

    @Override
    public void AgregarIngresos(float VentaDeProduc, float VentaDeServ) {  }
    
}
