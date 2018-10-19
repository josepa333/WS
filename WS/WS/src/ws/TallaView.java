package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "TallaView.findAll", query = "select o from TallaView o") })
@Table(name = "TALLA_VIEW")
public class TallaView implements Serializable {
    private static final long serialVersionUID = 3215740298798648631L;
    private Integer idtalla;
    @Column(length = 5)
    private String talla;

    public TallaView() {
    }

    public TallaView(Integer idtalla, String talla) {
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
