package ws;

import java.io.Serializable;

public class LineaordencompraPK implements Serializable {
    private Integer catalogosys1;
    private Integer lineaordencompra;

    public LineaordencompraPK() {
    }

    public LineaordencompraPK(Integer catalogosys1, Integer lineaordencompra) {
        this.catalogosys1 = catalogosys1;
        this.lineaordencompra = lineaordencompra;
    }

    public boolean equals(Object other) {
        if (other instanceof LineaordencompraPK) {
            final LineaordencompraPK otherLineaordencompraPK = (LineaordencompraPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Integer getCatalogosys1() {
        return catalogosys1;
    }

    public void setCatalogosys1(Integer catalogosys1) {
        this.catalogosys1 = catalogosys1;
    }

    public Integer getLineaordencompra() {
        return lineaordencompra;
    }

    public void setLineaordencompra(Integer lineaordencompra) {
        this.lineaordencompra = lineaordencompra;
    }
}
