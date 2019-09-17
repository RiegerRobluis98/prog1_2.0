package lista02;

import java.util.Scanner;

public class Exe06 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num;
        System.out.println("Digite um Numero");
        num = key.nextInt();
        if (num > 0) {
            System.out.println("O numero é positivo");
        }
        if (num == 0) {
            System.out.println("Zero");
        }
        if (num < 0) {
            System.out.println("o numero é negativo");
        }
    }
}
