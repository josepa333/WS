package ws;

import java.io.Serializable;

public class FaltantesPK implements Serializable {
    private Long ordenproduccion;
    private Integer catalogosys3;

    public FaltantesPK() {
    }

    public FaltantesPK(Long ordenproduccion, Integer catalogosys3) {
        this.ordenproduccion = ordenproduccion;
        this.catalogosys3 = catalogosys3;
    }

    public boolean equals(Object other) {
        if (other instanceof FaltantesPK) {
            final FaltantesPK otherFaltantesPK = (FaltantesPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Long getOrdenproduccion() {
        return ordenproduccion;
    }

    public void setOrdenproduccion(Long ordenproduccion) {
        this.ordenproduccion = ordenproduccion;
    }

    public Integer getCatalogosys3() {
        return catalogosys3;
    }

    public void setCatalogosys3(Integer catalogosys3) {
        this.catalogosys3 = catalogosys3;
    }
}
