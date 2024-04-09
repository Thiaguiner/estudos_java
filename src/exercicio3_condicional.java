import java.util.Scanner;

public class exercicio3_condicional {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double a,b,c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a<b && a<c){
            System.out.println("Menor = " + a);
        } else if (b<a && b<c) {
            System.out.println("Menor =" + b);
        } else {
            System.out.println("MENOR =" + c);
        }
        sc.close();
    }
}
