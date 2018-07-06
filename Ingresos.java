/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuardarFinanzas;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
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

@Entity(name = Ingresos.tableName)

@NamedQuery(name="Ingresos.GananciaMes",
        query="SELECT ingr FROM "+Ingresos.tableName+" AS ingr WHERE ingr.fecha BETWEEN :fInicio AND :fFin")
@Table(name = Ingresos.tableName)
public class Ingresos implements Serializable {
//SELECT GananciaTotalFROM bdtienda.venta where month(fecha) = 9 ;
    private static final long serialVersionUID = 1L;
    public static final String tableName = "INGRESOS";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float VentasDeProductos, VentasDeServicios;
    static SimpleDateFormat formDate = new SimpleDateFormat ("dd/MM/yyyy");
    @Temporal(TemporalType.DATE)
    private Date fecha = new Date();
 
    static Date dNow = new Date( );
    
    static SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
    float GananciaTotal;
    
    public Date getFecha() {
        return fecha;
    }

//    public void setFecha() {
//        this.fecha = ft.format(dNow);
////        this.fecha = formatDate(fecha,"yyyy-MM-dd");
////        System.out.println("Fecha: "+fecha);
//        System.out.println("Fecha Actual: " + ft.format(dNow));
//    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public SimpleDateFormat getFormDate() {
        return formDate;
    }

    public void setFormDate(SimpleDateFormat formDate) {
        Ingresos.formDate = formDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getGananciaTotal() {
        return GananciaTotal;
    }

    public void setGananciaTotal(float GananciaTotal) {
        this.GananciaTotal = GananciaTotal;
    }

    public float getVentasDeProductos() {
        return VentasDeProductos;
    }

    public float getVentasDeServicios() {
        return VentasDeServicios;
    }

   
    public void setVentasDeProductos(float VentasDeProductos) {
        this.VentasDeProductos = VentasDeProductos;
    }

    public void setVentasDeServicios(float VentasDeServicios) {
        this.VentasDeServicios = VentasDeServicios;
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

    private void formDate(Date fecha2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
