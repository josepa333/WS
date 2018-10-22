/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.Consulta1;

import java.util.ArrayList;
import Vistas.Consulta2;
import Vistas.TablaConsulta2;
import Vistas.tablaConsulta;

/**
 *
 * @author jose pablo
 */
public class ControlerConsulta2 {
    ArrayList<String> values;
    Consulta2 vista;
    TablaConsulta2 tablaBase;
    
    public ControlerConsulta2(Consulta2 vista, ArrayList<String> consulta ) {
        this.vista = vista;
        this.values =consulta; 
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        tablaBase = new TablaConsulta2();
        tablaBase.ver_tabla(vista.tablaConsulta,consulta);
    }
}
       
