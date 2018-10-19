package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Catalogoprvsysro.findAll", query = "select o from Catalogoprvsysro o") })
@IdClass(CatalogoprvsysroPK.class)
public class Catalogoprvsysro implements Serializable {
    private static final long serialVersionUID = -9222352442033020377L;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprimaprv;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprimasys;
    @Id
    @Column(nullable = false)
    private Integer idproveedor;
    private Object materiaprimaprv;
    private Object materiaprimasys;

    public Catalogoprvsysro() {
    }

    public Catalogoprvsysro(Integer idmateriaprimaprv, Integer idmateriaprimasys, Integer idproveedor,
                            Object materiaprimaprv, Object materiaprimasys) {
        this.idmateriaprimaprv = idmateriaprimaprv;
        this.idmateriaprimasys = idmateriaprimasys;
        this.idproveedor = idproveedor;
        this.materiaprimaprv = materiaprimaprv;
        this.materiaprimasys = materiaprimasys;
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

    public Object getMateriaprimaprv() {
        return materiaprimaprv;
    }

    public void setMateriaprimaprv(Object materiaprimaprv) {
        this.materiaprimaprv = materiaprimaprv;
    }

    public Object getMateriaprimasys() {
        return materiaprimasys;
    }

    public void setMateriaprimasys(Object materiaprimasys) {
        this.materiaprimasys = materiaprimasys;
    }
}
