import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num>0) { //Se o número é maior que zero é positivo
            System.out.println("Seu Número é Positivo"); 
        }

        if (num<0) {
            System.out.println("Seu número é Negativo");
        }

        if (num==0) {
            System.out.println("Seu número é Zero kkkkkk");
        }
        sc.close();

    }
    
}
