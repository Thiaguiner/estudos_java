import java.util.Scanner;

public class exercicio_propostos_vetores_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []vet = new int[N];

        for(int i=0;i<N;i++){
            vet[i] = sc.nextInt();
        }
        for (int i=0;i<N;i++){
            if (vet[i] %2==0){
                System.out.print(vet[i]+ " ");
            }
        }
        System.out.println();

        int quantidadeDePar =0;
        for (int i=0;i<N;i++){
            if (vet[i] %2==0){
                quantidadeDePar++;
            }
        }
        System.out.println(quantidadeDePar);
        sc.close();
    }
}
