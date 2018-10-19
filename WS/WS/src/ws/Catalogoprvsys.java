package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Catalogoprvsys.findAll", query = "select o from Catalogoprvsys o") })
@IdClass(CatalogoprvsysPK.class)
public class Catalogoprvsys implements Serializable {
    private static final long serialVersionUID = 5484174389045640992L;
    @ManyToOne
    @JoinColumns({ @JoinColumn(name = "IDMATERIAPRIMAPRV", referencedColumnName = "IDMATERIAPRIMAPRV"),
                   @JoinColumn(name = "IDPROVEEDOR", referencedColumnName = "IDPROVEEDOR")
        })
    private Catalogoprv catalogoprv1;
    @ManyToOne
    @Id
    @JoinColumn(name = "IDMATERIAPRIMASYS")
    private Catalogosys catalogosys2;

    public Catalogoprvsys() {
    }

    public Catalogoprvsys(Catalogoprv catalogoprv1, Catalogosys catalogosys2) {
        this.catalogoprv1 = catalogoprv1;
        this.catalogosys2 = catalogosys2;
    }


    public Catalogoprv getCatalogoprv1() {
        return catalogoprv1;
    }

    public void setCatalogoprv1(Catalogoprv catalogoprv1) {
        this.catalogoprv1 = catalogoprv1;
    }

    public Catalogosys getCatalogosys2() {
        return catalogosys2;
    }

    public void setCatalogosys2(Catalogosys catalogosys2) {
        this.catalogosys2 = catalogosys2;
    }
}
