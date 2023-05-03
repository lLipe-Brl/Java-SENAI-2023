/*Programa que calcula média dos alunos. */

// Importação necessária para utilizar o Scanner.

// SEMPRE PRECISO COLOCAR ESSA LINHA!!
import java.util.Scanner; // Para que eu possa trabalhar com entrada de dados via teclado 

public class Media {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in); // Sempre escrever assim.

double nota1, nota2, nota3, media, rm;// Declaração das Variáveis.

System.out.println("Digite a 1ª Nota: ");
nota1= sc.nextDouble();

System.out.println("Digite a 2ª Nota: ");
nota2= sc.nextDouble();

System.out.println("Digite a 3ª Nota: ");
nota3= sc.nextDouble();

media = (nota1+nota2+nota3)/3;

System.out.println("Digite o seu RM: ");
rm= sc.nextDouble();

System.out.println("O aluno Filipe Marin obteve média: "+media+" :) ou :(");
        
sc.close();
    }
    
}
