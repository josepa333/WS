package ws;

import java.io.Serializable;

public class CatalogoprvroPK implements Serializable {
    private Integer idmateriaprimaprv;
    private Integer idproveedor;

    public CatalogoprvroPK() {
    }

    public CatalogoprvroPK(Integer idmateriaprimaprv, Integer idproveedor) {
        this.idmateriaprimaprv = idmateriaprimaprv;
        this.idproveedor = idproveedor;
    }

    public boolean equals(Object other) {
        if (other instanceof CatalogoprvroPK) {
            final CatalogoprvroPK otherCatalogoprvroPK = (CatalogoprvroPK) other;
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

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }
}
