package aulas.xti.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {

    JButton clique;

    public Eventos() {
        super("Eventos");
        Container c = getContentPane();
        c.add(clique = new JButton("Clique Aqui"));
        clique.addActionListener(this);

        //operaçoes padroes 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (clique.getText().equals("Clicou")) {
            clique.setText("Clique Aqui");
        } else {
            clique.setText("Clicou");
        }

    }

    public static void main(String[] args) {
        Eventos janela = new Eventos();
    }

}
