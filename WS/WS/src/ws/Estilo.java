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
@NamedQueries({ @NamedQuery(name = "Estilo.findAll", query = "select o from Estilo o") })
public class Estilo implements Serializable {
    private static final long serialVersionUID = -2743263398776802334L;
    @Column(nullable = false, unique = true, length = 15)
    private String color;
    @Column(nullable = false, unique = true, length = 60)
    private String descripcion;
    @Id
    @Column(nullable = false)
    private Integer idestilo;
    @OneToMany(mappedBy = "estilo", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Prenda> prendaList;

    public Estilo() {
    }

    public Estilo(String color, String descripcion, Integer idestilo) {
        this.color = color;
        this.descripcion = descripcion;
        this.idestilo = idestilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdestilo() {
        return idestilo;
    }

    public void setIdestilo(Integer idestilo) {
        this.idestilo = idestilo;
    }

    public List<Prenda> getPrendaList() {
        return prendaList;
    }

    public void setPrendaList(List<Prenda> prendaList) {
        this.prendaList = prendaList;
    }

    public Prenda addPrenda(Prenda prenda) {
        getPrendaList().add(prenda);
        prenda.setEstilo(this);
        return prenda;
    }

    public Prenda removePrenda(Prenda prenda) {
        getPrendaList().remove(prenda);
        prenda.setEstilo(null);
        return prenda;
    }
}
