package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({ @NamedQuery(name = "Prvextranjero.findAll", query = "select o from Prvextranjero o") })
public class Prvextranjero implements Serializable {
    private static final long serialVersionUID = -4919666236316867033L;
    @Id
    @Column(nullable = false)
    private Integer idproveedor;
    @OneToOne
    @JoinColumn(name = "IDPROVEEDOR")
    private Proveedor proveedor3;

    public Prvextranjero() {
    }

    public Prvextranjero(Proveedor proveedor3) {
        this.proveedor3 = proveedor3;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Proveedor getProveedor3() {
        return proveedor3;
    }

    public void setProveedor3(Proveedor proveedor3) {
        this.proveedor3 = proveedor3;
        if (proveedor3 != null) {
            this.idproveedor = proveedor3.getIdproveedor();
        }
    }
}
