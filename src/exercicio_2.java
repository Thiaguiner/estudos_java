import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();


        System.out.println("AREA = " + (base *altura));
        System.out.println("PERIMETRO = " + (2 * base + 2 * altura));
        System.out.println("DIAGONAL = " + Math.sqrt(base * base + altura * altura));
        sc.close();

    }

}
