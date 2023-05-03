import java.util.Scanner;

public class at3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Escreva a Temperatura em Celsius : ");
        double temp = sc.nextDouble();

        double calculo1 = (temp*1.8)+32;
        double calculo2 = (temp+273);

        if (temp==calculo1);{
            System.out.println("Temperatura em Fahrenheit: "+calculo1);
        }
        if (temp==calculo2);{
            System.out.println("Temperatura em Kelvin: "+calculo2);
        }

        sc.close();

    }

}
