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
        System.out.println("Estudante " + nome + " adicionado com sucesso!");

    }
    // Metodo para exibir os alunos
    public void listarAlunos() {
        if (listaEstudante.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos:");
            for (Object aluno : listaEstudante) {
                System.out.println(aluno);
            }
        }
    }
}




