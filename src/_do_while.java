import java.util.Locale;
import java.util.Scanner;

public class _do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite a temperatura em celsius:");

        double c = sc.nextDouble();
        double f = 9.0 * c / 5.0 + 32.0;
        System.out.printf("Equivalente em fahrenheit : %.1f%n", f);
        System.out.println("Deseja repetir (s/n)?");
        char resp = sc.next().charAt(0);

        while (resp != 'n') {
            System.out.println("Digite a temperatura em celsius:");
            c = sc.nextDouble();
            f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit : %.1f%n", f);
            System.out.println("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        }

        sc.close();
    }
}
