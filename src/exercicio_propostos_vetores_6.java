import java.util.Scanner;

public class exercicio_propostos_vetores_6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[]nomes = new String[N];
    int [] idade = new int[N];

    for(int i=0;i<N;i++){
        nomes[i] = sc.next();
        idade[i] = sc.nextInt();
    }
    int maiorIdade = idade[0];
    int posicaoMaior = 0;

    for(int i =1; i<N; i++){
        if(idade[i] > maiorIdade){
            maiorIdade = idade[i];
            posicaoMaior = i;
        }
    }

        System.out.println("Pessoa mais velha: " + nomes[posicaoMaior]);

    sc.close();
}
}
