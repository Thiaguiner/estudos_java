import java.util.Scanner;

public class exercicio_propostos_vetores_4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[]vet = new double[N];

        for (int i =0;i<N;i++){
            vet[i] = sc.nextDouble();
        }
        for (int i =0;i<N;i++){
            System.out.println(vet[i]);
        }
        double soma =0;
        for (int i =0; i<N; i++){
            soma += vet[i];
        }
        double media = soma / N;
        System.out.println();
        System.out.println(media);

        sc.close();
    }
}
