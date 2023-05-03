import java.util.Scanner;

public class Atividade{

public static void main(String[] args) {



Scanner sc = new Scanner(System.in);

double valor, prest, desc, juros, valorT, presTT, valorJuros, Presv, valorP;




System.out.println("Digite o Valor da Compra: ");
valor = sc.nextDouble();

System.out.println("Quantidade de Prestações: ");
prest = sc.nextDouble();

System.out.println("Valor do desconto à vista (Sem %): ");
desc = sc.nextDouble()/100;

System.out.println("Valor dos juros por prestação (Sem %): ");
juros = sc.nextDouble()/100;

valorT = valor-(valor*desc);
Presv = (valor/prest);
presTT = Presv+(Presv*juros);
valorJuros = Presv*juros;
valorP = presTT*prest;

System.out.println("Valor Total à Vista: " +valorT);
System.out.println("Valor Parcelado: "+presTT);
System.out.println("Valor dos juros nas Prestações: "+valorJuros);
System.out.println("Valor Total com Juros (se a compra for parcelada!): "+valorP);

 sc.close();

}

}