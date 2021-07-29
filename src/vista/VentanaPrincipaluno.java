/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Conversosdekilos;

/**
 *
 * @author danilus
 */
public class VentanaPrincipaluno extends JFrame {

    //elementos de la ventana(atributos)
    private panelDatos mipanelprincipal;
    private panelbotonesoperacion misecundario;
    private panel3 mipanelterciario;
    private Conversosdekilos miConversordekilos;
    private BarraMenuuno mibarramenu;
    private JLabel lbhora;

    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;

    public VentanaPrincipaluno() {

        // Definicion contenedor de la ventana
        setLayout(null);

        //creacion de la barra
        mibarramenu = new BarraMenuuno(this);
        this.setJMenuBar(mibarramenu);

        //Construccion del PanelDatos
        mipanelprincipal = new panelDatos();
        mipanelprincipal.setBounds(10, 10, 420, 540);
        add(mipanelprincipal);
        //construccion panel de operaciones
        misecundario = new panelbotonesoperacion(this);
        misecundario.setBounds(440, 10, 440, 275);
        add(misecundario);
        //construccion panel de resultados
        mipanelterciario = new panel3();
        mipanelterciario.setBounds(440, 290, 440, 260);
        add(mipanelterciario);

        //Caracteristicas de la ventana
        setTitle("COORPOBOYACA");
        setSize(900, 620);
        setLocation(100, 100);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void borrar() {
        {
            mipanelprincipal.borrarDatosuno();
            mipanelprincipal.borrarDatostres();
            mipanelprincipal.borrarDatosdos();
            mipanelprincipal.borrarDatoscombouno();
            mipanelprincipal.borrarDatoscombotres();
            mipanelprincipal.borrarDatoscombosiete();
            mipanelprincipal.borrarDatoscomboseis();
            mipanelprincipal.borrarDatoscomboocho();
            mipanelprincipal.borrarDatoscombodos();
            mipanelprincipal.borrarDatoscombocuatro();
            mipanelprincipal.borrarDatoscombocinco();
            mipanelprincipal.borrarDatoscinco();
            mipanelprincipal.borrarDatocuatro();
            mipanelprincipal.borrarcantidad();
            mipanelterciario.borrar();

        }

    }
    //mostrarn en el panel de resultados los datos ingresados por el usuario

    public void seleccionado() {

        mipanelterciario.resultado("BIENVENIDO  " + mipanelprincipal.tres.getText() + mipanelprincipal.cuatro.getText()
                + "\nIDENTIFICACION :  " + mipanelprincipal.dos.getText()
                + "\nEN LA FECHA : " + mipanelprincipal.cinco.getText()
                + "\nEL NOMBRE DE SU EMPRESA ES : " + mipanelprincipal.seis.getText()
                + "\nCON LA DIRECCION : " + mipanelprincipal.uno.getText()
                + "\nUSTED SELECCIONO LAS SIGUIENTES OPCCIONES "
                + " 1). " + mipanelprincipal.diez.getText() + "de" + mipanelprincipal.combo1.toString()
                + " 2). " + mipanelprincipal.catorce.getText() + "\nde" + mipanelprincipal.combo2.toString()
                + " 3). " + mipanelprincipal.siete.getText() + "\nde" + mipanelprincipal.combo3.toString()
                + " 4). " + mipanelprincipal.ocho.getText() + "\nde" + mipanelprincipal.combo4.toString()
                + " 5). " + mipanelprincipal.nueve.getText() + "\nde" + mipanelprincipal.combo5.toString()
                + " 6). " + mipanelprincipal.trece.getText() + "\nde" + mipanelprincipal.combo7.toString()
                + " 7). " + mipanelprincipal.once.getText() + "\nde" + mipanelprincipal.combo6.toString()
                + " 8). " + mipanelprincipal.doce.getText() + "\nde" + mipanelprincipal.combo8.toString());
    }

//mostrar  en el panel de resultados las chechbox
    public void chexboxbox() {
        if (mipanelprincipal.getafiliados()) {
            mipanelterciario.resultado("usted selecciono la opcion afiliado");
        }

    }

//finalizar el proceso en el programa
    void salir() {

        JOptionPane.showMessageDialog(this, "GRACIAS POR PREFERIRNOS. ADIOS");
        System.exit(0);
    }

    public void mostrarDialogoclass() {
        DialogoAyuda miDialogoclass = new DialogoAyuda(this);
        miDialogoclass.setLocationRelativeTo(this);
        miDialogoclass.setVisible(true);

    }

    public void mostrarDialogoclass1() {
        Dialogodeayudaruta miDialogodeayudaruta = new Dialogodeayudaruta(this);
        miDialogodeayudaruta.setLocationRelativeTo(this);
        miDialogodeayudaruta.setVisible(true);

    }

    void calendario() {
        mipanelprincipal.mostrarTiempo();
    }

    public void suma(int x, int y) {

        int resultado;

        resultado = x + y;

    }
}
