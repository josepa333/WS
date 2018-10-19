package ws;

import java.io.Serializable;

public class CatalogoprvsysPK implements Serializable {
    private Integer catalogosys2;

    public CatalogoprvsysPK() {
    }

    public CatalogoprvsysPK(Integer catalogosys2) {
        this.catalogosys2 = catalogosys2;
    }

    public boolean equals(Object other) {
        if (other instanceof CatalogoprvsysPK) {
            final CatalogoprvsysPK otherCatalogoprvsysPK = (CatalogoprvsysPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Integer getCatalogosys2() {
        return catalogosys2;
    }

    public void setCatalogosys2(Integer catalogosys2) {
        this.catalogosys2 = catalogosys2;
    }
}
