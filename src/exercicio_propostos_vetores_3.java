import java.util.Scanner;

public class exercicio_propostos_vetores_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]A = new int[N];
        int[]B = new int[N];

        for (int i =0;i<N;i++){//lendo o vetor A
            A[i] = sc.nextInt();
        }
        for (int i =0;i<N;i++){//lendo o vetor B
            B[i] = sc.nextInt();
        }

        //gerando o vetor C
        int[]C = new int[N];
        for (int i=0;i<N;i++){
            C[i] = A[i] + B[i];
        }
        for (int i=0;i<N;i++){
            System.out.println(C[i] + " ");//imprimindo o resultado final
        }
        System.out.println();
        sc.close();
    }
}
