import java.util.Locale;

public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        System.out.println("Ola mundo");
        System.out.println("segundo código");
        //println ele quebra a linha
        //somente o print ele não quebra a linha

        int y = 32;
        System.out.println(y);
        //declarando um inteiro e saindo o resultado

        //declarando um numero quebrado
        double x = 10.312323;
        System.out.println(x);

        //agora para limitar as casa decimais e ele arredonda os números
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        //para colocar . ao inves de , tem que colocar a "localização" do eua
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        //para concatenar varios elementos
        System.out.println("Resultado = " + x + " metros");

        //para concatenar varios elementos usando casas decimais
        System.out.printf("Resultado = %.2f metros%n", x);

        //para concatenar varios elementos no mesmo comando de escrita
        String nome = "Maria";
        int idade = 31;
        double renda = 4000;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        //%f = ponto flutuante(numero)
        //%d = inteiro
        //%s = texto(string)
        //%n = quebra de linha

        String product1 = "Computer";
        String product2 = "Oficce desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.printf("Products:%n %s, which price is $ %.2f%n %s, which price is $ %.2f%n Record: %d years old, " +
                "code %d and%n Measure with eight decimal places: %f%n Rouded (three decimal places) : %.3f%n US " +
                "decimal point: %.3f",product1, price1, product2, price2, age, code, measure, measure, measure);


    }
}
