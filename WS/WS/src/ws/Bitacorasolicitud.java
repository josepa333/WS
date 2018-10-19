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
@NamedQueries({ @NamedQuery(name = "Bitacorasolicitud.findAll", query = "select o from Bitacorasolicitud o") })
public class Bitacorasolicitud implements Serializable {
    private static final long serialVersionUID = 1404454876198633899L;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fchinsersion;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fchmaxima;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fchsolicitud;
    @Column(nullable = false)
    private Long idcliente;
    @Id
    @Column(nullable = false)
    private Long idsolicitud;
    @Column(nullable = false)
    private Integer idusuario;

    public Bitacorasolicitud() {
    }

    public Bitacorasolicitud(Date fchinsersion, Date fchmaxima, Date fchsolicitud, Long idcliente, Long idsolicitud,
                             Integer idusuario) {
        this.fchinsersion = fchinsersion;
        this.fchmaxima = fchmaxima;
        this.fchsolicitud = fchsolicitud;
        this.idcliente = idcliente;
        this.idsolicitud = idsolicitud;
        this.idusuario = idusuario;
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

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }

    public Long getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(Long idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
}
