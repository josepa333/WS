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
@NamedQueries({ @NamedQuery(name = "Bitacoralineasolicitud.findAll",
                            query = "select o from Bitacoralineasolicitud o") })
public class Bitacoralineasolicitud implements Serializable {
    private static final long serialVersionUID = -2089930120657829929L;
    @Column(nullable = false)
    private Integer cantidad;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fchinsersion;
    @Id
    @Column(nullable = false)
    private Integer idlineasolicitud;
    @Column(nullable = false)
    private Long idordenproduccion;
    @Column(nullable = false)
    private Integer idprenda;
    @Column(nullable = false)
    private Long idsolicitud;
    @Column(nullable = false)
    private Integer idtalla;
    @Column(nullable = false)
    private Integer idusuario;

    public Bitacoralineasolicitud() {
    }

    public Bitacoralineasolicitud(Integer cantidad, Date fchinsersion, Integer idlineasolicitud, Long idordenproduccion,
                                  Integer idprenda, Long idsolicitud, Integer idtalla, Integer idusuario) {
        this.cantidad = cantidad;
        this.fchinsersion = fchinsersion;
        this.idlineasolicitud = idlineasolicitud;
        this.idordenproduccion = idordenproduccion;
        this.idprenda = idprenda;
        this.idsolicitud = idsolicitud;
        this.idtalla = idtalla;
        this.idusuario = idusuario;
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

    public Long getIdordenproduccion() {
        return idordenproduccion;
    }

    public void setIdordenproduccion(Long idordenproduccion) {
        this.idordenproduccion = idordenproduccion;
    }

    public Integer getIdprenda() {
        return idprenda;
    }

    public void setIdprenda(Integer idprenda) {
        this.idprenda = idprenda;
    }

    public Long getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(Long idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Integer getIdtalla() {
        return idtalla;
    }

    public void setIdtalla(Integer idtalla) {
        this.idtalla = idtalla;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
}
