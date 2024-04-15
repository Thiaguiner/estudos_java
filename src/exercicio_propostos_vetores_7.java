import java.util.Scanner;

public class exercicio_propostos_vetores_7 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[]nomes = new String[N];
        double[]notasprimeiro = new double[N];
        double[]notassegundo = new double[N];

        for (int i=0;i<N;i++){//primeiro fazendo a leitura dos dados
            nomes[i] = sc.next();
            notasprimeiro[i] = sc.nextDouble();
            notassegundo[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados: ");


        for(int i=0;i<N;i++){//fazendo à media e imprimindo os aprovados
            double media = (notasprimeiro[i] + notassegundo[i]) / 2;
            if (media >= 6){
                System.out.println(nomes[i]);
            }
        }


        sc.close();
    }
}
