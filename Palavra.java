import java.util.Scanner;

 public class  Palavra {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite uma palavra: ");
        String pala = sc.nextLine();
        

        if (pala.equals("JAVA")){ 
            System.out.println("Você escreveu a palavra JAVA!"); 
        }
        else {
            System.err.println("Está não é a palavra JAVA :( )");
        }

         
        sc.close();
    }
 }


 
