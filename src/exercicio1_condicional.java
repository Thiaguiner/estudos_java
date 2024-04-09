import java.util.Scanner;

public class exercicio1_condicional {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        double notaFinal = nota1 + nota2;

        if (notaFinal > 60.0){
            System.out.println("Parabens, você foi APROVADO " + notaFinal);
        }else{
            System.out.println("Você foi REPROVADO " + notaFinal);
        }

        sc.close();
    }
}
