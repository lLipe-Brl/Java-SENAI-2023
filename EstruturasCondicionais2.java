import java.util.Scanner;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite sua grana atual, por favor amigo: ");
        double salario = sc.nextDouble();
        
        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();

        int idadeDeMaior = 18;
        double salarioMinimo = 1320;

        //Maior de Idade

        if (salario>salarioMinimo && idade>=idadeDeMaior){
            System.out.println("Você é Maior de Idade e ganha mais de um salário Mínimo! :)");

        }

        if (salario<salarioMinimo && idade>=idadeDeMaior){
            System.out.println("Você é Maior de Idade e ganha menos um salário Mínimo! :(");

        }

        if (salario==salarioMinimo && idade>=idadeDeMaior){
            System.out.println("Você é Maior de Idade e ganha um salário Mínimo! :|");

        }

        //Menor de Idade

        if (salario>salarioMinimo && idade<idadeDeMaior){
            System.out.println("Você é Menor de Idade e ganha mais um salário Mínimo! :|");

        }

        if (salario<salarioMinimo && idade<idadeDeMaior){
            System.out.println("Você é Menor de Idade e ganha menos que um salário Mínimo! :(");

        }

        if (salario==salarioMinimo && idade<idadeDeMaior){
            System.out.println("Você é Menor de Idade e ganha um salário Mínimo! :|");

        }
        sc.close();
    }
}
