package app;

import view.LoginFrame;

public class Main {
    public static void main(String[] args) {
        // opcional: definir look & feel
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) { /* ignore */ }
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
}

