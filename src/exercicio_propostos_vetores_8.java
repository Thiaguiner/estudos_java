import java.util.Scanner;
public class exercicio_propostos_vetores_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] altura = new double[N];
        char[] sexo = new char[N];

        for (int i = 0; i < N; i++) {//lendo os dados que ele pede
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        //calculando a menor do grupo
        double menorDoGrupo = altura[0];
        for (int i = 1; i < N; i++) {
            if (altura[i] < menorDoGrupo) {
                menorDoGrupo = altura[i];
            }
        }
        System.out.println("Menor altura: " + menorDoGrupo);

        //calculando a maior do grupo
        double maiorDoGrupo = altura[0];
        for (int i = 1; i < N; i++) {
            if (altura[i] > maiorDoGrupo) {
                maiorDoGrupo = altura[i];
            }
        }
        System.out.println("A maior do grupo é igual a: " + maiorDoGrupo);

        //altura media das mulheres e contagem de mulheres
        double somaDasMulheres = 0;
        int contMulheres = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'F') {
                somaDasMulheres += altura[i];
                contMulheres++;
            }
        }
        if (contMulheres == 0) {
            System.out.println("Não há nenhuma mulher no local!");
        } else {
            double media = somaDasMulheres / contMulheres;
            System.out.println("media das alturas das mulheres é de: " + media);
        }

        //numero de homens presente no local
        int contHomens = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'M') {
                contHomens++;
            }
        }
        System.out.println("A quantidade de homens presente é de: " + contHomens);
        sc.close();
    }
}
