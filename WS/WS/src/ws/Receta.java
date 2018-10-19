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
@NamedQueries({ @NamedQuery(name = "Receta.findAll", query = "select o from Receta o") })
@IdClass(RecetaPK.class)
public class Receta implements Serializable {
    private static final long serialVersionUID = 1089331900018857240L;
    @Column(nullable = false)
    private Long cantidad;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDMATERIAPRIMA")
    private Catalogosys catalogosys;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDTALLA")
    private Talla talla1;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDPRENDA")
    private Prenda prenda;
    @ManyToOne
    @JoinColumn(name = "IDUNIDADMEDIDA")
    private Unidadmedida unidadmedida5;

    public Receta() {
    }

    public Receta(Long cantidad, Catalogosys catalogosys, Prenda prenda, Talla talla1, Unidadmedida unidadmedida5) {
        this.cantidad = cantidad;
        this.catalogosys = catalogosys;
        this.prenda = prenda;
        this.talla1 = talla1;
        this.unidadmedida5 = unidadmedida5;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }


    public Catalogosys getCatalogosys() {
        return catalogosys;
    }

    public void setCatalogosys(Catalogosys catalogosys) {
        this.catalogosys = catalogosys;
    }

    public Talla getTalla1() {
        return talla1;
    }

    public void setTalla1(Talla talla1) {
        this.talla1 = talla1;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Unidadmedida getUnidadmedida5() {
        return unidadmedida5;
    }

    public void setUnidadmedida5(Unidadmedida unidadmedida5) {
        this.unidadmedida5 = unidadmedida5;
    }
}
