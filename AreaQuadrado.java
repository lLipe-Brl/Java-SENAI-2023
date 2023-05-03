//Calculo da Área do Quadrado

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado1, lado2, area;

        System.out.println("Digite o 1º número: ");
        lado1= sc.nextDouble();

        System.out.println("Digite o 2º número: ");
        lado2= sc.nextDouble();

        area = lado1*lado2;

        System.out.println("A área do Quadrado é: " + area + " cm²");
        sc.close();
    }
    
}
