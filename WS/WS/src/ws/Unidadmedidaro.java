package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Unidadmedidaro.findAll", query = "select o from Unidadmedidaro o") })
public class Unidadmedidaro implements Serializable {
    private static final long serialVersionUID = -1535041756990090245L;
    @Id
    @Column(nullable = false)
    private Integer idunidadmedida;
    @Column(length = 15)
    private String unidadmedida;

    public Unidadmedidaro() {
    }

    public Unidadmedidaro(Integer idunidadmedida, String unidadmedida) {
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
