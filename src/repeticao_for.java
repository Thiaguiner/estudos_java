import java.util.Scanner;

public class repeticao_for {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

       int  soma = 0;

        for (int i = 0; i < 5; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
    }
}
