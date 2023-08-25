import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira sua matricula: ");
        int matricula = scanner.nextInt();
        System.out.print("Insira sua email: ");
        String email = scanner.nextLine();
        System.out.print("Insira seu curso: ");
        String curso = scanner.nextLine();

        Aluno a1;
        a1 = new Aluno(nome, email, curso, matricula);

        Evento e1;
        e1 = new Evento("e1", "ibmec", "15/02/23", 40);

        e1.addAluno(a1);

        scanner.close();
        System.out.println(a1);
        System.out.println(e1);

    }
}
