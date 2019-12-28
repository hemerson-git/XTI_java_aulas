package aulas.xti.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame{
    JCheckBox bold,italic;
    BotoesEditor openFile, addFile, save, clear;
    private Color cinzaClaro = new Color(200,200,215);
    public ControleTextArea(){
        super("Editor de texto");
        Container c = getContentPane();
        
        /* Caixa de texto */
        JTextArea texto = new JTextArea();
        texto.setBackground(cinzaClaro);
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        JScrollPane scroll = new JScrollPane(texto);
        c.add(scroll, BorderLayout.CENTER);
        
        //Barra de tarefas
        JPanel cWork = new JPanel();
        cWork.setLayout(new FlowLayout());
        cWork.setBackground(Color.BLACK);
        cWork.add(openFile = new BotoesEditor(new ImageIcon(getClass().getResource("images/open.png"))));
        cWork.add(addFile = new BotoesEditor(new ImageIcon(getClass().getResource("images/add.png"))));
        cWork.add(save = new BotoesEditor(new ImageIcon(getClass().getResource("images/save.png"))));
        cWork.add(clear = new BotoesEditor(new ImageIcon(getClass().getResource("images/clear.png"))));
        c.add(cWork, BorderLayout.NORTH);
        
        
        //Barra de personalização
        JPanel cPersonalization = new JPanel();
        cPersonalization.setBackground(Color.BLACK);
        bold = new JCheckBox("Bold");
        bold.setBackground(cinzaClaro);
        italic = new JCheckBox("Italic");
        italic.setBackground(cinzaClaro);
        cPersonalization.setLayout(new FlowLayout());
        cPersonalization.add(bold);
        cPersonalization.add(italic);
        c.add(cPersonalization, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ControleTextArea janela = new ControleTextArea();
    }
}
