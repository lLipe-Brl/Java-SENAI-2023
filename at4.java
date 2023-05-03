import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

int jan = 31;
int fev = 28;
int mar = 31;
int abr = 30;
int mai = 31;
int jun = 30;
int jul = 31;
int ago = 31;
int set = 30;
int out = 31;
int nov = 30;
int dez = 31;



        System.out.println("Escreva um número ente 1 e 12 que representam os meses: ");
        int num = sc.nextInt();

        if (num==1){
            System.out.println("O mês de Janeiro tem: "+jan+" dias");

        }
        if (num==2){
            System.out.println("O mês de Janeiro tem: "+fev+" dias");

        }
        if (num==3){
            System.out.println("O mês de Janeiro tem: "+mar+" dias");

        }
        if (num==4){
            System.out.println("O mês de Janeiro tem: "+abr+" dias");

        }
        if (num==5){
            System.out.println("O mês de Janeiro tem: "+mai+" dias");

        }
        if (num==6){
            System.out.println("O mês de Janeiro tem: "+jun+" dias");

        }
        if (num==7){
            System.out.println("O mês de Janeiro tem: "+jul+" dias");

        }
        if (num==8){
            System.out.println("O mês de Janeiro tem: "+ago+" dias");

        }
        if (num==9){
            System.out.println("O mês de Janeiro tem: "+set+" dias");

        }
        if (num==10){
            System.out.println("O mês de Janeiro tem: "+out+" dias");

        }
        if (num==11){
            System.out.println("O mês de Janeiro tem: "+nov+" dias");

        }
        if (num==12){
            System.out.println("O mês de Janeiro tem: "+dez+" dias");

        }

sc.close();

    }
}
