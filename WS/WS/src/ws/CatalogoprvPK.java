package ws;

import java.io.Serializable;

public class CatalogoprvPK implements Serializable {
    private Integer idmateriaprimaprv;
    private Integer proveedor;

    public CatalogoprvPK() {
    }

    public CatalogoprvPK(Integer idmateriaprimaprv, Integer proveedor) {
        this.idmateriaprimaprv = idmateriaprimaprv;
        this.proveedor = proveedor;
    }

    public boolean equals(Object other) {
        if (other instanceof CatalogoprvPK) {
            final CatalogoprvPK otherCatalogoprvPK = (CatalogoprvPK) other;
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

    public Integer getProveedor() {
        return proveedor;
    }

    public void setProveedor(Integer proveedor) {
        this.proveedor = proveedor;
    }
}
