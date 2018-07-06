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
public class Finanza {
   private ConcreteBuilderIngreso CBingreso;
   private ConcreteBuilderEgresos CBegresos;
   public void setCBingreso(ConcreteBuilderIngreso CBI){
       CBingreso = CBI;
   }
   public void setCBegreso(ConcreteBuilderEgresos CBE){
       CBegresos = CBE;
   }
   
}
