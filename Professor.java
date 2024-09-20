import java.util.ArrayList;

public class Professor extends Usuario{
    private Disciplina disciplina;
    private ArrayList<Estudante> listaEstudante = new ArrayList<Estudante>();

    public Professor(String nome, String sobrenome, int idade, String email, String cpf, Disciplina disciplina) {
        super(nome, sobrenome, idade, email, cpf);
        this.disciplina = disciplina;
    }

    @Override
    public void adicionarEstudante (String nome, String sobrenome, int idade, String email, String cpf){
        Estudante novoEstudante = new Estudante(nome, sobrenome, idade, email, cpf);
        listaEstudante.add(novoEstudante);
        System.out.println("Estudante " + nome + " adicionado com sucesso!");

    }
    // Metodo para exibir os alunos
    @Override
    public void listarAlunos() {
        if (listaEstudante.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos:");
            for (var aluno : listaEstudante) {
                System.out.println(aluno);
            }
        }
    }
}




