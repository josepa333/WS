package ws;

import java.io.Serializable;

public class RecetaPK implements Serializable {
    private Integer catalogosys;
    private Integer talla1;
    private Integer prenda;

    public RecetaPK() {
    }

    public RecetaPK(Integer catalogosys, Integer talla1, Integer prenda) {
        this.catalogosys = catalogosys;
        this.talla1 = talla1;
        this.prenda = prenda;
    }

    public boolean equals(Object other) {
        if (other instanceof RecetaPK) {
            final RecetaPK otherRecetaPK = (RecetaPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Integer getCatalogosys() {
        return catalogosys;
    }

    public void setCatalogosys(Integer catalogosys) {
        this.catalogosys = catalogosys;
    }

    public Integer getTalla1() {
        return talla1;
    }

    public void setTalla1(Integer talla1) {
        this.talla1 = talla1;
    }

    public Integer getPrenda() {
        return prenda;
    }

    public void setPrenda(Integer prenda) {
        this.prenda = prenda;
    }
}
