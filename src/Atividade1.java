import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas que quer anotar a altura:");
        int n = sc.nextInt();

        double [] vect = new double[n];
        for (int i = 0 ; i<n ; i++) {
            System.out.println("Digite um valor para altura:");
            vect [i] = sc.nextDouble();}

        double soma = 0.0;
        for (int i = 0; i<n; i++) {
            soma = soma+ vect[i];}

        double media = soma/n;
        System.out.println("A media entre as alturas registradas foi de: " + media);
        sc.close();
        }
    }

