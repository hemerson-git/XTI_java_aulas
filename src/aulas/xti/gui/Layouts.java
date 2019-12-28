package aulas.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame{
    public Layouts(){
        super("Layouts");
        Container c = getContentPane();
        c.add(BorderLayout.NORTH, new JButton("1"));
        c.add(BorderLayout.SOUTH, new JButton("2"));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //operaçao ao fechar janela
        
        setSize(300,300); // configura as dimensões da janela
        setVisible(true); //muda a visibilidade
    }
    
    public static void main(String[] args) {
        Layouts layout = new Layouts();
    }
}
