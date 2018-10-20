package webservice;

import javax.ejb.Remote;
import java.util.Collection;

@Remote
public interface SessionEJB1 {

    public int getConection();  
    Collection<Solicitudro1> getSolicitudes();
    public boolean insertaSolicitud(Solicitudro1 solicitud) ;
    public boolean actualizaSolicitud(Solicitudro1 solicitud);
    public boolean borraSolicitud(Solicitudro1 solicitud);
    Collection<LineaSolicitud> getLineaSolicitudes();

    public boolean commit(int indice);
}
