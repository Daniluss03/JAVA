/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author danilus
 */
public class panelDatos extends JPanel {

    //Elementos  del panel (atributos)
    private JLabel lbx, lby, imagen, docu, emp, fech, dire, miAUTOMATICO, mihora;
    JTextField uno;
    JTextField dos;
    JTextField tres;
    JTextField cuatro;
    JTextField cinco;
    JTextField seis;
    JTextField siete;
    JTextField ocho;
    JTextField nueve;
    JTextField diez;
    JTextField once;
    JTextField doce;
    JTextField trece;
    JTextField catorce;
    javax.swing.JComboBox<String> combo1;
    JComboBox combo2;
    JComboBox combo3;
    JComboBox combo4;
    JComboBox combo5;
    JComboBox combo6;
    JComboBox combo7;
    JComboBox combo8;

    private ImageIcon ilogo;
    JCheckBox chek1, chek2;
    private JLabel lbImagen;
    private ImageIcon iImagen;

    Tiempopro time = new Tiempopro();

    //Metodo constructor
    public panelDatos() {
        // Definicion contenedor del panel  
        setLayout(null);

        //Crear y agragar la etiqueta lbx
        lbx = new JLabel("NOMBRE :", JLabel.CENTER);
        lbx = new JLabel("NOMBRE:");
        lbx.setFont(new java.awt.Font("Times New Roman", 1, 12));
        lbx.setBounds(15, 40, 120, 20);
        lbx.setForeground(Color.RED);
        add(lbx);

        //Crear etiqueta  documento 
        docu = new JLabel("DOCUMENTO:", JLabel.CENTER);
        docu = new JLabel("DOCUMENTO:");
        docu.setBounds(10, 140, 120, 20);
        docu.setFont(new java.awt.Font("Times New Roman", 1, 12));
        docu.setForeground(Color.RED);
        add(docu);

        //etiqueta de la empresa del cliente 
        emp = new JLabel("EMPRESA:", JLabel.CENTER);
        emp = new JLabel("EMPRESA:");
        emp.setFont(new java.awt.Font("Times New Roman", 1, 12));
        emp.setBounds(15, 180, 120, 20);
        add(emp);
        //crear etiqueta fecha

        fech = new JLabel("FECHA :", JLabel.CENTER);
        fech = new JLabel("FECHA:");
        fech.setFont(new java.awt.Font("Times New Roman", 1, 12));
        fech.setBounds(15, 210, 120, 20);
        fech.setForeground(Color.RED);
        add(fech);

        mihora = new JLabel("HORA :", JLabel.CENTER);
        mihora = new JLabel("HORA ");
        mihora.setFont(new java.awt.Font("Times New Roman", 1, 12));
        mihora.setBounds(360, 20, 120, 20);
        mihora.setForeground(Color.BLACK);
        add(mihora);

        //Crear y agragar la etiqueta lby
        lby = new JLabel("APELLIDO :", JLabel.CENTER);
        lby = new JLabel("APELLIDO:");
        lby.setFont(new java.awt.Font("Times New Roman", 1, 12));
        lby.setBounds(15, 90, 120, 20);
        add(lby);
        //Crear y agragar la etiqueta lby
        dire = new JLabel("DIRECCION:", JLabel.CENTER);
        dire = new JLabel("DIRECCION:");
        dire.setFont(new java.awt.Font("Times New Roman", 1, 12));
        dire.setBounds(15, 240, 120, 20);
        add(dire);

        //crear y agregar campo de texto 
        uno = new JTextField();
        uno.setBounds(130, 240, 120, 20);
        add(uno);
        uno.setFont(new java.awt.Font("Times New Roman", 1, 18));
        uno.setForeground(new java.awt.Color(0, 0, 153));

        //crear y agregar campo de texto 
        dos = new JTextField();
        dos.setBounds(130, 140, 120, 20);
        add(dos);
        dos.setFont(new java.awt.Font("times new roman", 1, 18));
        dos.setForeground(new java.awt.Color(0, 0, 153));
        //crear y agregar campo de texto 
        tres = new JTextField();
        tres.setBounds(130, 40, 120, 20);
        add(tres);
        tres.setFont(new java.awt.Font("times new roman", 1, 18));
        tres.setForeground(new java.awt.Color(0, 0, 153));

        //crear y agregar campo de texto 
        cuatro = new JTextField();
        cuatro.setBounds(130, 90, 120, 20);
        add(cuatro);
        cuatro.setFont(new java.awt.Font("times new roman", 1, 18));
        cuatro.setForeground(new java.awt.Color(0, 0, 153));

        //crear y agregar campo de texto 
        cinco = new JTextField();
        cinco.setBounds(130, 210, 120, 20);
        add(cinco);
        cinco.setFont(new java.awt.Font("times new roman", 1, 18));
        cinco.setForeground(new java.awt.Color(0, 0, 153));
        // crear y agregar campo de texto
        seis = new JTextField();
        seis.setBounds(130, 180, 120, 20);
        add(seis);
        seis.setFont(new java.awt.Font("times new roman", 1, 18));
        seis.setForeground(new java.awt.Color(0, 0, 153));
        //agregar chek box
        chek1 = new JCheckBox(" AFILIADO");
        chek1.setBounds(10, 480, 120, 40);
        add(chek1);
        chek1.setBackground(Color.RED);

        chek2 = new JCheckBox("  NO AFILIADO");
        chek2.setBounds(150, 480, 120, 40);
        add(chek2);
        chek2.setBackground(Color.RED);

        //Adicionar marco con titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder("DATOS  PERSONALES Y  OTROS.");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
        //Primera combobox
        combo1 = new javax.swing.JComboBox<>();
        combo1.setBounds(70, 290, 100, 30);
        add(combo1);
        combo1.addItem("LECHUGA");
        combo1.addItem("REPOLLO");
        combo1.addItem("ZANAHORIA");
        combo1.addItem("TOMATE");
        combo1.addItem("NARANJA");
        combo1.addItem("LULO");
        combo1.addItem("CHILE");
        combo1.addItem("DURAZNO");
        //hacer visible los iconos
        combo1.setRenderer(new RenderJCombobox());
        combo1.setSelectedIndex(0);
        combo1.setVisible(true);
        //Segunda combobox
        combo2 = new JComboBox<String>();
        combo2.setBounds(70, 320, 100, 30);
        add(combo2);
        combo2.addItem("LECHUGA");
        combo2.addItem("REPOLLO");
        combo2.addItem("ZANAHORIA");
        combo2.addItem("TOMATE");
        combo2.addItem("NARANJA");
        combo2.addItem("LULO");
        combo2.addItem("CHILE");
        combo2.addItem("DURAZNO");
        //hacer visible los iconos 
        combo2.setRenderer(new RenderJCombobox());
        combo2.setSelectedIndex(1);
        combo2.setVisible(true);

        //tercera combobox
        combo3 = new JComboBox<String>();
        combo3.setBounds(70, 350, 100, 30);
        add(combo3);
        combo3.addItem("LECHUGA");
        combo3.addItem("REPOLLO");
        combo3.addItem("ZANAHORIA");
        combo3.addItem("TOMATE");
        combo3.addItem("NARANJA");
        combo3.addItem("LULO");
        combo3.addItem("CHILE");
        combo3.addItem("DURAZNO");
        //hacer visisble los iconos
        combo3.setRenderer(new RenderJCombobox());
        combo3.setSelectedIndex(2);
        combo3.setVisible(true);
        //Cuarta combobox
        combo4 = new JComboBox<String>();
        combo4.setBounds(70, 380, 100, 30);
        add(combo4);
        combo4.addItem("LECHUGA");
        combo4.addItem("REPOLLO");
        combo4.addItem("ZANAHORIA");
        combo4.addItem("TOMATE");
        combo4.addItem("NARANJA");
        combo4.addItem("LULO");
        combo4.addItem("CHILE");
        combo4.addItem("DURAZNO");
        //hacer visible los iconos
        combo4.setRenderer(new RenderJCombobox());
        combo4.setSelectedIndex(3);
        combo4.setVisible(true);
        //Quinta combobox
        combo5 = new JComboBox<String>();
        combo5.setBounds(210, 350, 100, 30);
        add(combo5);
        combo5.addItem("LECHUGA");
        combo5.addItem("REPOLLO");
        combo5.addItem("ZANAHORIA");
        combo5.addItem("TOMATE");
        combo5.addItem("NARANJA");
        combo5.addItem("LULO");
        combo5.addItem("CHILE");
        combo5.addItem("DURAZNO");
        //hacer visible los iconos
        combo5.setRenderer(new RenderJCombobox());
        combo5.setSelectedIndex(4);
        combo5.setVisible(true);
        //sexta combobox
        combo6 = new JComboBox<String>();
        combo6.setBounds(210, 290, 100, 30);
        add(combo6);
        combo6.addItem("LECHUGA");
        combo6.addItem("REPOLLO");
        combo6.addItem("ZANAHORIA");
        combo6.addItem("TOMATE");
        combo6.addItem("NARANJA");
        combo6.addItem("LULO");
        combo6.addItem("CHILE");
        combo6.addItem("DURAZNO");
        //hacer visible los iconos
        combo6.setRenderer(new RenderJCombobox());
        combo6.setSelectedIndex(5);
        combo6.setVisible(true);
        //septima combobox
        combo7 = new JComboBox<String>();
        combo7.setBounds(210, 320, 100, 30);
        add(combo7);
        combo7.addItem("LECHUGA");
        combo7.addItem("REPOLLO");
        combo7.addItem("ZANAHORIA");
        combo7.addItem("TOMATE");
        combo7.addItem("NARANJA");
        combo7.addItem("LULO");
        combo7.addItem("CHILE");
        combo7.addItem("DURAZNO");
        //hacer visible los iconos
        combo7.setRenderer(new RenderJCombobox());
        combo7.setSelectedIndex(6);
        combo7.setVisible(true);
        //octava combobox
        combo8 = new JComboBox<String>();
        combo8.setBounds(210, 380, 100, 30);
        add(combo8);
        combo8.addItem("LECHUGA");
        combo8.addItem("REPOLLO");
        combo8.addItem("ZANAHORIA");
        combo8.addItem("TOMATE");
        combo8.addItem("NARANJA");
        combo8.addItem("LULO");
        combo8.addItem("CHILE");
        combo8.addItem("DURAZNO");
        //hacer visible los iconos
        combo8.setRenderer(new RenderJCombobox());
        combo8.setSelectedIndex(7);
        combo8.setVisible(true);
        //texts field de la comobox 1 para la cantifdad de producto que necesitan  los compradores
        catorce = new JTextField();
        catorce.setBounds(30, 290, 30, 20);
        add(catorce);
        catorce.setFont(new java.awt.Font("times new roman", 1, 18));
        catorce.setForeground(new java.awt.Color(0, 0, 153));
        //texts field de la  combobox  2 para la cantifdad de producto que necesitan  los compradores
        siete = new JTextField();
        siete.setBounds(30, 320, 30, 20);
        add(siete);

        siete.setFont(new java.awt.Font("times new roman", 1, 18));
        siete.setForeground(new java.awt.Color(0, 0, 153));
        //texts field de la  combobox  3 para la cantifdad de producto que necesitan  los compradores
        ocho = new JTextField();
        ocho.setBounds(30, 350, 30, 20);
        add(ocho);
        ocho.setFont(new java.awt.Font("times new roman", 1, 18));
        ocho.setForeground(new java.awt.Color(0, 0, 153));
        //texts field de la  combobox  4 para la cantifdad de producto que necesitan  los compradores
        nueve = new JTextField();
        nueve.setBounds(30, 380, 30, 20);
        add(nueve);
        nueve.setFont(new java.awt.Font("times new roman", 1, 18));
        nueve.setForeground(new java.awt.Color(0, 0, 153));
        //texts field de la comobox 1 para la cantifdad de producto que necesitan  los compradores
        diez = new JTextField();
        diez.setBounds(320, 380, 30, 20);
        add(diez);
        diez.setFont(new java.awt.Font("times new roman", 1, 18));
        //texts field de la comobox 1 para la cantifdad de producto que necesitan  los compradores
        once = new JTextField();
        once.setBounds(320, 320, 30, 20);
        add(once);
        once.setFont(new java.awt.Font("times new roman", 1, 18));
        //texts field de la comobox 1 para la cantifdad de producto que necesitan  los compradores
        doce = new JTextField();
        doce.setBounds(320, 290, 30, 20);
        add(doce);
        doce.setFont(new java.awt.Font("times new roman", 1, 18));
        //texts field de la comobox 1 para la cantifdad de producto que necesitan  los compradores
        trece = new JTextField();
        trece.setBounds(320, 350, 30, 20);
        add(trece);
        trece.setFont(new java.awt.Font("times new roman", 1, 18));
        //

        ////////*
        JLabel guia = new JLabel("guia :", JLabel.CENTER);
        guia = new JLabel(" Dijite la cantidad en los espacios y luego seleccione :");
        guia.setFont(new java.awt.Font("Times New Roman", 1, 12));
        guia.setBounds(10, 260, 400, 40);
        add(guia);
        // fondo de  la pantalla
        ImageIcon iLogo = new ImageIcon(getClass().getResource("/img/frutitas.jpg"));
        lbImagen = new JLabel(iLogo, JLabel.CENTER);
        lbImagen.setBounds(11, 15, 410, 502);
        add(lbImagen);
    }

