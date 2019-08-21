import javax.swing.JOptionPane;

public class JavaApplication3 {
     public static void main(String[] args) {
String nome, sobrenome, cpf, endereco;
nome = JOptionPane.showInputDialog("Qual seu nome?");
sobrenome = JOptionPane.showInputDialog("Qual seu sobrenome?");
cpf = JOptionPane.showInputDialog("Qual o Numero do seu cpf?");
endereco = JOptionPane.showInputDialog("Qual seu endereco?");
JOptionPane.showMessageDialog(null,"Nome Completo: " + nome +" "+ sobrenome + "\n Endereco: " + endereco + "\n CPF: " + cpf);
    }
    
}
