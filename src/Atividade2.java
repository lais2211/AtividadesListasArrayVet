import atividade2.Produtos;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos que iram ser cadastrados:");
        int n = sc.nextInt();

        Produtos [] vetor = new Produtos[n];
        for (int i = 0; i< vetor.length; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do produto:");
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto:");
            double preço = sc.nextDouble();
            vetor[i]= new Produtos(nome, preço);}

        double soma= 0.0;
        for (int i = 0 ; i< vetor.length; i++ )
        { soma = soma + vetor[i].getPreço();}

        double media = soma/n;

        System.out.println("A media de valor das mercadorias é de: "+ media);

        sc.close();
        }

    }

