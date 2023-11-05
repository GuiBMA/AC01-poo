// Nome: Guilherme Barros de Melo Almieda

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.carregarDados("alunos.txt");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Listar alunos");
            System.out.println("(2) Adicionar aluno");
            System.out.println("(3) Remover aluno");
            System.out.println("(4) Buscar aluno");
            System.out.println("(5) Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    ArrayList<Aluno> alunos = alunoDAO.listarAlunos();
                    for (Aluno aluno : alunos) {
                        System.out.println(aluno);
                    }
                    break;

                case 2:
                    System.out.println("Digite a matrícula do aluno:");
                    String matricula = scanner.nextLine();
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o curso do aluno:");
                    String curso = scanner.nextLine();
                    Aluno novoAluno = new Aluno(matricula, nome, curso);
                    alunoDAO.adicionarAluno(novoAluno);
                    break;

                case 3:
                    System.out.println("Digite a matrícula do aluno a ser removido:");
                    String matriculaRemover = scanner.nextLine();
                    alunoDAO.removerAluno(matriculaRemover);
                    break;

                case 4:
                    System.out.println("Digite a matrícula do aluno a ser buscado:");
                    String matriculaBuscar = scanner.nextLine();
                    Aluno alunoEncontrado = alunoDAO.buscarAluno(matriculaBuscar);
                    if (alunoEncontrado != null) {
                        System.out.println("Aluno encontrado: " + alunoEncontrado);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 5:
                    alunoDAO.salvarDados("alunos.txt");
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}