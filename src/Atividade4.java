import atividade4.Func;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Atividade4 {
    public static <list> void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite quantos funcionarios serão cadastrados:");
        int n = sc.nextInt();

        List<Func> list = new ArrayList<>();


        for (int i = 0; i<n; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do funcionario (a):");
            String nome = sc.nextLine();
            System.out.println("Digite o id do funcionario (a):");
            Integer id = sc.nextInt();
            System.out.println("Digite o salario do funcionario (a):");
            Double salario = sc.nextDouble();

            Func lista = new Func(nome,id,salario);

            list.add(lista);
            }

        System.out.println("Digite o id do funcionario (a) que deseja fazer aumento:");
        Integer id2 = sc.nextInt();
        Integer pos = local (list,id2);
        if (pos == null) {
            System.out.println("Id inexistente!");}
        else
        {
            System.out.println("Quantos porcento de aumento: ");
            Integer porcentagem = sc.nextInt();
            list.get(pos).aumento(porcentagem);}

        System.out.println();
        System.out.println("Lista de funcionarios:");
        for (Func lista : list) {
            System.out.println(lista);}



sc.close();


    }

    public static Integer local (List <Func> list, int id) {
        for (int i = 0; i< list.size();i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
            } return null;
            }

        }



