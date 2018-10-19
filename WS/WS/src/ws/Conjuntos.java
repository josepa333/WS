package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Conjuntos.findAll", query = "select o from Conjuntos o") })
@IdClass(ConjuntosPK.class)
public class Conjuntos implements Serializable {
    private static final long serialVersionUID = 2800175009668139954L;
    @Id
    @Column(nullable = false)
    private Integer idconjunto;
    @Id
    @Column(nullable = false)
    private Integer idprenda;
    private Object prenda;

    public Conjuntos() {
    }

    public Conjuntos(Integer idconjunto, Integer idprenda, Object prenda) {
        this.idconjunto = idconjunto;
        this.idprenda = idprenda;
        this.prenda = prenda;
    }

    public Integer getIdconjunto() {
        return idconjunto;
    }

    public void setIdconjunto(Integer idconjunto) {
        this.idconjunto = idconjunto;
    }

    public Integer getIdprenda() {
        return idprenda;
    }

    public void setIdprenda(Integer idprenda) {
        this.idprenda = idprenda;
    }

    public Object getPrenda() {
        return prenda;
    }

    public void setPrenda(Object prenda) {
        this.prenda = prenda;
    }
}
