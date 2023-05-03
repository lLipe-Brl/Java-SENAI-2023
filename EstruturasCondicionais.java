import java.util.Scanner;

public class EstruturasCondicionais {
    
    public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
System.out.println("Digite a sua Idade: ");
        
        int idade = sc.nextInt();
        int idadeDeMaior = 18;
        
        if (idade>=idadeDeMaior) {  //Se for verdade
            System.out.println("O Aluno é Maior de Idade:");
 
        }
        else { // Se não for
            System.out.println("O Aluno é Menor de Idade :)");
        }
    
        sc.close();

    }
}
