package ws;

import java.io.Serializable;

public class LineaordencompraroPK implements Serializable {
    private Integer idmateriaprima;
    private Integer idordencompra;

    public LineaordencompraroPK() {
    }

    public LineaordencompraroPK(Integer idmateriaprima, Integer idordencompra) {
        this.idmateriaprima = idmateriaprima;
        this.idordencompra = idordencompra;
    }

    public boolean equals(Object other) {
        if (other instanceof LineaordencompraroPK) {
            final LineaordencompraroPK otherLineaordencompraroPK = (LineaordencompraroPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Integer getIdmateriaprima() {
        return idmateriaprima;
    }

    public void setIdmateriaprima(Integer idmateriaprima) {
        this.idmateriaprima = idmateriaprima;
    }

    public Integer getIdordencompra() {
        return idordencompra;
    }

    public void setIdordencompra(Integer idordencompra) {
        this.idordencompra = idordencompra;
    }
}
