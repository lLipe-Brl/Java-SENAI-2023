// Cadastro do Funcionário.

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome, endereço, telefone;
        double idade, horas, valor, salário;

        System.out.println("Digite seu Nome: ");
        nome= sc.nextLine();

        System.out.println("Digite seu Endereço: ");
        endereço= sc.nextLine();

        System.out.println("Digite sua Idade: ");
        idade= sc.nextDouble();

        System.out.println("Digite seu Telefone: ");
        telefone= sc.nextLine();

        System.out.println("Digite suas horas de trabalho: ");
        horas= sc.nextDouble();

        System.out.println("Digite o valor: ");
        valor= sc.nextDouble();

        salário = horas*valor;

        System.out.println("O seu salário será: "+salário);


        sc.close();


    }

}
