/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuardarFinanzas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Alvarado Legrand
 */
@Entity
public class Egresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float CostoDeMercancia,Sueldos,Alquiler,ArticulosDeOficina,ServiciosPublicos,Impuestos;
    private String fecha;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getCostoDeMercancia() {
        return CostoDeMercancia;
    }

    public float getSueldos() {
        return Sueldos;
    }

    public float getAlquiler() {
        return Alquiler;
    }

    public float getArticulosDeOficina() {
        return ArticulosDeOficina;
    }

    public float getServiciosPublicos() {
        return ServiciosPublicos;
    }

    public float getImpuestos() {
        return Impuestos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setCostoDeMercancia(float CostoDeMercancia) {
        this.CostoDeMercancia = CostoDeMercancia;
    }

    public void setSueldos(float Sueldos) {
        this.Sueldos = Sueldos;
    }

    public void setAlquiler(float Alquiler) {
        this.Alquiler = Alquiler;
    }

    public void setArticulosDeOficina(float ArticulosDeOficina) {
        this.ArticulosDeOficina = ArticulosDeOficina;
    }

    public void setServiciosPublicos(float ServiciosPublicos) {
        this.ServiciosPublicos = ServiciosPublicos;
    }

    public void setImpuestos(float Impuestos) {
        this.Impuestos = Impuestos;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Egresos)) {
            return false;
        }
        Egresos other = (Egresos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GuardarFinanzas.Egresos[ id=" + id + " ]";
    }
    
}
