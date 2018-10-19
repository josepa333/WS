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
@NamedQueries({ @NamedQuery(name = "Solicitudro.findAll", query = "select o from Solicitudro o") })
public class Solicitudro implements Serializable {
    private static final long serialVersionUID = -5900422681225399219L;
    private Object cliente;
    @Temporal(TemporalType.DATE)
    private Date fchmaxima;
    @Temporal(TemporalType.DATE)
    private Date fchsolicitud;
    @Id
    @Column(nullable = false)
    private Long idsolicitud;
    private Object lineassolicitud;

    public Solicitudro() {
    }

    public Solicitudro(Object cliente, Date fchmaxima, Date fchsolicitud, Long idsolicitud, Object lineassolicitud) {
        this.cliente = cliente;
        this.fchmaxima = fchmaxima;
        this.fchsolicitud = fchsolicitud;
        this.idsolicitud = idsolicitud;
        this.lineassolicitud = lineassolicitud;
    }

    public Object getCliente() {
        return cliente;
    }

    public void setCliente(Object cliente) {
        this.cliente = cliente;
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

    public Object getLineassolicitud() {
        return lineassolicitud;
    }

    public void setLineassolicitud(Object lineassolicitud) {
        this.lineassolicitud = lineassolicitud;
    }
}
