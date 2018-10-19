package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "PrendaView.findAll", query = "select o from PrendaView o") })
@Table(name = "PRENDA_VIEW")
public class PrendaView implements Serializable {
    private static final long serialVersionUID = 6487470055376711788L;
    private Integer costounitario;
    @Column(length = 120)
    private String descripcion;
    private Object estilo;
    private Integer idprenda;
    private byte[] imagen;
    private byte[] video;

    public PrendaView() {
    }

    public PrendaView(Integer costounitario, String descripcion, Object estilo, Integer idprenda) {
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

    public Object getEstilo() {
        return estilo;
    }

    public void setEstilo(Object estilo) {
        this.estilo = estilo;
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
}
