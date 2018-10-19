package ws;

import java.io.Serializable;

public class ConversionPK implements Serializable {
    private Integer unidadmedida3;
    private Integer unidadmedida4;

    public ConversionPK() {
    }

    public ConversionPK(Integer unidadmedida3, Integer unidadmedida4) {
        this.unidadmedida3 = unidadmedida3;
        this.unidadmedida4 = unidadmedida4;
    }

    public boolean equals(Object other) {
        if (other instanceof ConversionPK) {
            final ConversionPK otherConversionPK = (ConversionPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Integer getUnidadmedida3() {
        return unidadmedida3;
    }

    public void setUnidadmedida3(Integer unidadmedida3) {
        this.unidadmedida3 = unidadmedida3;
    }

    public Integer getUnidadmedida4() {
        return unidadmedida4;
    }

    public void setUnidadmedida4(Integer unidadmedida4) {
        this.unidadmedida4 = unidadmedida4;
    }
}
