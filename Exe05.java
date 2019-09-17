package lista02;

import javax.swing.JOptionPane;

public class Exe05 {

    public static void main(String[] args) {
        double n1, n2, n3, n4, med;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 1ª Nota: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 2ª Nota: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 3ª Nota: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a 4ª Nota: "));
        med = (n1+n2+n3+n4)/4;
        if (med >= 8.5){
        JOptionPane.showMessageDialog(null, "Conceito A");
        }
     if (med >7 && med < 8.5){
        JOptionPane.showMessageDialog(null, "Conceito B");
        }
      if (med >5 && med < 7){
        JOptionPane.showMessageDialog(null, "Conceito C");
        }
      if (med < 5){
        JOptionPane.showMessageDialog(null, "Conceito D");
        }
    }
}
