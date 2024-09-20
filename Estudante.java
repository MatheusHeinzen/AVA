public class Estudante extends Usuario{
    private String curso;

    public Estudante(String nome, String sobrenome, int idade, String email, String cpf){
        super(nome, sobrenome, idade, email, cpf);
    }

    @Override
    public String toString() {
        return getNome()+ " " + getSobrenome();
    }
}




