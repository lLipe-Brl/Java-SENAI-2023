// Tipos de Variáveis em Java

/*
 * String -> Armazena texto
 * char -> Armazena uma única letra
 * int -> Números inteiros
 * float -> Números decimais
 * double -> Números decimais. Maior precisão
 */

 /*Regras para criar variáveis
  * Toda Varável DEVE começar com letra minúscula
  * Não pode haver espaço no nome da variável
  nomeAluno, enderecoCliente, produtoAdquirido

  */
 
public class Exemplo01{

    public static void main(String[] args) {
       
        String nome = "Filipe marin";
        int idade = 16;
        boolean chuva = true; // Em variáveis booleanas eu uso true ou false
        char letra = 'F'; // Todo char DEVE estar com aspas simples ''
        double salário = 12377.82;
        float altura = (float) 1.71; // Estou convertendo um double para float 

        System.out.println("Meu nome é: " +nome);
        System.out.println("Minha idade é: " +idade);
        System.out.println("Está chovendo? "+chuva);
        System.out.println("Inicial no meu Nome: "+letra);
        System.out.println("Meu salário é: "+salário);
        System.out.println("Minha altura é: "+altura+" Metros");











        
    }
}