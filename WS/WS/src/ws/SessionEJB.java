package ws;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface SessionEJB {
    public int getConection();  
         Collection<Solicitudro> getSolicitudes();
         public boolean insertaSolicitud(Solicitudro solicitud) ;
         public boolean actualizaSolicitud(Solicitudro solicitud);
         public boolean borraSolicitud(Solicitudro solicitud);
         
         //lineas
         public boolean insertaLineasSolicitud(Lineasolicitudro lineaSolicitud) ;
         public boolean actualizaLineasSolicitud(Lineasolicitudro lineaSolicitud);
         public boolean borraLineasSolicitud(Lineasolicitudro lineaSolicitud);
         Collection<Lineasolicitudro> getLineaSolicitudes();
         
         public boolean commit(int indice);
}
