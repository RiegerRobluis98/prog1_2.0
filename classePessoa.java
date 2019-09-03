
package pessoa;

import java.util.Scanner;
import javax.swing.JOptionPane;

class Pessoa{
String nome;
String CPF;
int idade;
String Endereco;
double dinheiro;

void Info(){
System.out.println("Nome: " + this.nome + "\nCPF: " + this.CPF + "\nIdade: " + this.idade + "\nEndereco: " + this.Endereco +"\nDinheiro: "+ this.dinheiro);
}
}
public class classePessoa {

    public static void main(String[] args) {
       Scanner key = new Scanner (System.in);
        Pessoa aluno1 = new Pessoa();
       aluno1.nome = "Luiz";
       aluno1.CPF = "0504780";
       aluno1.idade = 21;
       aluno1.Endereco = "Rua J";
       aluno1.dinheiro = 100;
       Pessoa aluno2 = new Pessoa();
       aluno2.nome = JOptionPane.showInputDialog("Digite seu Nome");
       aluno2.CPF = JOptionPane.showInputDialog("Digite seu CPF");
       aluno2.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
       aluno2.Endereco = JOptionPane.showInputDialog("Digite seu Endereco");
       aluno2.dinheiro = Integer.parseInt(JOptionPane.showInputDialog("Digite seu Dinheiro"));
       aluno1.Info();
       aluno2.Info();
        //System.out.println("Nome: " + aluno2.nome + "\nCPF: " + aluno2.CPF + "\nIdade: " + aluno2.idade + "\nEndereco: " + aluno2.Endereco +"\nDinheiro: "+ aluno2.dinheiro);
    }
    
}
