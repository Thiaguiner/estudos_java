import java.util.Scanner;

public class exercicio_propostos_vetores_5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double [] vet = new double[N];

        for (int i = 0;i<N;i++){
            vet[i] = sc.nextDouble();
        }
        double somaDosPares =0;
        int quantidadeDePares =0;
        for (int i =0;i <N;i++){
            if (vet[i] % 2 ==0){
                somaDosPares += vet[i];
                quantidadeDePares++;
                System.out.println(vet[i]);
            }
        }
        System.out.println();

        if (quantidadeDePares ==0){
            System.out.println("Nao tem nenhum par");
        }else{
            double media = somaDosPares / quantidadeDePares;
            System.out.println(media);
        }

        sc.close();
    }
}
