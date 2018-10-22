package Controladores;

import Vistas.LineasDelPedido;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import Vistas.LineasDelPedido;
import Vistas.PedidosCRUD;
import Vistas.TablaLineas;
import Vistas.TablaPedidos;
import Vistas.crearPedido;
import Vistas.editarLineaSolicitud;

import javax.swing.JButton;

import webservice.LineaSolicitud;

public class lineaPedidosControlador implements ActionListener,MouseListener {
    
    private LineasDelPedido vista;
    public TablaLineas tablaBase;
    private Long pedidoActual;
    private ArrayList<LineaSolicitud> lineasTemporales;
    
    public lineaPedidosControlador(Long idPedido,  LineasDelPedido vista) {
        
        this.vista = vista;
        this.vista.setVisible(true);
        this.pedidoActual = idPedido;
        
        //Este arrayList se tiene que llenar con las lineas que vienen de WS
        lineasTemporales = Cookie.getLineasSolicitudes(pedidoActual);
        this.vista.asignaLineas(lineasTemporales);

        //Listener en botones y tabla 
        vista.primeraBT.addActionListener(this);
        vista.siguienteBT.addActionListener(this);
        vista.ultimaBT.addActionListener(this);
        vista.anteriorBT.addActionListener(this);
        this.vista.tablaLineas.addMouseListener(this);
        tablaBase = new TablaLineas();
        
        tablaBase.ver_tabla(this.vista.tablaLineas, lineasTemporales);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()) {
            case "Anterior":
                JOptionPane.showMessageDialog(vista,"Anterior");
                break;
            case "Siguiente":
                JOptionPane.showMessageDialog(vista,"Siguente");
                break;
            case "Ultima":
                JOptionPane.showMessageDialog(vista,"Ultima");
                break;
           case "Primera":
                JOptionPane.showMessageDialog(vista,"Primera");
                break;
            default:
                break;
        } 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
            int clic_tabla = vista.tablaLineas.rowAtPoint(e.getPoint());

           int column  = vista.tablaLineas.getColumnModel().getColumnIndexAtX(e.getX());
           int row = e.getY()/vista.tablaLineas.getRowHeight();

           if(row < vista.tablaLineas.getRowCount() && row >= 0 && column<vista.tablaLineas.getColumnCount() &&
                   column>=0){
               Object value  = vista.tablaLineas.getValueAt(row,column);
               if(value instanceof JButton){
                   ((JButton) value).doClick();
                   JButton boton = (JButton) value;
                   switch (column) {
                       case 5:
                            JOptionPane.showMessageDialog(vista,"Editar");
                            EditarLineaControler cEL = new EditarLineaControler(lineasTemporales.get(row), new editarLineaSolicitud());
                            break;
                       case 6:
                           if(JOptionPane.showConfirmDialog(vista, "¿Desea Eliminar?", "Mensaje", 1) == 0) {
                               JOptionPane.showMessageDialog(vista,"Borrar");
                               Cookie.borrarLineaSolictud( lineasTemporales.get(row) );
                               lineasTemporales.remove(row);
                               tablaBase.ver_tabla(this.vista.tablaLineas, lineasTemporales);
                           }
                           else
                               System.out.println("OK :)");
                           break;                        
                       default:
                           JOptionPane.showMessageDialog(vista, "Muy Bonita\nEspaciosa\nBarata", "Comentarios ", 1);
                           break;
                   }
                   System.out.println(row);
               }
           }
       }

    @Override
    public void mousePressed(MouseEvent e) {
        }

    @Override
    public void mouseReleased(MouseEvent e) {
       }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
        }
}


