package lista02;

import javax.swing.JOptionPane;

public class Exe02 {

    public static void main(String[] args) {
        int numConta, saldo, deb, cred, saldoAtual;
        numConta = Integer.parseInt(JOptionPane.showInputDialog("Nº da Conta"));
        saldo = Integer.parseInt(JOptionPane.showInputDialog("Saldo:"));
        deb = Integer.parseInt(JOptionPane.showInputDialog("Debito"));
        cred = Integer.parseInt(JOptionPane.showInputDialog("Credito"));
        saldoAtual = saldo - deb + cred;
        if (saldoAtual >= 0) {
            JOptionPane.showMessageDialog(null,"Saldo: " + saldoAtual + "\nSaldo Positivo");
        }
        if (saldoAtual < 0) {
            JOptionPane.showMessageDialog(null,"Saldo: " + saldoAtual + "\nSaldo Negativo");
        }
    }
}
