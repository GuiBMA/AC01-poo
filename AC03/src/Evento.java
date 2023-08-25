public class Evento {
    String data, local, nome;
    int capacidade;
    Aluno alunos;

    Evento(String nome, String local, String data, int capacidade) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.capacidade = capacidade;
    }

    void addAluno(Aluno aluno) {
        this.alunos = aluno;
    }

    void mudarData(String novaData) {
        this.data = novaData;
    }
}