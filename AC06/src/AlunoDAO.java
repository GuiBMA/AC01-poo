import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AlunoDAO {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String matricula) {
        Aluno aluno = new Aluno(matricula, "", "");
        alunos.remove(aluno);
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public ArrayList<Aluno> listarAlunos() {
        return alunos;
    }

    public void carregarDados(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    Aluno aluno = new Aluno(partes[0].trim(), partes[1].trim(), partes[2].trim());
                    adicionarAluno(aluno);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados do arquivo.");
        }
    }

    public void salvarDados(String arquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Aluno aluno : alunos) {
                String linha = aluno.getMatricula() + ", " + aluno.getNome() + ", " + aluno.getCurso();
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados no arquivo.");
        }
    }
}