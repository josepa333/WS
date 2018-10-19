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
@NamedQueries({ @NamedQuery(name = "Lineaordencompra.findAll", query = "select o from Lineaordencompra o") })
@IdClass(LineaordencompraPK.class)
public class Lineaordencompra implements Serializable {
    private static final long serialVersionUID = 5528323085611618581L;
    @Column(nullable = false)
    private Long cantidadfaltantetotal;
    @Column(nullable = false)
    private Integer costounitario;
    @ManyToOne
    @JoinColumn(name = "IDUNIDADMEDIDA")
    private Unidadmedida unidadmedida;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDMATERIAPRIMA")
    private Catalogosys catalogosys1;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDORDENCOMPRA")
    private Ordencompra lineaordencompra;

    public Lineaordencompra() {
    }

    public Lineaordencompra(Long cantidadfaltantetotal, Integer costounitario, Catalogosys catalogosys1,
                            Ordencompra lineaordencompra, Unidadmedida unidadmedida) {
        this.cantidadfaltantetotal = cantidadfaltantetotal;
        this.costounitario = costounitario;
        this.catalogosys1 = catalogosys1;
        this.lineaordencompra = lineaordencompra;
        this.unidadmedida = unidadmedida;
    }

    public Long getCantidadfaltantetotal() {
        return cantidadfaltantetotal;
    }

    public void setCantidadfaltantetotal(Long cantidadfaltantetotal) {
        this.cantidadfaltantetotal = cantidadfaltantetotal;
    }

    public Integer getCostounitario() {
        return costounitario;
    }

    public void setCostounitario(Integer costounitario) {
        this.costounitario = costounitario;
    }


    public Unidadmedida getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(Unidadmedida unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public Catalogosys getCatalogosys1() {
        return catalogosys1;
    }

    public void setCatalogosys1(Catalogosys catalogosys1) {
        this.catalogosys1 = catalogosys1;
    }

    public Ordencompra getLineaordencompra() {
        return lineaordencompra;
    }

    public void setLineaordencompra(Ordencompra lineaordencompra) {
        this.lineaordencompra = lineaordencompra;
    }
}
