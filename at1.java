import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Escreva o primeiro número: ");
        int num1 = sc.nextInt();
        
        System.out.println("Escreva o segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.println("Escreva o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1>num3&&num2>num3) {
            System.out.println(num1+ " é o número maior");
        }
        if (num2>num1 && num2>num3) {
            System.out.println(num2+" é o número maior");
        }
if(num3>num1 && num3>num2){
            System.out.println(num3+" é o número maior");
        }else if (num1==num2 && num1==num3)
        {
            System.out.println(" Todos são iguais");
        }

        
        
        
        
        sc.close();
    }
}
