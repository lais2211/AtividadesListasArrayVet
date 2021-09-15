import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos construir uma matrix, para isso digite o numero de linhas:");
        int n = sc.nextInt();
        System.out.println("Agora digite o numero de colunas:");
        int m = sc.nextInt();

        int [][] matrix= new int [n][m];

        for (int i = 0; i<matrix.length;i++){
            for (int i2 = 0; i2<matrix[i].length;i2++){
                System.out.println("Digite um valor:");
                matrix [i][i2]= sc.nextInt();
            }
        }
        System.out.println("Digite o valor que deseja encontrar na matrix:");
        int x= sc.nextInt();

        for (int i= 0; i< matrix.length;i++) {
            for (int i2 = 0 ; i2< matrix[i].length; i2++) {
                if (matrix[i][i2] == x) {
                    System.out.println("Posição na matrix: " + i+ ","+ i2);}
                    else if (i2>0)
                    {
                        System.out.println("Esquerda: "+ matrix[i][i2-1]);
                }
                    else if (i>0) {
                        System.out.println("Acima: " + matrix[i-1][i2]);}
                    else if (i2< matrix[i].length-1)
                    {
                        System.out.println("Direita: " + matrix[i][i2+1]);}
                    else if (i<matrix.length-1){
                        System.out.println("Esquerda: "+ matrix[i+1][i2]);}
                    }
           }
           sc.close(); }
        }


