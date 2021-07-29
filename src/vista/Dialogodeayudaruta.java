/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author danilus
 */
public class Dialogodeayudaruta extends JDialog {

    private VentanaPrincipaluno miVentanaPrincipal;
    private URLabel label = new URLabel();
    ;
           private URLabel label1 = new URLabel();

    ;
      public Dialogodeayudaruta(VentanaPrincipaluno vp) {

        super(vp, true);
        setLayout(null);
        miVentanaPrincipal = vp;

        setSize(432, 500);
        setTitle("CORPOBOYACA");
        setResizable(false);

        label.setURL("https://www.google.com/maps/?hl=es");

        label.setText("DALE CLICK");
        label.setBounds(6, 10, 400, 20);
        label.setFont(new java.awt.Font("Arial", 30, 18));
        label.setLocation(20, 200);
        add(label);
        label1.setURL("https://www.google.com/maps/?hl=es");
        label1.setText("CONECTATE CON GOOGLE MAPS");

        label1.setBounds(6, 20, 400, 20);
        label1.setFont(new java.awt.Font("Arial", 30, 18));
        label1.setLocation(20, 240);
        add(label1);

        ImageIcon iLogo = new ImageIcon(getClass().getResource("/img/imagenjdialogruta.jpg"));
        JLabel lbImagen = new JLabel(iLogo, JLabel.CENTER);
        lbImagen.setBounds(2, 2, 430, 502);
        add(lbImagen);

    }
}
