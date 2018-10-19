package ws;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "Talla.findAll", query = "select o from Talla o") })
public class Talla implements Serializable {
    private static final long serialVersionUID = 2544792564484572207L;
    @Id
    @Column(nullable = false)
    private Integer idtalla;
    @Column(nullable = false, unique = true, length = 5)
    private String talla;
    @OneToMany(mappedBy = "talla", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Lineasolicitud> bitacoralineasolicitudList;
    @OneToMany(mappedBy = "talla1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Receta> recetaList1;

    public Talla() {
    }

    public Talla(Integer idtalla, String talla) {
        this.idtalla = idtalla;
        this.talla = talla;
    }

    public Integer getIdtalla() {
        return idtalla;
    }

    public void setIdtalla(Integer idtalla) {
        this.idtalla = idtalla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public List<Lineasolicitud> getBitacoralineasolicitudList() {
        return bitacoralineasolicitudList;
    }

    public void setBitacoralineasolicitudList(List<Lineasolicitud> bitacoralineasolicitudList) {
        this.bitacoralineasolicitudList = bitacoralineasolicitudList;
    }

    public Lineasolicitud addLineasolicitud(Lineasolicitud lineasolicitud) {
        getBitacoralineasolicitudList().add(lineasolicitud);
        lineasolicitud.setTalla(this);
        return lineasolicitud;
    }

    public Lineasolicitud removeLineasolicitud(Lineasolicitud lineasolicitud) {
        getBitacoralineasolicitudList().remove(lineasolicitud);
        lineasolicitud.setTalla(null);
        return lineasolicitud;
    }

    public List<Receta> getRecetaList1() {
        return recetaList1;
    }

    public void setRecetaList1(List<Receta> recetaList1) {
        this.recetaList1 = recetaList1;
    }

    public Receta addReceta(Receta receta) {
        getRecetaList1().add(receta);
        receta.setTalla1(this);
        return receta;
    }

    public Receta removeReceta(Receta receta) {
        getRecetaList1().remove(receta);
        receta.setTalla1(null);
        return receta;
    }
}
