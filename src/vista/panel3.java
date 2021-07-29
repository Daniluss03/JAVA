/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author danilus
 */
public class panel3 extends JPanel {

    private JTextArea resultado;
    private JScrollPane spresultado;

    //Metodo constructor
    public panel3() {
        /*
        Definición contenedor del panel
         */
        setLayout(null);

        /*
        Definición color del panel
         */
        setBackground(Color.GRAY);
        //contenedor del panel  
        resultado = new JTextArea("AQUI APARECERA SU FACTURA\n");
        resultado.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        resultado.setForeground(Color.RED);

        spresultado = new JScrollPane(resultado);
        add(spresultado);
        spresultado.setBounds(20, 20, 410, 200);

        JLabel guia = new JLabel("guia :", JLabel.CENTER);
        guia = new JLabel(" '' “Cuando estaba en la universidad quería involucrarme  ");
        guia.setBounds(20, 220, 400, 40);
        add(guia);
        JLabel guia1 = new JLabel("guia :", JLabel.CENTER);
        guia = new JLabel(" en cosas que cambiaran al mundo”''-Elon musk");
        guia.setBounds(20, 230, 400, 40);
        add(guia);
        TitledBorder borde = BorderFactory.createTitledBorder("SU FACTURA");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }
    //Metodo para borrar los datos

    public void borrar() {
        resultado.setText("");
    }

    void resultado(String msj) {
        resultado.append(msj + "\n");
    }
}
