import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Vamos criar uma matriz e para isso preciso que digite o valor para o numero de colunas e linhas:");
        int n = sc.nextInt();
        int [][] matriz = new int [n][n];
        for (int i = 0; i<n; i++){
            for (int i2= 0; i2<n; i2++){
                System.out.println("Digite um valor:");
                matriz [i][i2]= sc.nextInt();
            }
        }
        System.out.println("Valores encontrados na diagonal central: ");
        for (int i = 0; i<n;i++) {
            System.out.println(matriz[i][i]+ " ");
        }

    sc.close();}
}
