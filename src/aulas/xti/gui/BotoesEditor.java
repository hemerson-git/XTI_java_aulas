package aulas.xti.gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotoesEditor extends JButton{
    
    public BotoesEditor(ImageIcon icon) {
        super(icon);
        this.setBackground(new Color(200,200,215));
        this.setForeground(Color.WHITE);
    }
    
}
