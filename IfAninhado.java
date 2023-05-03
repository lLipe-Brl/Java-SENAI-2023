import java.util.Scanner;

public class IfAninhado {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);

         System.out.println("Digite seu Número: ");
         int num = sc.nextInt();

         if (num>0) {
            if (num%2==0) {
                System.out.println("Número Par e Positivo!");
            }else{
                System.out.println("Impar e positivo");
            }
         }
         else if (num<0) {
            if (num%2==0){
                System.out.println("Número Par e Negativo");
            } else{
                System.out.println("Número Impar e Negativo");
            }
        }   else{
            System.out.println("É Zero fi!");

        }

        sc.close();
    }
}

