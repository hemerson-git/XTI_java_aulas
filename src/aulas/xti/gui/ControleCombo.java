package aulas.xti.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame{
    private JLabel imagem;
    private JComboBox<String> combo;
    ImageIcon[] imagens = {
        new ImageIcon(getClass().getResource("images/alone.jpg")),
        new ImageIcon(getClass().getResource("images/boat.jpg")),
        new ImageIcon(getClass().getResource("images/couple.jpg")),
        new ImageIcon(getClass().getResource("images/flash.jpg"))
    };
    public ControleCombo(){
        super("Galeria de fotos");
        Container c = getContentPane();
        
        /* Imagens */
        
        combo = new JComboBox<String>();
        combo.setFont(new Font("Serif", Font.ITALIC, 18));
        combo.setBackground(Color.BLACK);
        combo.setForeground(Color.WHITE);
        combo.addItem("Alone");
        combo.addItem("Boat");
        combo.addItem("Couple");
        combo.addItem("Flash");
        combo.addItemListener(new ComboListener());
        c.add(combo, BorderLayout.NORTH);
        
        imagem = new JLabel(imagens[0]);
        c.add(imagem);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320,640);
        setVisible(true);
    }
    
    class ComboListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent ie) {
            if(ie.getStateChange() == ItemEvent.SELECTED){
                imagem.setIcon(imagens[combo.getSelectedIndex()]);
            }
        }
        
    }
    
    public static void main(String[] args) {
        ControleCombo janela = new ControleCombo();
    }
}
