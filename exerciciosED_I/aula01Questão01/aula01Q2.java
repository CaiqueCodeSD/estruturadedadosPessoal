import java.util.Scanner;

public class aula01Q2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {

            System.out.print("Valor da posição [" + i + "] -> ");
            num[i] = scanner.nextInt();

        }

        System.out.print("Insira um número: ");
        int x = scanner.nextInt();

        System.out.println("Múltiplos de x: ");

        for (int i = 0; i < num.length; i++) {
            if (x % num[i] == 0) {
                System.out.println(num[i]);
            }
        }

    }

}
