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
@NamedQueries({ @NamedQuery(name = "Bitacoraerrorro.findAll", query = "select o from Bitacoraerrorro o") })
public class Bitacoraerrorro implements Serializable {
    private static final long serialVersionUID = -6739615953166860322L;
    @Temporal(TemporalType.DATE)
    private Date fcherror;
    @Column(length = 30)
    private String filaprocesada;
    @Id
    @Column(nullable = false)
    private Integer iderror;
    @Column(length = 60)
    private String mensaje;

    public Bitacoraerrorro() {
    }

    public Bitacoraerrorro(Date fcherror, String filaprocesada, Integer iderror, String mensaje) {
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

    public Integer getIderror() {
        return iderror;
    }

    public void setIderror(Integer iderror) {
        this.iderror = iderror;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
