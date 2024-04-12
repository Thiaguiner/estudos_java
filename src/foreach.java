import java.util.Scanner;

public class foreach {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String [] nomes = new String[N];
        for(int i = 0; i< N; i++){
            nomes[i]= sc.next();
        }
        System.out.println("nomes lidos");
        for (String s : nomes){
            System.out.println(s);
        }
        //esse exemplo abaixo é a mesma coisa do que fiz ai com o String s
        //for(int i =0;i<N; i++){
        //            System.out.println(nomes[i]);
        //        }

        sc.close();
    }
}
