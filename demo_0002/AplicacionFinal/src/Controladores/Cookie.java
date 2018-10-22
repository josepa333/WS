package Controladores;


import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import webservice.SessionEJB1Bean;
import webservice.SessionEJB1BeanService;
import webservice.LineaSolicitud;
import webservice.Solicitudro1;


public class Cookie {
    
    public static int conexionID;
    
    //Consultas
    
    public static ArrayList<String> consulta1(){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println("Cookie");
        List<String> filas = empleadoEJBBean.consulta1();
        ArrayList<String> resultado = new ArrayList();
        
        for (String lineaC : filas) {
            resultado.add(lineaC);
        }
        return resultado;
    }
    
    public static ArrayList<String> consulta2(){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        List<String> filas = empleadoEJBBean.consulta2();
        ArrayList<String> resultado = new ArrayList();
        for (String lineaC : filas) {
            resultado.add(lineaC);
        }
        return resultado;
    }
    
    
    //Total lineas
    public static int getTotalLineasSolicitudes(){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        return empleadoEJBBean.consultaTodasLasLineas();
    }
    
    
    //Actualiza
    public static void actualizarLinea(LineaSolicitud ls){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println(empleadoEJBBean.actualizaLineasSolicitud(ls));
    }
    
    public static void actualizarSolicitud(Solicitudro1 sol){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println(empleadoEJBBean.actualizaSolicitud(sol));
    }
    
    //insertar
    public static void insertaSolicitud(Solicitudro1 sol){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println(empleadoEJBBean.insertaSolicitud(sol));
    }
    
    public static void insertaLinea(LineaSolicitud ls){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println(empleadoEJBBean.insertaLineasSolicitud(ls));
    }
    
    
    //borra
    public static void borrarSolictud(Solicitudro1 sol){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println(empleadoEJBBean.borraSolicitud(sol));
    }
    
    public static void borrarLineaSolictud(LineaSolicitud lnSol){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println(empleadoEJBBean.borraLineasSolicitud(lnSol));
    }
    
    
    //conexiones
    public static void realizarCommit(){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println(empleadoEJBBean.commit(conexionID));
    }
    
    public static void cerrarConexion(){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        System.out.println(empleadoEJBBean.closeConexion(conexionID));
    }
    
    //gets
    public static ArrayList<LineaSolicitud> getLineasSolicitudes(Long idSol){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        ArrayList<LineaSolicitud> resultado = new ArrayList<>();
        Collection<LineaSolicitud> lineasSol = empleadoEJBBean.getLineaSolicitudes(idSol);
        
        for (LineaSolicitud tmp : lineasSol) {
            resultado.add(tmp);
        }
        
        return resultado; 
    }
        
    public static ArrayList<Solicitudro1> getSolicitudes(){
        SessionEJB1BeanService empleadoEJBBeanService = new SessionEJB1BeanService();
        SessionEJB1Bean empleadoEJBBean = empleadoEJBBeanService.getSessionEJB1BeanPort();
        ArrayList<Solicitudro1> resultado = new ArrayList<>();
        Collection<Solicitudro1> solicitudes = empleadoEJBBean.getSolicitudes();
        for (Solicitudro1 tmp : solicitudes) {
            resultado.add(tmp);
        }
        
        return resultado;
    }
    
    public Cookie() {
        super();
    }
}
