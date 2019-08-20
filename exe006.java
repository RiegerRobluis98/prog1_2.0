import java.util.Scanner;
public class Exe006 {
    public static void main(String[] args) {
    double area, raio;
    Scanner key = new Scanner (System.in);    
    System.out.println("Informe o raio de uma circunferencia");
        raio = key.nextInt();
        area = 3.14 * (raio*raio);
            System.out.println("A area da Circunferencia é " + area);
            }
    
}
