package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Lineasolicitud.findAll", query = "select o from Lineasolicitud o") })
public class Lineasolicitud implements Serializable {
    private static final long serialVersionUID = -5563528953915134668L;
    @Column(nullable = false)
    private Integer cantidad;
    @Id
    @Column(nullable = false)
    private Integer idlineasolicitud;
    @ManyToOne
    @JoinColumn(name = "IDTALLA")
    private Talla talla;
    @ManyToOne
    @JoinColumn(name = "IDSOLICITUD")
    private Solicitud bitacoralineasolicitud;
    @ManyToOne
    @JoinColumn(name = "IDORDENPRODUCCION")
    private Ordenproduccion ordenproduccion1;
    @ManyToOne
    @JoinColumn(name = "IDPRENDA")
    private Prenda prenda1;

    public Lineasolicitud() {
    }

    public Lineasolicitud(Integer cantidad, Integer idlineasolicitud, Ordenproduccion ordenproduccion1, Prenda prenda1,
                          Solicitud bitacoralineasolicitud, Talla talla) {
        this.cantidad = cantidad;
        this.idlineasolicitud = idlineasolicitud;
        this.ordenproduccion1 = ordenproduccion1;
        this.prenda1 = prenda1;
        this.bitacoralineasolicitud = bitacoralineasolicitud;
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


    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Solicitud getBitacoralineasolicitud() {
        return bitacoralineasolicitud;
    }

    public void setBitacoralineasolicitud(Solicitud bitacoralineasolicitud) {
        this.bitacoralineasolicitud = bitacoralineasolicitud;
    }

    public Ordenproduccion getOrdenproduccion1() {
        return ordenproduccion1;
    }

    public void setOrdenproduccion1(Ordenproduccion ordenproduccion1) {
        this.ordenproduccion1 = ordenproduccion1;
    }

    public Prenda getPrenda1() {
        return prenda1;
    }

    public void setPrenda1(Prenda prenda1) {
        this.prenda1 = prenda1;
    }
}
