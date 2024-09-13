public class Professor extends Usuario{
    private Disciplina disciplina;

    public Professor(String nome, String sobrenome, int idade, String email, String cpf, Disciplina disciplina){
        super(nome, sobrenome, idade, email, cpf);
        this.disciplina = disciplina;
    }
}
