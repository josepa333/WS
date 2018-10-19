package ws;

import java.io.Serializable;

public class ConversionroPK implements Serializable {
    private Integer idunidadmedida1;
    private Integer idunidadmedida2;

    public ConversionroPK() {
    }

    public ConversionroPK(Integer idunidadmedida1, Integer idunidadmedida2) {
        this.idunidadmedida1 = idunidadmedida1;
        this.idunidadmedida2 = idunidadmedida2;
    }

    public boolean equals(Object other) {
        if (other instanceof ConversionroPK) {
            final ConversionroPK otherConversionroPK = (ConversionroPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Integer getIdunidadmedida1() {
        return idunidadmedida1;
    }

    public void setIdunidadmedida1(Integer idunidadmedida1) {
        this.idunidadmedida1 = idunidadmedida1;
    }

    public Integer getIdunidadmedida2() {
        return idunidadmedida2;
    }

    public void setIdunidadmedida2(Integer idunidadmedida2) {
        this.idunidadmedida2 = idunidadmedida2;
    }
}
