package webservice;

import javax.ejb.Remote;
import java.util.Collection;

import java.util.ArrayList;

@Remote
public interface SessionEJB1 {

    public int getConection();  
    
    Collection<Solicitudro1> getSolicitudes();
    public String insertaSolicitud(Solicitudro1 solicitud) ;
    public String actualizaSolicitud(Solicitudro1 solicitud);
    public String borraSolicitud(Solicitudro1 solicitud);
    
    //Consultas
    ArrayList<String> consulta1();
    ArrayList<String> consulta2();
    
    Collection<LineaSolicitud> getLineaSolicitudes(Long idSolicitud);
    public String insertaLineasSolicitud(LineaSolicitud lineaSolicitud) ;
    public String actualizaLineasSolicitud(LineaSolicitud lineaSolicitud);
    public String borraLineasSolicitud(LineaSolicitud lineaSolicitud);
    
    public boolean commit(int indice);
}
