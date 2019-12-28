package aulas.xti.refinamento;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame {

    JButton botao;

    public Aninhamento() {
        super("Aninhamento");
        Container c = getContentPane();

        botao = new JButton("OK");
        botao.addActionListener(new ListenerAninhado());
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Classe Anonima executa " + botao.getText());
            }
        });
                
        c.add(botao, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    public class ListenerAninhado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Classe Aninhada executa " + botao.getText());
        }

    }

    public static void main(String[] args) {
        Aninhamento janela = new Aninhamento();
        Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();
    }
}
