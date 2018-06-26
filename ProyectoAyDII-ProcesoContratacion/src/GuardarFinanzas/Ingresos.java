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
public class Ingresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float VentasDeProductos, VentasDeServicios;
    private String fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getVentasDeProductos() {
        return VentasDeProductos;
    }

    public float getVentasDeServicios() {
        return VentasDeServicios;
    }

    public String getFecha() {
        return fecha;
    }

    public void setVentasDeProductos(float VentasDeProductos) {
        this.VentasDeProductos = VentasDeProductos;
    }

    public void setVentasDeServicios(float VentasDeServicios) {
        this.VentasDeServicios = VentasDeServicios;
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
        if (!(object instanceof Ingresos)) {
            return false;
        }
        Ingresos other = (Ingresos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GuardarFinanzas.Ingresos[ id=" + id + " ]";
    }
    
}
