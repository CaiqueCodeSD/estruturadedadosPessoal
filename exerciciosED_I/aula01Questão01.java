import java.util.Scanner;

public class aula01Questão01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[15];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Insira a nota do aluno "+ (i+1) +" -> ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = (double)soma / notas.length;


        System.out.println("Média das notas -> " + media);

    }

}
