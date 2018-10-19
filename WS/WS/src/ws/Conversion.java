package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Conversion.findAll", query = "select o from Conversion o") })
@IdClass(ConversionPK.class)
public class Conversion implements Serializable {
    private static final long serialVersionUID = -5179899602629292289L;
    @Column(nullable = false)
    private Long cantidad;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDUNIDADMEDIDA2")
    private Unidadmedida unidadmedida3;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDUNIDADMEDIDA1")
    private Unidadmedida unidadmedida4;

    public Conversion() {
    }

    public Conversion(Long cantidad, Unidadmedida unidadmedida4, Unidadmedida unidadmedida3) {
        this.cantidad = cantidad;
        this.unidadmedida4 = unidadmedida4;
        this.unidadmedida3 = unidadmedida3;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }


    public Unidadmedida getUnidadmedida3() {
        return unidadmedida3;
    }

    public void setUnidadmedida3(Unidadmedida unidadmedida3) {
        this.unidadmedida3 = unidadmedida3;
    }

    public Unidadmedida getUnidadmedida4() {
        return unidadmedida4;
    }

    public void setUnidadmedida4(Unidadmedida unidadmedida4) {
        this.unidadmedida4 = unidadmedida4;
    }
}
