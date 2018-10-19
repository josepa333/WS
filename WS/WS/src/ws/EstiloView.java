package ws;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "EstiloView.findAll", query = "select o from EstiloView o") })
@Table(name = "ESTILO_VIEW")
public class EstiloView implements Serializable {
    private static final long serialVersionUID = -3591962429267381203L;
    @Column(length = 15)
    private String color;
    @Column(length = 60)
    private String descripcion;
    private Integer idestilo;

    public EstiloView() {
    }

    public EstiloView(String color, String descripcion, Integer idestilo) {
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
}
