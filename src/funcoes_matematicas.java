public class funcoes_matematicas {

    public static void main (String[] args){
        double x = 3.0;
        double y = 4.0;
        double z = -5;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrade de " + x + " = " + A);
        System.out.println("Raiz quadrade de " + y + " = " + B);
        System.out.println("Raiz quadrade de 25.0 " + " = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println(" 5 elevado ao quadrado = "  + C);

    }
}
