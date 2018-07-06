/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author mariano
 */
public class ProcesoWR implements ProcesoContratacion{
    private String entrevista;
    private String pruebas;
    private String poligrafo;
    private Cliente solicitante;

    public ProcesoWR(Cliente solicitante) {
        this.solicitante = solicitante;
    }    
    
    @Override
    public void realizarEntrevista() {
        System.out.println("Con base en las preguntas realizadas se concluye que.......");
    }

    @Override
    public void realizarPruebas() {
        System.out.println("Los resultados de las pruebas psicométricas realizadas sugieren que.......");
    }
    
    public void realizarPoligrafo(){
        System.out.println("La prueba de poligrafo realizada nos lleva a concluir......");
    }
}
