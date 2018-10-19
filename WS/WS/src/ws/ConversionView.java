package ws;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "ConversionView.findAll", query = "select o from ConversionView o") })
@Table(name = "CONVERSION_VIEW")
public class ConversionView implements Serializable {
    private static final long serialVersionUID = -2702001476656744742L;
    private Long cantidad;
    private Integer idunidadmedida1;
    private Integer idunidadmedida2;
    private Object unidadmedida1;
    private Object unidadmedida2;

    public ConversionView() {
    }

    public ConversionView(Long cantidad, Integer idunidadmedida1, Integer idunidadmedida2, Object unidadmedida1,
                          Object unidadmedida2) {
        this.cantidad = cantidad;
        this.idunidadmedida1 = idunidadmedida1;
        this.idunidadmedida2 = idunidadmedida2;
        this.unidadmedida1 = unidadmedida1;
        this.unidadmedida2 = unidadmedida2;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
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

    public Object getUnidadmedida1() {
        return unidadmedida1;
    }

    public void setUnidadmedida1(Object unidadmedida1) {
        this.unidadmedida1 = unidadmedida1;
    }

    public Object getUnidadmedida2() {
        return unidadmedida2;
    }

    public void setUnidadmedida2(Object unidadmedida2) {
        this.unidadmedida2 = unidadmedida2;
    }
}
