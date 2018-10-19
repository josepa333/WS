package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Prendaro.findAll", query = "select o from Prendaro o") })
public class Prendaro implements Serializable {
    private static final long serialVersionUID = -8490181861751780439L;
    private Integer costounitario;
    @Column(length = 120)
    private String descripcion;
    private Object estilo;
    @Id
    @Column(nullable = false)
    private Integer idprenda;
    private byte[] imagen;
    private byte[] video;

    public Prendaro() {
    }

    public Prendaro(Integer costounitario, String descripcion, Object estilo, Integer idprenda) {
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
