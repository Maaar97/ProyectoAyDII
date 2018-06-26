package Proyecto;

import GuardarFinanzas.Egresos;
import GuardarFinanzas.EgresosJpaController;
import GuardarFinanzas.Ingresos;
import GuardarFinanzas.IngresosJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        
        //Creacion de manager factory Para BD
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoAD2PU");
        IngresosJpaController AT = new IngresosJpaController(emf);
        EgresosJpaController EG = new EgresosJpaController(emf);
        Ingreso septiembre = new Ingreso("Septiembre");
        Egreso Noviembre = new Egreso("Noviembre");
        ConcreteBuilderIngreso CBIN = new ConcreteBuilderIngreso(septiembre);
        CBIN.AgregarIngresos(1255, 8888);
        CBIN.MostrarIngresos();
        Ingresos ingreso = new Ingresos();
        ingreso.setId(0l);
        ingreso.setVentasDeProductos(septiembre.getVentasDeProductos());
        ingreso.setVentasDeServicios(septiembre.getVentasDeServicios());
        AT.create(ingreso);
            
        
        //se muestran los ingresos creando un objeto ingreso
        System.out.println("\n");
        Egresos egresos = new Egresos();
        ConcreteBuilderEgresos CBEG = new ConcreteBuilderEgresos(Noviembre);
        CBEG.AgregarEgresos(1259, 5598, 4586, 89, 78998, 89);
        CBEG.MostrarEgresos();
        egresos.setId(0l);
        egresos.setCostoDeMercancia(Noviembre.getCostoDeMercancia());
        egresos.setArticulosDeOficina(Noviembre.getArticulosDeOficina());
        egresos.setImpuestos(Noviembre.getImpuestos());
        egresos.setAlquiler(Noviembre.getAlquiler());
        egresos.setSueldos(Noviembre.getSueldos());
        egresos.setServiciosPublicos(Noviembre.getServiciosPublicos()); 
        EG.create(egresos);
//se muestran los ingresos creando un objeto egreso
    }
    
}
