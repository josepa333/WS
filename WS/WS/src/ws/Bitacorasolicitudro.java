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
@NamedQueries({ @NamedQuery(name = "Bitacorasolicitudro.findAll", query = "select o from Bitacorasolicitudro o") })
public class Bitacorasolicitudro implements Serializable {
    private static final long serialVersionUID = -4892493556768912596L;
    private Object cliente;
    @Temporal(TemporalType.DATE)
    private Date fchinsersion;
    @Temporal(TemporalType.DATE)
    private Date fchmaxima;
    @Temporal(TemporalType.DATE)
    private Date fchsolicitud;
    @Id
    @Column(nullable = false)
    private Long idsolicitud;
    private Object usuario;

    public Bitacorasolicitudro() {
    }

    public Bitacorasolicitudro(Object cliente, Date fchinsersion, Date fchmaxima, Date fchsolicitud, Long idsolicitud,
                               Object usuario) {
        this.cliente = cliente;
        this.fchinsersion = fchinsersion;
        this.fchmaxima = fchmaxima;
        this.fchsolicitud = fchsolicitud;
        this.idsolicitud = idsolicitud;
        this.usuario = usuario;
    }

    public Object getCliente() {
        return cliente;
    }

    public void setCliente(Object cliente) {
        this.cliente = cliente;
    }

    public Date getFchinsersion() {
        return fchinsersion;
    }

    public void setFchinsersion(Date fchinsersion) {
        this.fchinsersion = fchinsersion;
    }

    public Date getFchmaxima() {
        return fchmaxima;
    }

    public void setFchmaxima(Date fchmaxima) {
        this.fchmaxima = fchmaxima;
    }

    public Date getFchsolicitud() {
        return fchsolicitud;
    }

    public void setFchsolicitud(Date fchsolicitud) {
        this.fchsolicitud = fchsolicitud;
    }

    public Long getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(Long idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Object getUsuario() {
        return usuario;
    }

    public void setUsuario(Object usuario) {
        this.usuario = usuario;
    }
}
