package ipesu.apresentacao.gui;

import javax.swing.JFrame;

public class Conversor {

    public static void main(String[] args) {
        FormConversor conversor = new FormConversor();
        conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        conversor.setSize(300, 150);
        conversor.setVisible(true);
    }
}
