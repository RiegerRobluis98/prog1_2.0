import java.util.Scanner;
public class ExeClass01 {

	public static void main(String[] args) {
	// Declarações
		Scanner key = new Scanner(System.in);
		int val1, val2, res;
	// Entrada
		System.out.println("Digite dois Valores:");
		val1 = key.nextInt();
		val2 = key.nextInt();
	// Processamento
		res = val1 * val2;
	// Saída
		System.out.println("O Resultado é "+res);
	}

}
