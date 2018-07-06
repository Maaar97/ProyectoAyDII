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
public class ConcreteBuilderIngreso implements Cuenta{

    public Ingreso ingresos;
    public ConcreteBuilderIngreso(){}
    
    public ConcreteBuilderIngreso(Ingreso ing){
        this.ingresos = ing;
        
    }
    
    public void buildVentaDeProducto(float VdP){
        this.ingresos.setVentasDeProductos(VdP);
    }
    public void buildVentaDeServicios(float VdS){
        this.ingresos.setVentasDeServicios(VdS);
    }
   
    @Override
    public void ModificarCantidad(float cant) {}
    
    @Override
    public void AgregarIngresos(float VentaDeProduc, float VentaDeServ) {
        buildVentaDeProducto(VentaDeProduc);
        buildVentaDeServicios(VentaDeServ);
    }
    public void MostrarIngresos(){
        System.out.println("Mes: "+ingresos.getMes());
        System.out.println("Ventas de productos: Q"+ingresos.getVentasDeProductos());
        System.out.println("Ventas de servicios: Q"+ingresos.getVentasDeServicios());
        System.out.println("Ganancia: Q"+ingresos.getGananciaBruta());
    }
    @Override
    public void AgregarEgresos(float CostoMercaderia, float Alquileres, float ArticulosOficina, float ServicioPublicos, float impuesto, float Sueldos) {}
}
