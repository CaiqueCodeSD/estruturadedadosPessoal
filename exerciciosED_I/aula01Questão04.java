import java.util.Scanner;

public class aula01Questão04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vet01 = new int[10];
        int[] vet02 = new int[10];
        int[] vet03 = new int[vet01.length * 2];

        //1
        for (int i = 0; i < vet01.length; i++) {
            System.out.print("(1) Valor da posição [" + i + "] -> ");
            vet01[i] = scanner.nextInt();
            vet03[i] = vet01[i];
        }

        //2
        for (int i = 0; i < vet02.length; i++) {
            System.out.print("(2) Valor da posição [" + i + "] -> ");
            vet02[i] = scanner.nextInt();
            vet03[vet02.length + i] = vet02[i];
        }

        for (int i = 0; i < vet03.length; i++) {
            System.out.print(vet03[i] + "\t");
        }

    }

}
