package aulas.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
    public Calculadora(){
        super("Calculadora");
        Container c = getContentPane();
        JTextField text = new JTextField();
        text.setFont(new Font("Serif", Font.BOLD, 20));
        c.add(text, BorderLayout.NORTH);
        
        //botões
        Container c2 = new JPanel();
        c2.setLayout(new GridLayout(4,4,5,5));
        c2.add(new JButton("7"));
        c2.add(new JButton("8"));
        c2.add(new JButton("9"));
        c2.add(new JButton("/"));
        c2.add(new JButton("4"));
        c2.add(new JButton("5"));
        c2.add(new JButton("6"));
        c2.add(new JButton("*"));
        c2.add(new JButton("1"));
        c2.add(new JButton("2"));
        c2.add(new JButton("3"));
        c2.add(new JButton("-"));
        c2.add(new JButton("0"));
        c2.add(new JButton("."));
        c2.add(new JButton("="));
        c2.add(new JButton("+"));
        
        c.add(c2, BorderLayout.CENTER);
        
        //operações padrões
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,250);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        Calculadora janela = new Calculadora();
    }
}
