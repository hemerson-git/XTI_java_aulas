package aulas.xti.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
    public Janela(){
        super("Minha janela");
        JButton botao = new JButton("Clique");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //operaçao ao fechar janela
        getContentPane().add(botao); // cria botão
        setSize(300,300); // configura as dimensões da janela
        setVisible(true); //muda a visibilidade
    }
    
    public static void main(String[] args) {
        Janela janela = new Janela();
    }
}
