public class Estudante extends Usuario{
    private String curso;

    public Estudante(String nome, String sobrenome, int idade, String email, String cpf, String curso){
        super(nome, sobrenome, idade, email, cpf);
        this.curso = curso;
    }
}
