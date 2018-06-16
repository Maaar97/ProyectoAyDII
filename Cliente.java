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
public class Cliente {
    private String nombre;
    private String dpi;
    private String nivelAcademico;
    private String estudios;
    private String experiencia;
    private String telefono;
    private String residencia;
    private ProcesoWR proceso;

    public Cliente() {
    }

    public Cliente(String nombre, String dpi, String telefono) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.telefono = telefono;
    }

    public Cliente(String nombre, String dpi, String nivelAcademico, String estudios, String experiencia, String telefono, String residencia) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.nivelAcademico = nivelAcademico;
        this.estudios = estudios;
        this.experiencia = experiencia;
        this.telefono = telefono;
        this.residencia = residencia;
    }
    
    public void solicitarProceso(){
        proceso = new ProcesoWR(this);
    }
    
}
