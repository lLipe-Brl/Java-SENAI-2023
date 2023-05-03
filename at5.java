import java.util.Scanner;

public class at5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

System.out.println("Escreva a primeira idade: ");
int idade1 = sc.nextInt();

System.out.println("Escreva a segunda idade: ");
int idade2 = sc.nextInt();


if (idade1>idade2) {
    
    System.out.println(idade1+" essa idade é maior que a segunda idade");
}
else if (idade1<idade2){
    System.out.println(idade2+" essa idade é maior que a primeira");
}
sc.close();
  }  
}
