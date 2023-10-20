import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }
    ArrayList<Aluno> alunos = new ArrayList<>();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void criar(Aluno aluno) {
        alunos.add(aluno);
    }
    public void ler(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula == matricula) {
                System.out.println(aluno);
            }
        }
    }
    public void lerTodos() {
        System.out.println(alunos);
    }

    public void atualizar(String matricula, String novoCurso) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula == matricula) {
                aluno.curso = novoCurso;
            }
        }
    }

    public void deletar(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula == matricula) {
                alunos.remove(aluno);
            }
        }
    }
}
