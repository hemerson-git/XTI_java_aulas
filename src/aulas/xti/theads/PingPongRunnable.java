package aulas.xti.theads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PingPongRunnable implements Runnable {

    String palavra;
    long tempo;

    public PingPongRunnable(String palavra, long tempo) {
        this.palavra = palavra;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(palavra + " ");
                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(PingPongRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Runnable ping = new PingPongRunnable("ping", 1500);
        Runnable pong = new PingPongRunnable("pong", 2000);

        new Thread(ping, "ping").start();
        new Thread(pong, "pong").start();

        System.out.println("Ver Threads");
    }
}
