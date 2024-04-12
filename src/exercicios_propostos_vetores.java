import java.util.Scanner;

public class exercicios_propostos_vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];


        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
        }
        double maiorNumero = vet[0];
        for (int i = 1; i < N; i++) {
            if (vet[i] > maiorNumero) {
                maiorNumero = vet[i];
            }
        }
        System.out.println(maiorNumero);

        sc.close();
    }
}
