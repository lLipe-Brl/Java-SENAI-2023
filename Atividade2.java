import java.util.Scanner;

public class Atividade2 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //Variáveis

        int idadeMaior = 18;
        int salarioMin = 1320;
        int salario = 1000;
        Double alturaMin = 1.8;
        Double altura = 1.0;
        int pesoMin = 60;
        int peso = 70;
        String nome = "Filipe";
        String generoMeu = "m"; 
        int idadeMenor = 16;
        

        //Pedindo Informações

        System.out.println("Digite seu Nome: ");
        String meuNome = sc.nextLine();
        System.out.println("Digite seu Gênero: ");
        String genero = sc.nextLine();
    
        System.out.println("Digite sua Idade: ");
        idadeMenor= sc.nextInt();
        System.out.println("Digite seu Salário: ");
        salario= sc.nextInt();

        System.out.println("Digite sua Altura: ");
        altura= sc.nextDouble();
        System.out.println("Digite seu Peso: ");
        peso= sc.nextInt();

        //Aplicação da Igualdade de Strings

        boolean iguais = nome.equals(meuNome);
        boolean semelhante = generoMeu.equals(genero);
        
        String mensagem = (iguais==true)?"True" : "False";
        String mensagem2 = (semelhante==true)?"True": "False";
        
        //Verdadeiro ou Falso

        System.out.println("========");
        System.out.println("Seu nome é igual ao meu? " + (mensagem));
        System.out.println("Seu Gênero é m? " + (mensagem2));
        
        System.out.println("Sua idade é maior ou menor? " + (idadeMaior==18 && idadeMenor !=10));
        System.out.println("Seu salário é maior que o mínimo? " + (salarioMin==1320 && salario !=1000));
        System.out.println("Sua altura é maior que 1.8m? " + (alturaMin==1.80 && altura !=1.0));
        System.out.println("Seu peso é maior que 60kg? " + (pesoMin==60 && peso !=70));
        

        sc.close();

        
     








    }
}
