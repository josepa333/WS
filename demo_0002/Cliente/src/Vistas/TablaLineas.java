package Vistas;

import Controladores.lineaPedidosControlador;


import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import webservice.LineaSolicitud;

/**
 *
 * @author jose pablo
 */

public class TablaLineas {
    public void ver_tabla(JTable pTabla,ArrayList<LineaSolicitud> lineasPedidos){
        
        pTabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel tablaPredeterminada = new DefaultTableModel(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        
        tablaPredeterminada.addColumn("ID Linea Solicitud");
        tablaPredeterminada.addColumn("Prenda");
        tablaPredeterminada.addColumn("Talla");
        tablaPredeterminada.addColumn("Cantidad");
        tablaPredeterminada.addColumn("ID orden produccion");
        tablaPredeterminada.addColumn("Editar");
        tablaPredeterminada.addColumn("Borrar");
        JButton botonEditar = new JButton("Editar");
        JButton botonBorrar = new JButton("Borrar");
        
        Object fila[] = new Object[7];
            
        if(lineasPedidos.size() > 0){
            for(int i=0; i<lineasPedidos.size(); i++){
                //fila[0] = propiedades.get(i).getClass().toString().replace("class modelo.", "");
                fila[0] = lineasPedidos.get(i).getIdlineasolicitud() ;
                fila[1] = lineasPedidos.get(i).getIdprenda();
                fila[2] = lineasPedidos.get(i).getIdtalla();
                fila[3] = lineasPedidos.get(i).getCantidad();
                fila[4] = lineasPedidos.get(i).getIdordenproduccion();
                fila[5] = botonEditar;
                fila[6] = botonBorrar;
                tablaPredeterminada.addRow(fila);
            }
        }
        
        else{
            fila[0] = "";
            fila[1] = "";
            fila[2] = "";
            fila[3] = "";
            fila[4] ="";
            fila[5] = botonEditar;
            fila[6] = botonBorrar;
            tablaPredeterminada.addRow(fila);
        }
        pTabla.setModel(tablaPredeterminada);
        pTabla.setRowHeight(30);
    }
}