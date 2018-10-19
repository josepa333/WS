package ws;

import java.io.Serializable;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Solicitud.findAll", query = "select o from Solicitud o") })
public class Solicitud implements Serializable {
    private static final long serialVersionUID = -5216896115277372547L;
    @Temporal(TemporalType.DATE)
    private Date fchmaxima;
    @Temporal(TemporalType.DATE)
    private Date fchsolicitud;
    @Id
    @Column(nullable = false)
    private Long idsolicitud;
    @ManyToOne
    @JoinColumn(name = "IDCLIENTE")
    private Cliente cliente;
    @OneToMany(mappedBy = "bitacoralineasolicitud", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Lineasolicitud> bitacoralineasolicitudList1;

    public Solicitud() {
    }

    public Solicitud(Date fchmaxima, Date fchsolicitud, Cliente cliente, Long idsolicitud) {
        this.fchmaxima = fchmaxima;
        this.fchsolicitud = fchsolicitud;
        this.cliente = cliente;
        this.idsolicitud = idsolicitud;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Lineasolicitud> getBitacoralineasolicitudList1() {
        return bitacoralineasolicitudList1;
    }

    public void setBitacoralineasolicitudList1(List<Lineasolicitud> bitacoralineasolicitudList1) {
        this.bitacoralineasolicitudList1 = bitacoralineasolicitudList1;
    }

    public Lineasolicitud addLineasolicitud(Lineasolicitud lineasolicitud) {
        getBitacoralineasolicitudList1().add(lineasolicitud);
        lineasolicitud.setBitacoralineasolicitud(this);
        return lineasolicitud;
    }

    public Lineasolicitud removeLineasolicitud(Lineasolicitud lineasolicitud) {
        getBitacoralineasolicitudList1().remove(lineasolicitud);
        lineasolicitud.setBitacoralineasolicitud(null);
        return lineasolicitud;
    }
}
