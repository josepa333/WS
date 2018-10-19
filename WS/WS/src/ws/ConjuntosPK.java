package ws;

import java.io.Serializable;

public class ConjuntosPK implements Serializable {
    private Integer idconjunto;
    private Integer idprenda;

    public ConjuntosPK() {
    }

    public ConjuntosPK(Integer idconjunto, Integer idprenda) {
        this.idconjunto = idconjunto;
        this.idprenda = idprenda;
    }

    public boolean equals(Object other) {
        if (other instanceof ConjuntosPK) {
            final ConjuntosPK otherConjuntosPK = (ConjuntosPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
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
}
