package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Tallaro.findAll", query = "select o from Tallaro o") })
public class Tallaro implements Serializable {
    private static final long serialVersionUID = -8253580287947737060L;
    @Id
    @Column(nullable = false)
    private Integer idtalla;
    @Column(length = 5)
    private String talla;

    public Tallaro() {
    }

    public Tallaro(Integer idtalla, String talla) {
        this.idtalla = idtalla;
        this.talla = talla;
    }

    public Integer getIdtalla() {
        return idtalla;
    }

    public void setIdtalla(Integer idtalla) {
        this.idtalla = idtalla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
