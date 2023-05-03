// Importando o Scanner

import java.util.Scanner;

public class Operadores{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4;
        int soma, sub, div, mult;
        int resto =30;

        System.out.println("Resto da Divisão: "+resto%4);
        System.out.println("Resto da Divisão 2: "+resto%5);
        System.out.println("Resto da Divisão 3 : "+resto%9);
        System.out.println("Digite o 1 número");
        n1 = sc.nextInt();
        System.out.println("Digite o 2º número");
        n2 = sc.nextInt();
        System.out.println("Digite o 3º número");
        n3 = sc.nextInt();
        System.out.println("Digite o 4º número");
        n4 = sc.nextInt();

        // Operadores Aritméticos -> +, -, *, /, resto (%)
        soma = n1+n2+n3+n4;
        sub = n1 -n2 -n3 -n4;
        mult = n1*n2*n3*n4;
        div = n1/n2/n3/n4;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
        
sc.close();
    }








}
