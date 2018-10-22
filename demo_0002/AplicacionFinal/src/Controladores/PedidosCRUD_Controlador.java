package Controladores;


import Vistas.Consulta1;

import Vistas.Consulta2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import Vistas.LineasDelPedido;
import Vistas.PedidosCRUD;
import Vistas.TablaPedidos;
import Vistas.crearPedido;

import Vistas.editarSolicitud;

import webservice.Solicitudro1;


public class PedidosCRUD_Controlador implements ActionListener,MouseListener {
    
    private PedidosCRUD vista;
    public TablaPedidos tablaBase;
    private ArrayList <Solicitudro1> pedidosTemp;

    public PedidosCRUD_Controlador(PedidosCRUD vista) {
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.crearNuevoPedido.addActionListener(this);
        vista.cerraConexion.addActionListener(this);
        vista.Commit.addActionListener(this);
        vista.consulta1.addActionListener(this);
        vista.consulta2.addActionListener(this);
        
        this.vista.tablaPedidos.addMouseListener(this);
        tablaBase = new TablaPedidos();
        pedidosTemp = Cookie.getSolicitudes();
        tablaBase.ver_tabla(vista.tablaPedidos,pedidosTemp);
        
    }
    
    
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()) {
            case "Crear nuevo pedido":
                JOptionPane.showMessageDialog(vista,"Crear nuevo pedido");
                crearPedidoControlador cpc = new crearPedidoControlador(new crearPedido());//cambiarlo a la cantidad
                break;
            case "Cerrar conexion":
                   JOptionPane.showMessageDialog(vista,"Conexion cerrada");
                   Cookie.cerrarConexion();
                   break;
            case "Commit":
                   JOptionPane.showMessageDialog(vista,"Commit");
                   Cookie.realizarCommit();
                   break;
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
            case "Consulta1":
                 JOptionPane.showMessageDialog(vista,"Consulta1");
                 ArrayList<String> consulta = Cookie.consulta1();
                 ControlerConsulta1 cn = new  ControlerConsulta1(new Consulta1() ,consulta );
                 break;
            case "Consulta2":
                 JOptionPane.showMessageDialog(vista,"Consulta2");
                    ArrayList<String> consulta2 = Cookie.consulta2();
                    ControlerConsulta2 cn2 = new  ControlerConsulta2(new Consulta2() ,consulta2 );
                 break;
            default:
                break;
        } 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        int clic_tabla = vista.tablaPedidos.rowAtPoint(e.getPoint());

        int column  = vista.tablaPedidos.getColumnModel().getColumnIndexAtX(e.getX());
        int row = e.getY()/vista.tablaPedidos.getRowHeight();
        
        if(row < vista.tablaPedidos.getRowCount() && row >= 0 && column<vista.tablaPedidos.getColumnCount() &&
                column>=0){
            Object value  = vista.tablaPedidos.getValueAt(row,column);
            if(value instanceof JButton){
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                switch (column) {
                    case 4:
                        JOptionPane.showMessageDialog(vista,"Detalles");
                       lineaPedidosControlador lpc = new lineaPedidosControlador(pedidosTemp.get(row).getIdsolicitud(),  new LineasDelPedido());
                        break;
                    case 5:
                         JOptionPane.showMessageDialog(vista,"Editar");
                            editarSolicitudControlador esc = new editarSolicitudControlador(pedidosTemp.get(row), new editarSolicitud());
                         break;
                    case 6:
                        if(JOptionPane.showConfirmDialog(vista, "¿Desea Eliminar?", "Mensaje", 1) == 0) {
                            JOptionPane.showMessageDialog(vista,"Borrado");
                            Cookie.borrarSolictud( pedidosTemp.get(row));
                            pedidosTemp.remove(row);
                            tablaBase.ver_tabla(vista.tablaPedidos,pedidosTemp);
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
