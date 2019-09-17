package lista02;

import javax.swing.JOptionPane;

public class Exe01 {

    public static void main(String[] args) {

        String timeA, timeB;
        timeA = JOptionPane.showInputDialog("Digite o nome do 1o time:");
        timeB = JOptionPane.showInputDialog("Digite o nome do 2º time:");
        
        int golsA, golsB;
        golsA = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols " + timeA + " fez? "));
        golsB = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols " + timeB + " fez? "));
        if (golsA > golsB) {
            JOptionPane.showMessageDialog(null, "Vencedor: " + timeA);
        }
        if (golsB > golsA){
        JOptionPane.showMessageDialog(null, "Vencedor: " + timeB);
        }
        if (golsA == golsB) {
        JOptionPane.showMessageDialog(null, "EMPATE");
        }
    }
}
