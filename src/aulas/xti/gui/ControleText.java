package aulas.xti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleText extends JFrame{
    JButton cancel,ok;
    JTextField login;
    JPasswordField senha;
    public ControleText(){
        super("Textos e Senhas");
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));
        c.add(new JLabel("Login:"));
        c.add(login = new JTextField());
        c.add(new JLabel("Senha:"));
        c.add(senha = new JPasswordField());
        c.add(ok = new JButton("Logar-se"));
        ok.addActionListener(new BotaoOkListener());
        c.add(cancel = new JButton("Cancel"));
        cancel.addActionListener(new BotaoCancelListener());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,150);
        setVisible(true);
    }
    
    class BotaoOkListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            String s = "Login: " + login.getText() +
                       "\nPassword: " + new String(senha.getPassword());
                       
            JOptionPane.showMessageDialog(null, s);
        }
    }
    
    class BotaoCancelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            login.setText("");
            senha.setText("");
        }
        
    }
    
    public static void main(String[] args) {
        ControleText janela = new ControleText();
    }
}
