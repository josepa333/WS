package webservice;


import java.util.Collection;
import Controladores.Cookie;
import Controladores.PedidosCRUD_Controlador;
import java.util.ArrayList;
import Vistas.PedidosCRUD;


import java.util.ArrayList;
// This source file is generated by Oracle tools.
// Contents may be subject to change.
// For reporting problems, use the following:
// Generated by Oracle JDeveloper 12c 12.2.1.2.0.1224
public class SessionEJB1BeanPortClient {
    public static void main(String[] args) {
        SessionEJB1BeanService sessionEJB1BeanService = new SessionEJB1BeanService();
        SessionEJB1Bean sessionEJB1Bean = sessionEJB1BeanService.getSessionEJB1BeanPort();
        // Add your code to call the desired methods.
        Cookie.conexionID = sessionEJB1Bean.getConection();
        System.out.println(Cookie.conexionID);
        PedidosCRUD_Controlador vista = new PedidosCRUD_Controlador(new PedidosCRUD(new ArrayList<Solicitudro1>()));
    }
}
