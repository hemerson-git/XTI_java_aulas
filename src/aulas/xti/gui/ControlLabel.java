package aulas.xti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControlLabel extends JFrame{
    public ControlLabel(){
        super("Controles e Labels");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        //Label simples com tool tip
        JLabel simples = new JLabel("Label Simples");
        simples.setToolTipText("Meu ToolTip");
        c.add(simples);
        
        //Label com fonte modificada
        Font fonte = new Font("Serif", Font.BOLD | Font.ITALIC, 18);
        JLabel label = new JLabel("Label Simples");
        label.setFont(fonte);
        label.setForeground(Color.BLUE);
        c.add(label);
        
        //Label com Icone
        ImageIcon icon = new ImageIcon(getClass().getResource("images/anonymous.png"));
        JLabel imagem = new JLabel(icon);
        c.add(imagem);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        ControlLabel janela = new ControlLabel();
    }
}
