import java.util.Scanner;

public class aula01Q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[6];
        int somaPares = 0;
        int quantImpares = 0;

        for (int i = 0; i < num.length; i++) {

            System.out.print("Digite algum número -> ");
            num[i] = scanner.nextInt();

            if (num[i] % 2 == 0) {
                somaPares += num[i];
            } else {
                quantImpares++;
            }

        }

        System.out.print("Números pares digitados -> ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + "\t");
            }
        }

        System.out.println("Soma dos pares -> " + somaPares);

        System.out.print("Números ímpares digitados -> ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + "\t");
            }
        }

        System.out.println("Quantidade ímpares -> " + quantImpares);

    }

}
