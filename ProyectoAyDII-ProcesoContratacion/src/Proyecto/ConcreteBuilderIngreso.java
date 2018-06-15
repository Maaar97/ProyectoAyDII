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
        System.out.println("Ventas de Productos: Q"+VdP);
        //tira error aca tambien y no se porque mergas :v si lo comentas da, igual en el de ventasDeServicios ALV, lo mismo pasa en Egresos
        //Pd no supe hacer lo del director :c esta pizado :c
        this.ingresos.setVentasDeProductos(VdP);
    }
    public void buildVentaDeServicios(float VdS){
        System.out.println("Ventas de Servicios: Q"+VdS);
        this.ingresos.setVentasDeServicios(VdS);
    }
  
    @Override
    public void ModificarCantidad(float cant) {}
    
    @Override
    public void AgregarIngresos(float VentaDeProduc, float VentaDeServ, String mes) {
        System.out.println("Mes: "+mes);
        buildVentaDeProducto(VentaDeProduc);
        buildVentaDeServicios(VentaDeServ);
        //no tengo idea porque madres me tira error aca :c si lo comentas da :c pero no se porque me tira error :c
        
        System.out.println("Ganancia: Q"+ingresos.getGananciaBruta());
    }

    @Override
    public void AgregarEgresos(float CostoMercaderia, float Alquileres, float ArticulosOficina, float ServicioPublicos, float impuesto, float Sueldos, String mes) {}
}