    public Object combo1() {
        return (Object) combo1.getSelectedItem();

    }

    public Object combo2() {
        return (Object) combo2.getSelectedItem();

    }

    public Object combo3() {
        return (String) combo3.getSelectedItem();

    }

    public Object combo4() {
        return (String) combo4.getSelectedItem();

    }

    public Object combo5() {
        return (String) combo5.getSelectedItem();

    }

    public Object combo6() {
        return (String) combo6.getSelectedItem();

    }

    public Object combo7() {
        return (String) combo7.getSelectedItem();

    }

    public Object combo8() {
        return (String) combo8.getSelectedItem();
    }

    //metodo  para obtener los datos
    public String getNOMBRE() {
        return uno.getText();
    }

    public String getApellido() {
        return dos.getText();
    }

    public String getdocumento() {
        return tres.getText();
    }

    public String getempresa() {
        return cuatro.getText();

    }

    public String getdireccion() {
        return cinco.getText();
    }

    public String getfecha() {
        return seis.getText();
    }

    public String getcombotexto7() {
        return siete.getText();
    }

    public String getcombotexto8() {
        return ocho.getText();
    }

    public String getcombotexto9() {
        return nueve.getText();
    }

    public String getcombotexto10() {
        return diez.getText();
    }

    public String getcombotexto11() {
        return once.getText();
    }

