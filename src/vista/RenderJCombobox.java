package vista;

import java.awt.Component;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * Ejemplo de Render para un JComboBox, que devuelve un icono para cada uno de
 * los posibles items.
 *
 * @author chuidiang
 *
 */
public class RenderJCombobox extends JLabel implements ListCellRenderer {

    /**
     * Para guardar los iconos por cada item. El item es la clave y el valor es
     * el icono.
     */
    Hashtable<Object, ImageIcon> icono = null;

    /**
     * Construye el Hashtable con los iconos seleccionados, asociándolos a los
     * items que tendrá el JComboBox "uno", "dos", "tres" y "cuatro"
     */
    public RenderJCombobox() {
        icono = new Hashtable<Object, ImageIcon>();
        icono.put("LECHUGA", new ImageIcon(getClass().getResource("/img/lechuga.png")));
        icono.put("REPOLLO", new ImageIcon(getClass().getResource("/img/repollo.png")));
        icono.put("ZANAHORIA", new ImageIcon(getClass().getResource("/img/zanahoria.png")));
        icono.put("TOMATE", new ImageIcon(getClass().getResource("/img/tomate.png")));
        icono.put("NARANJA", new ImageIcon(getClass().getResource("/img/naranja.png")));
        icono.put("LULO", new ImageIcon(getClass().getResource("/img/lulo.png")));
        icono.put("CHILE", new ImageIcon(getClass().getResource("/img/chile.png")));
        icono.put("DURAZNO", new ImageIcon(getClass().getResource("/img/durazno.png")));
    }

    /**
     * En función del value que se pasa (el item del JComboBox), se pone el
     * icono y se devuelve el JLabel.
     */
    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        if (icono.get(value) != null) {
            setIcon(icono.get(value));
            setText("" + value);
        } else {
            setIcon(null);
            setText("" + value);
        }
        return this;
    }
}
