/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuardarFinanzas;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alvarado Legrand
 */
@Entity
@NamedQuery(name="Egresos.PerdidaTotal",
        query="SELECT ingr FROM Egresos AS ingr WHERE ingr.fecha BETWEEN :fInicio AND :fFin")

public class Egresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float CostoDeMercancia,Sueldos,Alquiler,ArticulosDeOficina,ServiciosPublicos,Impuestos,PerdidaTotal;
    @Temporal(TemporalType.DATE)
    private Date fecha = new Date();
    static Date dNow = new Date( );
    static SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
     public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPerdidaTotal() {
        return PerdidaTotal;
    }

    public void setPerdidaTotal(float PerdidaTotal) {
        this.PerdidaTotal = PerdidaTotal;
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

    /*public void setFecha() {
//        this.fecha = formatDate(fecha,"yyyy-MM-dd");
//        System.out.println("Fecha: "+fecha);
        this.fecha = ft.format(dNow);
        System.out.println("Fecha Actual: " + ft.format(dNow));
    }*/

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
