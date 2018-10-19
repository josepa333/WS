package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Catalogosysro.findAll", query = "select o from Catalogosysro o") })
public class Catalogosysro implements Serializable {
    private static final long serialVersionUID = 3666784522654184154L;
    private Integer cantidadminima;
    private Integer costounitario;
    @Column(length = 50)
    private String descripcion;
    private Long existenciaactual;
    @Id
    @Column(nullable = false)
    private Integer idmateriaprima;
    private Object materiaprimaproveedores;
    private Object unidadmedida;

    public Catalogosysro() {
    }

    public Catalogosysro(Integer cantidadminima, Integer costounitario, String descripcion, Long existenciaactual,
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
