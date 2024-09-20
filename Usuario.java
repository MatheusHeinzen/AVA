public abstract class Usuario {
    private String nome;
    private String sobrenome;
    private int idade;
    private String email;
    private String cpf;
    private String senha;

    public Usuario(String nome, String sobrenome, int idade, String email, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.senha = "Bem-vindo"+cpf.substring(0,3);
    }
    public Usuario(String nome, String sobrenome, int idade, String email, String cpf, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void adicionarEstudante(String nome, String sobrenome, int idade, String email, String cpf) {
    }

    public void listarAlunos() {

    }

    public void getEstudantes(){

    }
}