package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "MateriaprimasysView.findAll", query = "select o from MateriaprimasysView o") })
@Table(name = "MATERIAPRIMASYS_VIEW")
public class MateriaprimasysView implements Serializable {
    private static final long serialVersionUID = 7293800259370163858L;
    private Integer cantidadminima;
    private Integer costounitario;
    @Column(length = 50)
    private String descripcion;
    private Long existenciaactual;
    private Integer idmateriaprima;
    private Object materiaprimaproveedores;
    private Object unidadmedida;

    public MateriaprimasysView() {
    }

    public MateriaprimasysView(Integer cantidadminima, Integer costounitario, String descripcion, Long existenciaactual,
                               Integer idmateriaprima, Object materiaprimaproveedores, Object unidadmedida) {
        this.cantidadminima = cantidadminima;
        this.costounitario = costounitario;
        this.descripcion = descripcion;
        this.existenciaactual = existenciaactual;
        this.idmateriaprima = idmateriaprima;
        this.materiaprimaproveedores = materiaprimaproveedores;
        this.unidadmedida = unidadmedida;
    }

    public Integer getCantidadminima() {
        return cantidadminima;
    }

    public void setCantidadminima(Integer cantidadminima) {
        this.cantidadminima = cantidadminima;
    }

    public Integer getCostounitario() {
        return costounitario;
    }

    public void setCostounitario(Integer costounitario) {
        this.costounitario = costounitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getExistenciaactual() {
        return existenciaactual;
    }

    public void setExistenciaactual(Long existenciaactual) {
        this.existenciaactual = existenciaactual;
    }

    public Integer getIdmateriaprima() {
        return idmateriaprima;
    }

    public void setIdmateriaprima(Integer idmateriaprima) {
        this.idmateriaprima = idmateriaprima;
    }

    public Object getMateriaprimaproveedores() {
        return materiaprimaproveedores;
    }

    public void setMateriaprimaproveedores(Object materiaprimaproveedores) {
        this.materiaprimaproveedores = materiaprimaproveedores;
    }

    public Object getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(Object unidadmedida) {
        this.unidadmedida = unidadmedida;
    }
}
