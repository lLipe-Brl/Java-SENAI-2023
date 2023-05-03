import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu Número: ");
        int num = sc.nextInt();

        if (num>0) { 
            System.out.println("Seu Número é Positivo"); 
        }

        else if (num<0) {
            System.out.println("Seu número é Negativo");
        }

        sc.close();

    }
}
