public class Usuario {
    private String nome;
    private String sobrenome;
    private int idade;
    private String email;
    private String cpf;

    public Usuario(String nome, String sobrenome, int idade, String email, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarEstudante(String nome, String sobrenome, int idade, String email, String cpf) {
    }

    public void listarAlunos() {

    }
}