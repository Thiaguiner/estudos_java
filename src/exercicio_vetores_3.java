import java.util.Scanner;

public class exercicio_vetores_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[]idades = new int[N];
        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) { //for para ler nome,idade e altura
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
        }
        double soma =0;
        for(int i =0; i< N; i++){//for para ver a altura media
            soma = soma + alturas[i];
        }
        double media = soma / N;
        System.out.printf("Altura media: %.2f%n",media);//aqui é altura media impressa

        int cont = 0;
        for(int i =0;i<N;i++){
            if(idades[i]< 16){
                cont = cont +1;//for para somar as idades
            }
        }
        double x = cont * 100 / N;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);//para imprimir a idade media
        sc.close();
    }
}
