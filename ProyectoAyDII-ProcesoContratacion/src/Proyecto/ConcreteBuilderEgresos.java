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
    public ConcreteBuilderEgresos(Egreso eg){}
    
    public void buildCostoDeMercaderia(float CDM){
        System.out.println("Costo de Mercaderia: Q"+CDM);
        
    }
    public void buildAlquiler(float AQ){
        System.out.println("Alquileres: Q"+AQ);
        
    }
    public void buildArticuloDeOficina(float ADO){
        System.out.println("Gasto articulos de oficina: Q"+ADO);
        
    }
    public void buildServiciosPublicos(float SP){
        System.out.println("Gasto Servicios publicos: Q"+SP);
        
    }
    public void buildImpuesto(float ip){
        System.out.println("Impuestos: Q"+ip);
        
    }
    public void buildSueldos(float SL){
        System.out.println("Sueldos: Q"+SL);
        
    }
    @Override
    public void AgregarIngresos(float VentaDeProduc, float VentaDeServ, String mes) { }

    @Override
    public void AgregarEgresos(float CostoMercaderia, float Alquileres, float ArticulosOficina, float ServicioPublicos, float impuesto, float Sueldos, String mes) {
        System.out.println("Mes: "+mes);
        buildCostoDeMercaderia(CostoMercaderia);
        buildAlquiler(Alquileres);
        buildArticuloDeOficina(ArticulosOficina);
        buildServiciosPublicos(ServicioPublicos);
        buildImpuesto(impuesto);
        buildSueldos(Sueldos);
        egresos.CalcularPerdida();
    }

    @Override
    public void ModificarCantidad(float cant) {}
    
}
