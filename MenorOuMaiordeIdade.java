import java.util.Scanner;

public class MenorOuMaiordeIdade {
    
    public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
System.out.println("Digite a sua Idade: ");
        
        int idade = sc.nextInt();
        int idadeMaior = 18;
        
        if (idade>=idadeMaior) {  //Se for verdade
            System.out.println("O Você é Maior de Idade!");
 
        }
        else { // Se não for
            System.out.println("Você ainda é leite com Pêra :)");
        }
    
        sc.close();

    }
}
