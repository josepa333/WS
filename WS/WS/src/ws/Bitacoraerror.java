package ws;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Bitacoraerror.findAll", query = "select o from Bitacoraerror o") })
public class Bitacoraerror implements Serializable {
    private static final long serialVersionUID = -5211929842990043725L;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fcherror;
    @Column(nullable = false, length = 30)
    private String filaprocesada;
    @Id
    @Column(nullable = false)
    private BigDecimal iderror;
    @Column(nullable = false, length = 60)
    private String mensaje;

    public Bitacoraerror() {
    }

    public Bitacoraerror(Date fcherror, String filaprocesada, BigDecimal iderror, String mensaje) {
        this.fcherror = fcherror;
        this.filaprocesada = filaprocesada;
        this.iderror = iderror;
        this.mensaje = mensaje;
    }

    public Date getFcherror() {
        return fcherror;
    }

    public void setFcherror(Date fcherror) {
        this.fcherror = fcherror;
    }

    public String getFilaprocesada() {
        return filaprocesada;
    }

    public void setFilaprocesada(String filaprocesada) {
        this.filaprocesada = filaprocesada;
    }

    public BigDecimal getIderror() {
        return iderror;
    }

    public void setIderror(BigDecimal iderror) {
        this.iderror = iderror;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
