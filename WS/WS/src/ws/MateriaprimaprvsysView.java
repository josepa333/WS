package ws;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "MateriaprimaprvsysView.findAll",
                            query = "select o from MateriaprimaprvsysView o") })
@Table(name = "MATERIAPRIMAPRVSYS_VIEW")
public class MateriaprimaprvsysView implements Serializable {
    private static final long serialVersionUID = 1101659325931828596L;
    private Integer idmateriaprimaprv;
    private Integer idmateriaprimasys;
    private Integer idproveedor;
    private Object materiaprimaprv;
    private Object materiaprimasys;

    public MateriaprimaprvsysView() {
    }

    public MateriaprimaprvsysView(Integer idmateriaprimaprv, Integer idmateriaprimasys, Integer idproveedor,
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
