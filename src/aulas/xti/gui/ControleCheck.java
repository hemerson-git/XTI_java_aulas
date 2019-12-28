package aulas.xti.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCheck extends JFrame implements ItemListener{
    JLabel texto;
    JCheckBox bold, italic;
    public ControleCheck(){
        super("Checkbox");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        c.add(texto = new JLabel("Veja a fonte mudar"));
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        
        c.add(bold = new JCheckBox("Bold"));
        bold.addItemListener(this);
        c.add(italic = new JCheckBox("Italic"));
        italic.addItemListener(this);
        
        //comportamento padrão da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,100);
        setResizable(false);
        setVisible(true);
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(bold.isSelected() && italic.isSelected()){
            texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 16));
        }else if(italic.isSelected()){
            texto.setFont(new Font("Serif",Font.ITALIC, 18));
        }else if(bold.isSelected()){
            texto.setFont(new Font("Serif", Font.BOLD, 18));
        } else{
            texto.setFont(new Font("Serif", Font.PLAIN, 18));
        }
    }
    
    public static void main(String[] args) {
        ControleCheck janela = new ControleCheck();
    }

}
