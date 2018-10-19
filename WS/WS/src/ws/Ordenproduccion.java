package ws;

import java.io.Serializable;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Ordenproduccion.findAll", query = "select o from Ordenproduccion o") })
public class Ordenproduccion implements Serializable {
    private static final long serialVersionUID = 3130776681254445211L;
    @Column(length = 12)
    private String estado;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fchproduccion;
    @Id
    @Column(nullable = false)
    private Long idordenproduccion;
    @Column(nullable = false)
    private Long unidadesaproducir;
    @OneToMany(mappedBy = "ordenproduccion", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Faltantes> faltantesList;
    @OneToMany(mappedBy = "ordenproduccion1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Lineasolicitud> bitacoralineasolicitudList2;

    public Ordenproduccion() {
    }

    public Ordenproduccion(String estado, Date fchproduccion, Long idordenproduccion, Long unidadesaproducir) {
        this.estado = estado;
        this.fchproduccion = fchproduccion;
        this.idordenproduccion = idordenproduccion;
        this.unidadesaproducir = unidadesaproducir;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public Long getUnidadesaproducir() {
        return unidadesaproducir;
    }

    public void setUnidadesaproducir(Long unidadesaproducir) {
        this.unidadesaproducir = unidadesaproducir;
    }

    public List<Faltantes> getFaltantesList() {
        return faltantesList;
    }

    public void setFaltantesList(List<Faltantes> faltantesList) {
        this.faltantesList = faltantesList;
    }

    public Faltantes addFaltantes(Faltantes faltantes) {
        getFaltantesList().add(faltantes);
        faltantes.setOrdenproduccion(this);
        return faltantes;
    }

    public Faltantes removeFaltantes(Faltantes faltantes) {
        getFaltantesList().remove(faltantes);
        faltantes.setOrdenproduccion(null);
        return faltantes;
    }

    public List<Lineasolicitud> getBitacoralineasolicitudList2() {
        return bitacoralineasolicitudList2;
    }

    public void setBitacoralineasolicitudList2(List<Lineasolicitud> bitacoralineasolicitudList2) {
        this.bitacoralineasolicitudList2 = bitacoralineasolicitudList2;
    }

    public Lineasolicitud addLineasolicitud(Lineasolicitud lineasolicitud) {
        getBitacoralineasolicitudList2().add(lineasolicitud);
        lineasolicitud.setOrdenproduccion1(this);
        return lineasolicitud;
    }

    public Lineasolicitud removeLineasolicitud(Lineasolicitud lineasolicitud) {
        getBitacoralineasolicitudList2().remove(lineasolicitud);
        lineasolicitud.setOrdenproduccion1(null);
        return lineasolicitud;
    }
}
