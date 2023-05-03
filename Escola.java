import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu Telefone: ");
        double telefone = sc.nextDouble();

        System.out.println("Digite sua Nota: ");
        double nota = sc.nextDouble();

        System.out.println("Digite suas Faltas: ");
        int faltas = sc.nextInt();

    

        //Notas

        if ((nota>=5.1 && nota<=10) && faltas<=4){
            System.out.println("Aluno Aprovado! :)");

        }

        if (nota>=5 && nota>=5 && faltas<=19){
            System.out.println("Aluno de Recuperação! :|");

        }

        if (nota<5|| faltas>=20){
            System.out.println("Aluno Reprovado! :(");

        }


    }
}

