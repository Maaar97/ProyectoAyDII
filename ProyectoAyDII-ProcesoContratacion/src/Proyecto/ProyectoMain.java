package Proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class ProyectoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Finanza finanza = new Finanza();
        ConcreteBuilderIngreso CBIN = new ConcreteBuilderIngreso();
        ConcreteBuilderEgresos CBEG = new ConcreteBuilderEgresos();
        CBIN.AgregarIngresos(1200, 3544, "Junio");
        CBEG.AgregarEgresos(522, 1850, 15998, 1888, 15598, 4898, "Junio");
    }
    
}
