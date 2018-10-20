package webservice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Lineasolicitud.findAll", query = "select o from Lineasolicitud o") })
public class LineaSolicitud implements Serializable {
    private static final long serialVersionUID = -472196527465968131L;
    @Column(nullable = false)
    private Integer cantidad;
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

    public LineaSolicitud() {
    }

    public LineaSolicitud(Integer cantidad, Integer idlineasolicitud, Long idordenproduccion, Integer idprenda,
                          Long idsolicitud, Integer idtalla) {
        this.cantidad = cantidad;
        this.idlineasolicitud = idlineasolicitud;
        this.idordenproduccion = idordenproduccion;
        this.idprenda = idprenda;
        this.idsolicitud = idsolicitud;
        this.idtalla = idtalla;
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

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("cantidad=");
        buffer.append(getCantidad());
        buffer.append(',');
        buffer.append("idlineasolicitud=");
        buffer.append(getIdlineasolicitud());
        buffer.append(',');
        buffer.append("idordenproduccion=");
        buffer.append(getIdordenproduccion());
        buffer.append(',');
        buffer.append("idprenda=");
        buffer.append(getIdprenda());
        buffer.append(',');
        buffer.append("idtalla=");
        buffer.append(getIdtalla());
        buffer.append(']');
        return buffer.toString();
    }
}
