
package lista02;

import javax.swing.JOptionPane;

public class Exe04 {
    public static void main(String[] args) {
        int kiloWh;
        double valorOriginal, valorFinal = 0, percentual;
      percentual = 10.0 / 100.0;
        kiloWh = Integer.parseInt(JOptionPane.showInputDialog("Digite o Nº de kWh gasto: "));
               valorOriginal = (kiloWh * 1.50);
       JOptionPane.showMessageDialog(null,"Valor: " + valorOriginal);
               if (kiloWh > 100) {
       valorFinal = valorOriginal  + (percentual * valorOriginal);
               }
    JOptionPane.showMessageDialog(null,"Valor com Multa: " + valorFinal);
    }
 
}
