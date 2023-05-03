/*Operadores Relacionais: >, >=, <, <=
Operadores Lógicos - São booleanos (Sempre retornam true ou false)
E -> && (retorna verdadeiro se os dois lados forem verdadeiros);
OU -> || (retorna verdadeiro se pelo menos um dos lados for verdadeiro);
== -> Verifica se o número da esquerda é igual ao da direita
!= -> Verifica se os números são diferentes

IMPORTANTE!!
Para Comparar STRINGS usamos o método EQUALS.
 */


public class Relacional {

    public static void main(String[] args) {
       
        int idadeDeMaior = 18;
        int idadeProfessor = 31;
        int idadeAluno = 16;

        System.out.println("Professor é maior de idade? " + (idadeProfessor>idadeDeMaior));
        System.out.println("Aluno é menor de idade? " + (idadeAluno<idadeDeMaior));
        System.out.println("Aluno é menor de idade? " + (idadeDeMaior==18 && idadeAluno !=16));
        System.out.println("Aluno é menor de idade? " + (idadeDeMaior==18 || idadeAluno !=16));
        System.out.println("Aluno é menor de idade? " + (idadeDeMaior==18 && idadeAluno !=16));
    }
}
