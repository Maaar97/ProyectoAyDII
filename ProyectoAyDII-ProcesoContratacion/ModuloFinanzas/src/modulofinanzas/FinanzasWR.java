/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulofinanzas;

/**
 *
 * @author GREENCYBER
 */
public class FinanzasWR implements Finanza{
    private float ingresos;
    private float Egresos;
    private float Impuestos;
    private float Salarios;
    private float Deudas;
    
    public FinanzasWR(){}

    public FinanzasWR(float ingresos, float Egresos, float Impuestos, float Salarios, float Deudas) {
        this.ingresos = ingresos;
        this.Egresos = Egresos;
        this.Impuestos = Impuestos;
        this.Salarios = Salarios;
        this.Deudas = Deudas;
    }
    
    @Override
    public void CalcularGanancia() {
        System.out.println("Ganancias");
    }

    @Override
    public void CalcularPerdida() {
        System.out.println("perdidas");
    }
    
}
