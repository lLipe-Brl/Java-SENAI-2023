import java.util.Scanner;

public class AprovOuReprov {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int media;

        System.out.println("Digite sua 1ª Nota: ");
        int nota = sc.nextInt();

        System.out.println("Digite sua 2ª Nota: ");
        int nota2 = sc.nextInt();

        media = (nota+nota2)/2;

        System.out.println("Sua média foi: " +media);

        System.out.println("Digite seu número de faltas: ");
        int faltas = sc.nextInt();


        if (media>=6 && nota<=10) {
            if(faltas<=75);{
            System.out.println("Aluno Aprovado! :)");
            }
        }else{
            System.out.println("Aluno Reprovado! :|");

    }
    sc.close();
}
