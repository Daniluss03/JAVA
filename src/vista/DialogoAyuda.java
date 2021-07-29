/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author danilus
 */
public class DialogoAyuda extends JDialog {

    private VentanaPrincipaluno miVentanaPrincipal;

    //metodo constructor  de la ventana
    public DialogoAyuda(VentanaPrincipaluno vp) {

        super(vp, true);
        setLayout(null);
        miVentanaPrincipal = vp;

        ImageIcon iImagen = new ImageIcon(getClass().getResource("/img/descuento1.png"));
        JLabel lbImagen = new JLabel(iImagen);
        add(lbImagen);
        lbImagen.setBounds(0, 0, 600, 500);
        //Caracteristicas de la  ventana 
        setSize(600, 500);
        setTitle("CORPOBOYACA");
        setResizable(false);

        int z;
        int uno, dos, tres;

        JOptionPane.showMessageDialog(null, "BIENVENIDO AL MENU INTERACTIVO");

        z = Integer.parseInt(JOptionPane.showInputDialog("¿que quieres hacer ? - Escribe una opcion" + " \n1) saludar" + " \n2) calculadora" + "\n3) despedirce"
                + "\n4)!cuentame un chiste!" + "\n5)¿Como te sientes?"));
        while (true) {
            if (z == 1) {
                JOptionPane.showMessageDialog(null, "hola espero que estes bien");
                break;
            }
            if (z == 2) {
                uno = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer numero"));
                dos = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo numero"));
                tres = Integer.parseInt(JOptionPane.showInputDialog("1)sumar" + " \n2) dividir" + " \n3) multiplicar" + "\n 4) dividir"));
                switch (tres) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "el resultado de la suma es " + (uno + dos));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "el resultado de la resta es " + (uno - dos));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "el resultado de la multiplicacion  es " + (uno * dos));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "el resultado de la division es " + (uno / dos));
                        break;
                }
                break;
            }
            if (z == 3) {
                JOptionPane.showMessageDialog(null, "hasta luego que tengas un excelente dia");
                break;
            }
            if (z == 4) {
                int chiste = (int) (Math.random() * 4 + 1);

                switch (chiste) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "¿que le dice un jaguar a otro jaguar");
                        JOptionPane.showMessageDialog(null, "jaguar you");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "¿Qué le dijo un mosquito a un grupo de niños?");
                        JOptionPane.showMessageDialog(null, "“No aplaudan que todavía no es mi cumpleaños”. ");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "¿Por qué un huevo fue al banco a pedir dinero prestado?");
                        JOptionPane.showMessageDialog(null, "Porque estaba quebrado.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "¿Qué le dice una taza a otra? ");
                        JOptionPane.showMessageDialog(null, "¿Qué taza ciendo?");
                        break;
                }
                break;
            }
            if (z == 5) {
                int FRASE = Integer.parseInt(JOptionPane.showInputDialog("1) FELIZ" + "\n 2) TRISTE" + "\n 3) INTRIGA" + " \n 4) MIEDO"));

                switch (FRASE) {
                    case 1:

                        JOptionPane.showMessageDialog(null, "Deséalo, espéralo, suéñalo, pero por todos los medios… ¡Hazlo!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Si lo puedes creer lo puedes lograr");

                        break;
                    case 3:

                        JOptionPane.showMessageDialog(null, "Mi mayor error es probablemente priorizar el talento por sobre su personalidad. Creo que importa si alguien tiene o no un buen corazón-elon musk");
                        break;
                    case 4:

                        JOptionPane.showMessageDialog(null, "El momento que da más miedo es siempre justo antes de empezar.");
                        break;
                }
                break;
            }
        }
    }

}