    public String getcombotexto12() {
        return doce.getText();
    }

    public String getcombotexto13() {
        return trece.getText();
    }

    public String getcombotexto() {
        return catorce.getText();
    }

    //Metodo para borrar los datos
    public void borrarDatosuno() {
        uno.setText("");

    }

    public void borrarDatosdos() {
        dos.setText("");
    }

    public void borrarDatostres() {

        tres.setText("");
    }

    public void borrarDatocuatro() {

        cuatro.setText("");
    }

    public void borrarDatoscinco() {
        cinco.setText("");
    }

    public void borrarDatoscombouno() {
        seis.setText("");
    }

    public void borrarDatoscombodos() {
        siete.setText("");
    }

    public void borrarDatoscombotres() {
        ocho.setText("");
    }

    public void borrarDatoscombocuatro() {
        nueve.setText("");
    }

    public void borrarDatoscombocinco() {
        diez.setText(" ");
    }

    public void borrarDatoscomboseis() {
        once.setText(" ");
    }

    public void borrarDatoscombosiete() {
        doce.setText(" ");
    }

    public void borrarDatoscomboocho() {
        trece.setText(" ");

    }

    public void borrarcantidad() {
        catorce.setText(" ");

    }

    boolean getafiliados() {
        return chek1.isSelected();
    }

    public void mostrarTiempo() {
        fech.setText(time.fechacomp);
        mihora.setText(time.horacomp);
    }

}
