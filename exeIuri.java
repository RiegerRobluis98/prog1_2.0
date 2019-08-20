import javax.swing.JOptionPane;

public class JavaApplication3 {
    public static void main(String[] args) {
      String nome, sobrenome, endereco, cpf;
      nome = JOptionPane.showInputDialog("Qual seu nome");
      sobrenome = JOptionPane.showInputDialog("Qual seu Sobrenome? ");
       cpf = JOptionPane.showInputDialog("Qual seu CPF?");
       endereco = JOptionPane.showInputDialog("Qual seu Endereco?");
    JOptionPane.showMessageDialog(null, nome +" \n"+ sobrenome + " \n" + endereco + " \n" + cpf);
   
    }
    
}
