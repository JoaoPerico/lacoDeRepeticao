import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nomesJogadore = new String[10];
        Scanner sc = new Scanner(System.in);

        // inicializaçao; condiçao; incremento
        // ++ -> vai somar +1 i = 1 +1
        /*for (int i = 0; i < 10; i++){
           System.out.println("Informe o nome do player " + i);
        nomesJogadore[i] = sc.next();
        }*/
        //pedir o nome do time A
        // pedir os nomes do time A
        // pedir o nome do time B
        // pedir os nomes do time B

        System.out.println("Informe o time A");
        String nomeTimeA = sc.next();

      String[] nomesJogadoresTimeA = new String[5];
      for (int i = 0; i < 5;i++){
          System.out.println("Informe o player " + i);
          nomesJogadoresTimeA[i] = sc.next();
      }
         System.out.println("Informe o time B");
         String nomeTimeB = sc.next();

      String[] nomesJogadoresTimeB = new String[5];
      for (int i = 0; i < 5;i++){
            System.out.println("Informe o player " + i);
            nomesJogadoresTimeB[i] = sc.next();

        }


    }
}