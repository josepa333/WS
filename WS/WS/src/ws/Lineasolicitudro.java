package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.math.BigDecimal;
import oracle.sql.REF;
import oracle.sql.CHAR;
import oracle.sql.DATE;

@Entity
@NamedQueries({ @NamedQuery(name = "Lineasolicitudro.findAll", query = "select o from Lineasolicitudro o") })
public class Lineasolicitudro implements Serializable {
    private static final long serialVersionUID = 8375922836366980704L;
    private Integer cantidad;
    @Id
    @Column(nullable = false)
    private Integer idlineasolicitud;
    private Object ordenproduccion;
    private Object prenda;
    private Object solicitud;
    private Object talla;

    public Lineasolicitudro() {
    }

    public Lineasolicitudro(Integer cantidad, Integer idlineasolicitud, Object ordenproduccion, Object prenda,
                            Object solicitud, Object talla) {
        this.cantidad = cantidad;
        this.idlineasolicitud = idlineasolicitud;
        this.ordenproduccion = ordenproduccion;
        this.prenda = prenda;
        this.solicitud = solicitud;
        this.talla = talla;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdlineasolicitud() {
        return idlineasolicitud;
    }

    public void setIdlineasolicitud(Integer idlineasolicitud) {
        this.idlineasolicitud = idlineasolicitud;
    }

    public Object getOrdenproduccion() {
        return ordenproduccion;
    }

    public void setOrdenproduccion(Object ordenproduccion) {
        this.ordenproduccion = ordenproduccion;
    }

    public Object getPrenda() {
        return prenda;
    }

    public void setPrenda(Object prenda) {
        this.prenda = prenda;
    }

    public Object getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Object solicitud) {
        this.solicitud = solicitud;
    }

    public Object getTalla() {
        return talla;
    }

    public void setTalla(Object talla) {
        this.talla = talla;
    }
}
