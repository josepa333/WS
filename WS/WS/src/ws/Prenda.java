package ws;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "Prenda.findAll", query = "select o from Prenda o") })
public class Prenda implements Serializable {
    private static final long serialVersionUID = -2834305304958929680L;
    @Column(nullable = false)
    private Integer costounitario;
    @Column(nullable = false, length = 120)
    private String descripcion;
    @Id
    @Column(nullable = false)
    private Integer idprenda;
    private byte[] imagen;
    private byte[] video;
    @ManyToOne
    @JoinColumn(name = "IDESTILO")
    private Estilo estilo;
    @OneToMany(mappedBy = "prenda", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Receta> recetaList2;
    @OneToMany(mappedBy = "prenda1", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Lineasolicitud> bitacoralineasolicitudList3;

    public Prenda() {
    }

    public Prenda(Integer costounitario, String descripcion, Estilo estilo, Integer idprenda) {
        this.costounitario = costounitario;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.idprenda = idprenda;
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


    public Integer getIdprenda() {
        return idprenda;
    }

    public void setIdprenda(Integer idprenda) {
        this.idprenda = idprenda;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public List<Receta> getRecetaList2() {
        return recetaList2;
    }

    public void setRecetaList2(List<Receta> recetaList2) {
        this.recetaList2 = recetaList2;
    }

    public Receta addReceta(Receta receta) {
        getRecetaList2().add(receta);
        receta.setPrenda(this);
        return receta;
    }

    public Receta removeReceta(Receta receta) {
        getRecetaList2().remove(receta);
        receta.setPrenda(null);
        return receta;
    }

    public List<Lineasolicitud> getBitacoralineasolicitudList3() {
        return bitacoralineasolicitudList3;
    }

    public void setBitacoralineasolicitudList3(List<Lineasolicitud> bitacoralineasolicitudList3) {
        this.bitacoralineasolicitudList3 = bitacoralineasolicitudList3;
    }

    public Lineasolicitud addLineasolicitud(Lineasolicitud lineasolicitud) {
        getBitacoralineasolicitudList3().add(lineasolicitud);
        lineasolicitud.setPrenda1(this);
        return lineasolicitud;
    }

    public Lineasolicitud removeLineasolicitud(Lineasolicitud lineasolicitud) {
        getBitacoralineasolicitudList3().remove(lineasolicitud);
        lineasolicitud.setPrenda1(null);
        return lineasolicitud;
    }
}
