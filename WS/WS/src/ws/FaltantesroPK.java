package ws;

import java.io.Serializable;

public class FaltantesroPK implements Serializable {
    private Integer idmateriaprima;
    private Long idordenproduccion;

    public FaltantesroPK() {
    }

    public FaltantesroPK(Integer idmateriaprima, Long idordenproduccion) {
        this.idmateriaprima = idmateriaprima;
        this.idordenproduccion = idordenproduccion;
    }

    public boolean equals(Object other) {
        if (other instanceof FaltantesroPK) {
            final FaltantesroPK otherFaltantesroPK = (FaltantesroPK) other;
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

    public Long getIdordenproduccion() {
        return idordenproduccion;
    }

    public void setIdordenproduccion(Long idordenproduccion) {
        this.idordenproduccion = idordenproduccion;
    }
}
