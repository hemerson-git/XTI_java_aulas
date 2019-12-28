package aulas.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame{
    public Layouts2(){
        super("Janelas2");
        Container c = getContentPane();
        c.add(new JButton("Centro"),BorderLayout.CENTER);
        
        Container c2 = new JPanel();
        c2.setLayout(new GridLayout(4,1));
        c2.add(new JButton("OK"));
        c2.add(new JButton("Cancel"));
        c2.add(new JButton("Setup..."));
        c2.add(new JButton("Help"));
        
        c.add(c2, BorderLayout.EAST);
//        c.setLayout(new GridLayout(4,1));
//        c.add(new JButton("1"));
//        c.add(new JButton("2"));
//        c.add(new JButton("3"));
//        c.add(new JButton("4"));
//        c.add(new JButton("5"));
//        c.add(new JButton("6"));
//        c.add(new JButton("7"));
//        c.add(new JButton("8"));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setMinimumSize(new Dimension(300,300));
        setVisible(true);
    }
    public static void main(String[] args) {
        Layouts2 janela = new Layouts2();
    }
}
