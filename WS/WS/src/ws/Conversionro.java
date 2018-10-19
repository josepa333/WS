package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Conversionro.findAll", query = "select o from Conversionro o") })
@IdClass(ConversionroPK.class)
public class Conversionro implements Serializable {
    private static final long serialVersionUID = -5081902194793331105L;
    private Long cantidad;
    @Id
    @Column(nullable = false)
    private Integer idunidadmedida1;
    @Id
    @Column(nullable = false)
    private Integer idunidadmedida2;
    private Object unidadmedida1;
    private Object unidadmedida2;

    public Conversionro() {
    }

    public Conversionro(Long cantidad, Integer idunidadmedida1, Integer idunidadmedida2, Object unidadmedida1,
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
