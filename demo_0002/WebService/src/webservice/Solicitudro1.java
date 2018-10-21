package webservice;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.sql.Ref;
import oracle.sql.ARRAY;

import weblogic.jdbc.wrapper.Array;

@Entity
@NamedQueries({ @NamedQuery(name = "Solicitudro1.findAll", query = "select o from Solicitudro o") })
public class Solicitudro1 implements Serializable {
    private static final long serialVersionUID = 4601396894650110199L;
    
        @Temporal(TemporalType.DATE)
        private Date fchmaxima;
        @Temporal(TemporalType.DATE)
        private Date fchsolicitud;
        @Column(nullable = true)
        private Long idcliente;
        @Id
        @Column(nullable = true)
        private Long idsolicitud;
        @Column(nullable = true)
        private String error;
        
        
        public Solicitudro1() {
        }

        public Solicitudro1(Date fchmaxima, Date fchsolicitud, Long idcliente, Long idsolicitud) {
            this.fchmaxima = fchmaxima;
            this.fchsolicitud = fchsolicitud;
            this.idcliente = idcliente;
            this.idsolicitud = idsolicitud;
        }


        public Date getFchmaxima() {
            return fchmaxima;
        }

        public void setFchmaxima(Date fchmaxima) {
            this.fchmaxima = fchmaxima;
        }

        public Date getFchsolicitud() {
            return fchsolicitud;
        }

        public void setFchsolicitud(Date fchsolicitud) {
            this.fchsolicitud = fchsolicitud;
        }

        public Long getIdcliente() {
            return idcliente;
        }

        public void setIdcliente(Long idcliente) {
            this.idcliente = idcliente;
        }

        public Long getIdsolicitud() {
            return idsolicitud;
        }

        public void setIdsolicitud(Long idsolicitud) {
            this.idsolicitud = idsolicitud;
        }
        
        public String gerError() {
            return error;
        }
    
        public void setError(String error) {
            this.error = error;
        }
        
        
        @Override
        public String toString() {
            StringBuffer buffer = new StringBuffer();
            buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
            buffer.append('[');
            buffer.append("fchmaxima=");
            buffer.append(getFchmaxima());
            buffer.append(',');
            buffer.append("fchsolicitud=");
            buffer.append(getFchsolicitud());
            buffer.append(',');
            buffer.append("idcliente=");
            buffer.append(getIdcliente());
            buffer.append(',');
            buffer.append("idsolicitud=");
            buffer.append(getIdsolicitud());
            buffer.append(']');
            return buffer.toString();
        }
}
