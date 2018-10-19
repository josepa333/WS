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
@NamedQueries({ @NamedQuery(name = "Ordenproduccionro.findAll", query = "select o from Ordenproduccionro o") })
public class Ordenproduccionro implements Serializable {
    private static final long serialVersionUID = 357331419473103549L;
    @Column(length = 12)
    private String estado;
    private Object faltantes;
    @Temporal(TemporalType.DATE)
    private Date fchproduccion;
    @Id
    @Column(nullable = false)
    private Long idordenproduccion;
    private Object lineassolicitud;
    private Long unidadesaproducir;

    public Ordenproduccionro() {
    }

    public Ordenproduccionro(String estado, Object faltantes, Date fchproduccion, Long idordenproduccion,
                             Object lineassolicitud, Long unidadesaproducir) {
        this.estado = estado;
        this.faltantes = faltantes;
        this.fchproduccion = fchproduccion;
        this.idordenproduccion = idordenproduccion;
        this.lineassolicitud = lineassolicitud;
        this.unidadesaproducir = unidadesaproducir;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Object getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(Object faltantes) {
        this.faltantes = faltantes;
    }

    public Date getFchproduccion() {
        return fchproduccion;
    }

    public void setFchproduccion(Date fchproduccion) {
        this.fchproduccion = fchproduccion;
    }

    public Long getIdordenproduccion() {
        return idordenproduccion;
    }

    public void setIdordenproduccion(Long idordenproduccion) {
        this.idordenproduccion = idordenproduccion;
    }

    public Object getLineassolicitud() {
        return lineassolicitud;
    }

    public void setLineassolicitud(Object lineassolicitud) {
        this.lineassolicitud = lineassolicitud;
    }

    public Long getUnidadesaproducir() {
        return unidadesaproducir;
    }

    public void setUnidadesaproducir(Long unidadesaproducir) {
        this.unidadesaproducir = unidadesaproducir;
    }
}
