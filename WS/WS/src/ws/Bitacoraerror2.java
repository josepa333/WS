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
@NamedQueries({ @NamedQuery(name = "Bitacoraerror2.findAll", query = "select o from Bitacoraerror2 o") })
public class Bitacoraerror2 implements Serializable {
    private static final long serialVersionUID = 3646912888409849595L;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fcherror;
    private Integer filaprocesada;
    private Integer filaprocesadaaux;
    @Id
    @Column(nullable = false)
    private Integer iderror;
    @Column(nullable = false, length = 60)
    private String mensaje;

    public Bitacoraerror2() {
    }

    public Bitacoraerror2(Date fcherror, Integer filaprocesada, Integer filaprocesadaaux, Integer iderror,
                          String mensaje) {
        this.fcherror = fcherror;
        this.filaprocesada = filaprocesada;
        this.filaprocesadaaux = filaprocesadaaux;
        this.iderror = iderror;
        this.mensaje = mensaje;
    }

    public Date getFcherror() {
        return fcherror;
    }

    public void setFcherror(Date fcherror) {
        this.fcherror = fcherror;
    }

    public Integer getFilaprocesada() {
        return filaprocesada;
    }

    public void setFilaprocesada(Integer filaprocesada) {
        this.filaprocesada = filaprocesada;
    }

    public Integer getFilaprocesadaaux() {
        return filaprocesadaaux;
    }

    public void setFilaprocesadaaux(Integer filaprocesadaaux) {
        this.filaprocesadaaux = filaprocesadaaux;
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
