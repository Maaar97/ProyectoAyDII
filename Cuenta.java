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
public interface Cuenta {
    public void AgregarIngresos(float VentaDeProduc, float VentaDeServ);
    public void AgregarEgresos(float CostoMercaderia,float Alquileres, float ArticulosOficina, float ServicioPublicos, float impuesto, float Sueldos);
    public void ModificarCantidad(float cant);
}
