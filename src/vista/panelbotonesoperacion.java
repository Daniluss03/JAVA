/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Image;



/**
 *
 * @author danilus
 */

public class panelbotonesoperacion extends JPanel implements ActionListener 
{
    private JButton calcular;
    private JButton borrar;
    private JButton salir;
   private  VentanaPrincipaluno ventPrin;
   private JLabel lbImagen;
   private ImageIcon iImagen;
    private JComboBox imagenesbox;
    
    //Metodo constructor
    
    public panelbotonesoperacion(VentanaPrincipaluno vp)
    {
   
     ventPrin=vp;

    //contenedor del panel  
      setLayout(null);
        
         //adicionar  marco con titulo al panel
         TitledBorder borde=BorderFactory.createTitledBorder("  REALIZA TU PEDIDO");
         borde.setTitleColor(Color.BLACK);
         setBorder(borde);
         
         
      
       
   
        //boton para realizar las operaciones
       calcular=new JButton("FACTURA");
       calcular.setBounds(30,230,120,40);
       calcular.setForeground(Color.RED);
        add(calcular);
        calcular.setActionCommand("FACTURA");
        calcular.addActionListener(this);
        ImageIcon borrarunos= new ImageIcon(getClass().getResource("/img/lapiz.png"));
     calcular.setIcon(new ImageIcon(borrarunos.getImage().getScaledInstance(26,26,Image.SCALE_SMOOTH)));
     
         //boton paara borraar los datos
        borrar=new JButton("BORRAR");
        borrar.setBounds(170,230,120,40);
       borrar.setForeground(Color.RED);
        add(borrar);
        borrar.setActionCommand("BORRAR");
         borrar.addActionListener(this);
        ImageIcon borraruno= new ImageIcon(getClass().getResource("/img/basura.png"));
         borrar.setIcon(new ImageIcon(borraruno.getImage().getScaledInstance(26,26,Image.SCALE_SMOOTH)));
         
         //boton para salir
        salir=new JButton("SALIR");
        salir.setBounds(310,230,100,40);
        salir.setForeground(Color.RED);
        add(salir);
        salir.setActionCommand("SALIR");
        salir.addActionListener(this);
       ImageIcon borrardos= new ImageIcon(getClass().getResource("/img/salir.png"));
        salir.setIcon(new ImageIcon(borrardos.getImage().getScaledInstance(26,26,Image.SCALE_SMOOTH)));
      
        
    
        
        //crear imagen tabla
        iImagen = new ImageIcon(getClass().getResource("/img/copo.png"));
        lbImagen = new JLabel(iImagen);
        add(lbImagen);
        lbImagen.setBounds(70, 6, 300, 300);
        // agrgar texto 
         JLabel guia = new JLabel("guia :", JLabel.CENTER);
        guia = new JLabel(" BIENVENIDO A COORPOBOYACA");
        guia.setFont(new java.awt.Font("Bodoni MT Black", 1, 18));  
         guia.setForeground(Color.BLACK);
        guia.setBounds(40, 20, 400, 40);
        add(guia);
      //  fondo de la pantalla
         ImageIcon iLogo = new ImageIcon(getClass().getResource("/img/fondo rojo.jpg"));
        lbImagen = new JLabel(iLogo, JLabel.CENTER);
        lbImagen.setBounds(2, 15, 430, 502);
        add(lbImagen);
    }

 
    public void actionPerformed(ActionEvent ae) {
         //Identifica el evento generado
        String comando = ae.getActionCommand();
        
        if(comando.equals("FACTURA"))
            ventPrin.seleccionado();
            ventPrin.chexboxbox();
        {
            //JOptionPane.showMessageDialog(null,"Pulsaste el botón calcular...","Oper 1.0",JOptionPane.INFORMATION_MESSAGE);
          
        }
        if(comando.equals("BORRAR"))
        {
             JOptionPane.showMessageDialog(null,"SE BORRARAN TODOS LOS DATOS");
            ventPrin.borrar();
        }
        if(comando.equals("SALIR"))
         {
           //JOptionPane.showMessageDialog(this, " Clickeaste en el boton salir ");
	   ventPrin.salir();
         }
    }

    
   
    }


