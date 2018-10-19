package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "UnidadmedidaView.findAll", query = "select o from UnidadmedidaView o") })
@Table(name = "UNIDADMEDIDA_VIEW")
public class UnidadmedidaView implements Serializable {
    private static final long serialVersionUID = -6430260287618995991L;
    private Integer idunidadmedida;
    @Column(length = 15)
    private String unidadmedida;

    public UnidadmedidaView() {
    }

    public UnidadmedidaView(Integer idunidadmedida, String unidadmedida) {
        this.idunidadmedida = idunidadmedida;
        this.unidadmedida = unidadmedida;
    }

    public Integer getIdunidadmedida() {
        return idunidadmedida;
    }

    public void setIdunidadmedida(Integer idunidadmedida) {
        this.idunidadmedida = idunidadmedida;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }
}
