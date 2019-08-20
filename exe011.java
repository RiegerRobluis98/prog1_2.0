import java.util.Scanner;
public class Exe006 {
    	public static void main(String[] args) {
	// Declarações
	Scanner key = new Scanner (System.in);
        double pol, mlm;
	// Entrada
            System.out.println("Digite um comprimento em polegadas");
            pol = key.nextInt();
	// Processamento
	mlm = pol * 25.4;
	// Saída
	           System.out.println("O Valor em milimetros é" + mlm);	
	}

}
