package ws;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Bitacoralineasolicitudro.findAll",
                            query = "select o from Bitacoralineasolicitudro o") })
public class Bitacoralineasolicitudro implements Serializable {
    private static final long serialVersionUID = -2875482586887237228L;
    private Integer cantidad;
    @Temporal(TemporalType.DATE)
    private Date fchinsersion;
    @Id
    @Column(nullable = false)
    private Integer idlineasolicitud;
    private Object ordenproduccion;
    private Object prenda;
    private Object solicitud;
    private Object talla;
    private Object usuario;

    public Bitacoralineasolicitudro() {
    }

    public Bitacoralineasolicitudro(Integer cantidad, Date fchinsersion, Integer idlineasolicitud,
                                    Object ordenproduccion, Object prenda, Object solicitud, Object talla,
                                    Object usuario) {
        this.cantidad = cantidad;
        this.fchinsersion = fchinsersion;
        this.idlineasolicitud = idlineasolicitud;
        this.ordenproduccion = ordenproduccion;
        this.prenda = prenda;
        this.solicitud = solicitud;
        this.talla = talla;
        this.usuario = usuario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFchinsersion() {
        return fchinsersion;
    }

    public void setFchinsersion(Date fchinsersion) {
        this.fchinsersion = fchinsersion;
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

    public Object getUsuario() {
        return usuario;
    }

    public void setUsuario(Object usuario) {
        this.usuario = usuario;
    }
}
