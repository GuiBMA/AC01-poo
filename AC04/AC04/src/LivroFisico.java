public class LivroFisico extends Livro{
    boolean emprestado;

    public LivroFisico(String titulo, String autor) {
        super(titulo, autor);
        this.emprestado = false;
    }

    public void emprestar() {
        if (this.reservado) {
            System.out.println("Livro foi emprestado!");
        } else {
            System.out.println("O livro precisa ser reservado primeiro.");
        }
        this.emprestado = true;
    }

    public void devolver() {
        if (this.emprestado) {
            System.out.println("Livro foi devolvido!");
            this.emprestado = false;
        } else {
            System.out.println("Livro deve ser emprestado para ser devolvido");
        }
    }
}
