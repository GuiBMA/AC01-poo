// Nome: Guilherme Barros de Melo Almieda
// Nome: Joao Victor Guimaraes Campelo

public class App {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("123", "Gui", "CD");
        Aluno aluno02 = new Aluno("456", "Wololo", "CD");
        Aluno aluno03 = new Aluno("789", "Labija", "CD");
        aluno01.criar(aluno01);
        aluno02.criar(aluno02);
        aluno03.criar(aluno03);
        aluno01.ler("123");
        aluno01.lerTodos();
        aluno01.atualizar("123", "RI");
        aluno01.lerTodos();
        aluno01.deletar("123");
        aluno01.lerTodos();
    }
}