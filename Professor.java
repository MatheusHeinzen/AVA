import java.util.ArrayList;

public class Professor extends Usuario{
    private Disciplina disciplina;

    public Professor(String nome, String sobrenome, int idade, String email, String cpf, Disciplina disciplina) {
        super(nome, sobrenome, idade, email, cpf);
        this.disciplina = disciplina;
    }

    ArrayList listaEstudante = new ArrayList<Estudante>();

    public void adicionarEstudante (String nome, String sobrenome, int idade, String email, String cpf){
        Estudante novoEstudante = new Estudante(nome, sobrenome, idade, email, cpf);
        listaEstudante.add(novoEstudante);
        System.out.println("Estudante" + nome + "Adicionado com sucesso!");

    }
    // Método para exibir os alunos
    public void listarAlunos() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos:");
            for (Estudante aluno : estudantes) {
                System.out.println(aluno);
            }
        }
    }
}




