package lista1;

import java.util.Scanner;

public class atv2 {
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("-------------Atividade 2-------------\n");

        System.out.print("Digite o nome do professor: ");
            String nomeProfessor = Scanner.nextLine();

        System.out.print("\nDigite o nome do aluno: ");
            String nomeAluno = Scanner.nextLine();

        System.out.print("\nDigite a nota do 1° Semestre: ");
            double n1 = Scanner.nextDouble();
         System.out.print("\nDigite a nota do 2° Semestre: ");
            double n2 = Scanner.nextDouble();

        if (n1 > 10 || n1 < 0 || n2 >10 || n2 < 0){
            System.out.println("\n--------Nota inválida!--------\n\n");
                main(args);
        }
        double media = (n1 + n2) / 2;

        System.out.println("Professor: "+nomeProfessor+"\nAluno: "+nomeAluno+"\n1° Semestre: "+n1+"\n2° Semestre: "+n2+"\nMédia: "+media);
        Scanner.close();
    }
}
