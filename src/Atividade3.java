import atividade3.Aluguel;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Aluguel [] vetor= new Aluguel[10];
        System.out.println("Digite o numero de pessoas que iram ser hospedadas:");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("Digite o nome da pessoa:");
            String nome = sc.nextLine();
            System.out.println("Digite o email da pessoa:");
            String email = sc.nextLine();
            System.out.println("Digite o apartamento que ela ira alugar:");
            int ap = sc.nextInt();
            vetor [ap]= new Aluguel(nome,email);}

            sc.nextLine();
        System.out.println("Quartos ocupados:");
        for (int i=0; i< vetor.length; i++) {
            if (vetor[i]!= null) {
                System.out.println(i+ ": "+ vetor[i]);}

            sc.close();}
        }




        }


