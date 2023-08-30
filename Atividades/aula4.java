package Atividades;

import java.util.Scanner;

public class aula4{
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);

        double n1 = 4,n2 = 6.5 ,n3 = 7.5 ,n4 = 2 ,n5 = 1.5;
        double valorTotal;

        System.out.println("----------------Tabela de Preços----------------");
        System.out.println("| Código            Produto             Preço  |");
        System.out.println("|--------------------------------------------- |");
        System.out.println("|   1            Cachorro-Quente       R$:4,00 |");
        System.out.println("|   2            X-Bacon               R$:6,50 |");
        System.out.println("|   3            X-Tudo                R$:7,50 |");
        System.out.println("|   4            Torresmo Fresco       R$:2,00 |");
        System.out.println("|   5            Refrigerante          R$:1,50 |");
        System.out.println("------------------------------------------------");

        System.out.print("\nDigite o código do produto: ");
            int cod = Scanner.nextInt();

            if (cod < 1 || cod > 5){
                System.out.println("Código inválido!!\n");
                    main(args);
            }

        System.out.print("\nDigite a quantidade: ");
            int qtd = Scanner.nextInt();

        System.out.println(" ");

            if (qtd < 1 || qtd > 20){
                System.out.println("Quantidade inválida!!\n");
                    main(args);
            }

        switch (cod){
            case 1:
                valorTotal = (double) n1 * qtd;
                if (qtd == 1){
                    System.out.printf(qtd+" porção do produto "+cod+"\n"+qtd+" x R$: %.2f",valorTotal);
                } else{
                    System.out.printf(qtd+" porções do produto "+cod+"\n"+qtd+" x R$: %.2f = R$: %.2f",n1,valorTotal);
                }
                break;
            case 2:
                valorTotal = (double) n2 * qtd;
                if (qtd == 1){
                    System.out.printf(qtd+" porção do produto "+cod+"\n"+qtd+" x R$: %.2f",valorTotal);
                } else{
                    System.out.printf(qtd+" porções do produto "+cod+"\n"+qtd+" x R$: %.2f = R$: %.2f",n2,valorTotal);
                }
                break;
            case 3:
                valorTotal = (double) n3 * qtd;
                if (qtd == 1){
                    System.out.printf(qtd+" porção do produto "+cod+"\n"+qtd+" x R$: %.2f",valorTotal);
                } else{
                    System.out.printf(qtd+" porções do produto "+cod+"\n"+qtd+" x R$: %.2f = R$: %.2f",n3,valorTotal);
                }
                break;
            case 4:
                valorTotal = (double) n4 * qtd;
                if (qtd == 1){
                    System.out.printf(qtd+" porção do produto "+cod+"\n"+qtd+" x R$: %.2f",valorTotal);
                } else{
                    System.out.printf(qtd+" porções do produto "+cod+"\n"+qtd+" x R$: %.2f = R$: %.2f",n4,valorTotal);
                }
                break;
            case 5:
                valorTotal = (double) n5 * qtd;
                if (qtd == 1){
                    System.out.printf(qtd+" porção do produto "+cod+"\n"+qtd+" x R$: %.2f",valorTotal);
                } else{
                    System.out.printf(qtd+" porções do produto "+cod+"\n"+qtd+" x R$: %.2f = R$: %.2f",n5,valorTotal);
                }
                break;
            default:
                System.out.println("Erro no sistema!");
                main(args);
        }

        Scanner.close();
    return;
    }
}