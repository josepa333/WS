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
@NamedQueries({ @NamedQuery(name = "Faltantes.findAll", query = "select o from Faltantes o") })
@IdClass(FaltantesPK.class)
public class Faltantes implements Serializable {
    private static final long serialVersionUID = -6581121317430409164L;
    @Column(nullable = false)
    private Long cantidadfaltante;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDORDENPRODUCCION")
    private Ordenproduccion ordenproduccion;
    @ManyToOne
    @JoinColumn(name = "IDUNIDADMEDIDA")
    private Unidadmedida unidadmedida2;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDMATERIAPRIMA")
    private Catalogosys catalogosys3;
    @ManyToOne
    @JoinColumn(name = "IDORDENCOMPRA")
    private Ordencompra lineaordencompra1;

    public Faltantes() {
    }

    public Faltantes(Long cantidadfaltante, Catalogosys catalogosys3, Ordencompra lineaordencompra1,
                     Ordenproduccion ordenproduccion, Unidadmedida unidadmedida2) {
        this.cantidadfaltante = cantidadfaltante;
        this.catalogosys3 = catalogosys3;
        this.lineaordencompra1 = lineaordencompra1;
        this.ordenproduccion = ordenproduccion;
        this.unidadmedida2 = unidadmedida2;
    }

    public Long getCantidadfaltante() {
        return cantidadfaltante;
    }

    public void setCantidadfaltante(Long cantidadfaltante) {
        this.cantidadfaltante = cantidadfaltante;
    }


    public Ordenproduccion getOrdenproduccion() {
        return ordenproduccion;
    }

    public void setOrdenproduccion(Ordenproduccion ordenproduccion) {
        this.ordenproduccion = ordenproduccion;
    }

    public Unidadmedida getUnidadmedida2() {
        return unidadmedida2;
    }

    public void setUnidadmedida2(Unidadmedida unidadmedida2) {
        this.unidadmedida2 = unidadmedida2;
    }

    public Catalogosys getCatalogosys3() {
        return catalogosys3;
    }

    public void setCatalogosys3(Catalogosys catalogosys3) {
        this.catalogosys3 = catalogosys3;
    }

    public Ordencompra getLineaordencompra1() {
        return lineaordencompra1;
    }

    public void setLineaordencompra1(Ordencompra lineaordencompra1) {
        this.lineaordencompra1 = lineaordencompra1;
    }
}
