package lista1;

import java.util.Scanner;
import java.util.Locale;

public class atv1{
    public static void main(String[]args) {
        Scanner Scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("US"));

        System.out.println("--------------Atividade 1--------------");
        System.out.print("Digite seu nome completo: ");
            String nome = Scanner.nextLine();

        System.out.print("\nDigite dois valores inteiros\n1° valor: ");
            int n1 = Scanner.nextInt();
        System.out.print("2° Valor: ");
            int n2 = Scanner.nextInt();

        double resultado = (double) n1 / n2;
        System.out.printf("\n"+nome+" | "+n1+" / "+n2+" = "+resultado);
    Scanner.close();
    }

}