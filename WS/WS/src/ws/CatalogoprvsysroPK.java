package ws;

import java.io.Serializable;

public class CatalogoprvsysroPK implements Serializable {
    private Integer idmateriaprimaprv;
    private Integer idmateriaprimasys;
    private Integer idproveedor;

    public CatalogoprvsysroPK() {
    }

    public CatalogoprvsysroPK(Integer idmateriaprimaprv, Integer idmateriaprimasys, Integer idproveedor) {
        this.idmateriaprimaprv = idmateriaprimaprv;
        this.idmateriaprimasys = idmateriaprimasys;
        this.idproveedor = idproveedor;
    }

    public boolean equals(Object other) {
        if (other instanceof CatalogoprvsysroPK) {
            final CatalogoprvsysroPK otherCatalogoprvsysroPK = (CatalogoprvsysroPK) other;
            final boolean areEqual = true;
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Integer getIdmateriaprimaprv() {
        return idmateriaprimaprv;
    }

    public void setIdmateriaprimaprv(Integer idmateriaprimaprv) {
        this.idmateriaprimaprv = idmateriaprimaprv;
    }

    public Integer getIdmateriaprimasys() {
        return idmateriaprimasys;
    }

    public void setIdmateriaprimasys(Integer idmateriaprimasys) {
        this.idmateriaprimasys = idmateriaprimasys;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }
}
