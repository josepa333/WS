package ws;

import java.io.Serializable;

public class RecetaroPK implements Serializable {
    private Integer idmateriaprima;
    private Integer idprenda;
    private Integer idtalla;

    public RecetaroPK() {
    }

    public RecetaroPK(Integer idmateriaprima, Integer idprenda, Integer idtalla) {
        this.idmateriaprima = idmateriaprima;
        this.idprenda = idprenda;
        this.idtalla = idtalla;
    }

    public boolean equals(Object other) {
        if (other instanceof RecetaroPK) {
            final RecetaroPK otherRecetaroPK = (RecetaroPK) other;
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

    public Integer getIdprenda() {
        return idprenda;
    }

    public void setIdprenda(Integer idprenda) {
        this.idprenda = idprenda;
    }

    public Integer getIdtalla() {
        return idtalla;
    }

    public void setIdtalla(Integer idtalla) {
        this.idtalla = idtalla;
    }
}
