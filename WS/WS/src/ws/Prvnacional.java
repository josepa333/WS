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
@NamedQueries({ @NamedQuery(name = "Prvnacional.findAll", query = "select o from Prvnacional o") })
public class Prvnacional implements Serializable {
    private static final long serialVersionUID = 8778967016182845810L;
    @Column(nullable = false, length = 15)
    private String cedula;
    @Id
    @Column(nullable = false)
    private Integer idproveedor;
    @Column(nullable = false)
    private Integer maximodiascredito;
    @OneToOne
    @JoinColumn(name = "IDPROVEEDOR")
    private Proveedor proveedor1;

    public Prvnacional() {
    }

    public Prvnacional(String cedula, Proveedor proveedor1, Integer maximodiascredito) {
        this.cedula = cedula;
        this.proveedor1 = proveedor1;
        this.maximodiascredito = maximodiascredito;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Integer getMaximodiascredito() {
        return maximodiascredito;
    }

    public void setMaximodiascredito(Integer maximodiascredito) {
        this.maximodiascredito = maximodiascredito;
    }

    public Proveedor getProveedor1() {
        return proveedor1;
    }

    public void setProveedor1(Proveedor proveedor1) {
        this.proveedor1 = proveedor1;
        if (proveedor1 != null) {
            this.idproveedor = proveedor1.getIdproveedor();
        }
    }
}
