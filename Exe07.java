package lista02;

import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero");
        num = key.nextInt();
        if (num > 5 && num < 100){
            System.out.println("Está dentro do intervalo");
        }
        else {
            System.out.println("Não esta dentro do intervalo");
        }
    }
}
