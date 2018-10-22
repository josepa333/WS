/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.ArrayList;
import Vistas.Consulta1;
import Vistas.tablaConsulta;

/**
 *
 * @author jose pablo
 */
public class ControlerConsulta1 {
    ArrayList<String> values;
    Consulta1 vista;
    tablaConsulta tablaBase;
    
    public ControlerConsulta1(Consulta1 vista, ArrayList<String> consulta ) {
        this.vista = vista;
        this.values =consulta; 
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        tablaBase = new tablaConsulta();
        
        tablaBase.ver_tabla(vista.tablaConsulta,consulta);
    }
}
       
