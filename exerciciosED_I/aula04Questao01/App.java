import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    static String nome;
    static int idade;
    static int contPessoa = 0;
    static Pessoa[] listaPessoa = new Pessoa[5];

    static App app = new App();

    public static void main(String[] args) {

        for (int i = 0; i < listaPessoa.length; i++) {
            System.out.print("Nome: ");
            nome = scanner.next();
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            Pessoa p = new Pessoa(nome, idade);

            listaPessoa[contPessoa] = p;
            contPessoa++;
        }

        for (int i = 0; i < listaPessoa.length; i++) {
            System.out.println(listaPessoa[i]);
        }


        app.ordenarIdades();
        app.ordenarNomes();
    }

    public void ordenarIdades() {
        for (int i = 0; i < listaPessoa.length - 1; i++) {
            for (int j = i + 1; j < listaPessoa.length; j++) {
                if (listaPessoa[i].idade > listaPessoa[j].idade) {
                    int temp = listaPessoa[i].idade;
                    listaPessoa[i].idade = listaPessoa[j].idade;
                    listaPessoa[j].idade = temp;
                }
            }
        }
        for (int i = 0; i < listaPessoa.length; i++) {
            System.out.println(listaPessoa[i].idade);
        }
    }

    public void ordenarNomes() {
        for (int i = 0; i < listaPessoa.length - 1; i++) {
            for (int j = i + 1; j < listaPessoa.length; j++) {
                if (listaPessoa[i].nome.compareToIgnoreCase(listaPessoa[j].nome) > 0) {
                    String temp = listaPessoa[i].nome;
                    listaPessoa[i].nome = listaPessoa[j].nome;
                    listaPessoa[j].nome = temp;
                }
            }
        }
        for (int i = 0; i < listaPessoa.length; i++) {
            System.out.println(listaPessoa[i].nome);
        }
    }

}
