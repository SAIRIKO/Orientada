package lista1;

import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args){
        Locale.setDefault(new Locale("US"));
        Scanner Scanner = new Scanner(System.in);

        mesa[] mesas = new mesa[3];

        System.out.println("--------------Sistema de Bar--------------");
        
        for (int i=0; i< mesas.length; i++){
            mesas[i] = new mesa();

            System.out.print("\nDigite o número da "+(i+1)+"° mesa: ");
                mesas[i].numMesa = Scanner.nextInt();
                Scanner.nextLine();

            System.out.print("Digite o nome da refeição ou bebida: ");
                mesas[i].produto = Scanner.nextLine();
            
            System.out.printf("Digite o valor da refeição ou bebida: ");
                mesas[i].valor = Scanner.nextDouble();

            System.out.print("Digite a quantidade: ");
                mesas[i].qtd = Scanner.nextInt();

            Scanner.nextLine();
        }

        for (int i=0; i<mesas.length; i++){
            System.out.printf("\n-----Mesa %d-----",mesas[i].numMesa);
            System.out.println("\n");
            
            System.out.println("Produto: "+mesas[i].produto);
            System.out.printf("Valor: %.2f",mesas[i].valor);
            System.out.println("");
            System.out.println("Quantidade: "+mesas[i].qtd);

            mesas[i].valorTotal = (double) mesas[i].valor * mesas[i].qtd;

            System.out.printf("Valor total: %.2f",mesas[i].valorTotal);
            System.out.println();
        }
            System.out.println("\n----------------");
        Scanner.close();
    return;
    }
}
class mesa{
    public String produto;
    public double valor, valorTotal;
    public int qtd, numMesa;
}