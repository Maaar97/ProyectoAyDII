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
        Ingreso septiembre = new Ingreso("Septiembre");
        Egreso Noviembre = new Egreso("Noviembre");
        ConcreteBuilderIngreso CBIN = new ConcreteBuilderIngreso(septiembre);
        CBIN.AgregarIngresos(1255, 8888);
        CBIN.MostrarIngresos();
        ConcreteBuilderEgresos CBEG = new ConcreteBuilderEgresos(Noviembre);
        CBEG.AgregarEgresos(1259, 5598, 4586, 89, 78998, 89);
        CBEG.MostrarEgresos();
        
    }
    
}
