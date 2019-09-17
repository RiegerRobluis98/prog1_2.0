package lista02;

import javax.swing.JOptionPane;

public class Exe03 {

    public static void main(String[] args) {
        int din;
        din = Integer.parseInt(JOptionPane.showInputDialog("Quanto Dinheiro vc tem sobrando? "));
        if (din >= 30) {
            JOptionPane.showMessageDialog(null, "Voce Poderia ir ao Cinema !!!");
        }
        if (din < 30) {
            JOptionPane.showMessageDialog(null, "Ihh, Vai Ficar em casa vendo tv mesmo...");
        }
    }
}
