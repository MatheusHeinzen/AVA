import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>(); // Lista para armazenar os usuários cadastrados
        Usuario usuarioLogado = null;

        while (true) {
            // Mensagem de boas-vindas e opções de conta
            System.out.println("Bem-vindo ao AVA");
            System.out.println("Já possui conta?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Login
                    System.out.println("Digite seu email: ");
                    String loginEmail = scanner.next();
                    System.out.println("Digite sua senha: ");
                    String loginSenha = scanner.next();

                    usuarioLogado = realizarLogin(usuarios, loginEmail, loginSenha);
                    if (usuarioLogado != null) {
                        System.out.println("Login bem-sucedido! Bem-vindo, " + usuarioLogado.getNome());
                        if (usuarioLogado instanceof Professor) {
                            menuProfessor((Professor) usuarioLogado, scanner);
                        } else {
                            System.out.println("Bem-vindo Aluno.");
                            // Implementar funcionalidades para aluno
                        }
                    } else {
                        System.out.println("Email ou senha inválidos.");
                    }
                    break;

                case 2:
                    // Criação de conta
                    System.out.println("Caso seja aluno, entre em contato com o seu professor para que ele te cadastre.");
                    System.out.println("1 - Sou professor");
                    System.out.println("2 - Voltar");
                    int escolha = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha pendente

                    switch (escolha) {
                        case 1:
                            // Registro de professor
                            System.out.print("Nome: ");
                            String nomeProfessor = scanner.nextLine();
                            System.out.print("Sobrenome: ");
                            String sobrenomeProfessor = scanner.nextLine();
                            System.out.print("Idade: ");
                            int idadeProfessor = scanner.nextInt();
                            System.out.print("Email: ");
                            String emailProfessor = scanner.next();
                            if (emailJaCadastrado(usuarios, emailProfessor)) {
                                System.out.println("Este email já está cadastrado.");
                                break;
                            }
                            System.out.print("CPF: ");
                            String cpfProfessor = scanner.next();
                            System.out.print("Digite uma senha: ");
                            String senhaProfessor = scanner.next();
                            System.out.print("Disciplina: ");
                            String disciplina = scanner.next();
                            Disciplina novaDisciplinaProfessor = new Disciplina(disciplina, 8);

                            Usuario usuario = new Professor(nomeProfessor, sobrenomeProfessor, idadeProfessor, emailProfessor, cpfProfessor, senhaProfessor, novaDisciplinaProfessor);
                            usuarios.add(usuario); // Adiciona o professor na lista de usuários
                            System.out.println("Bem-vindo " + usuario.getNome());

                            // Chama o menu do professor
                            menuProfessor(usuario, scanner);
                            break;
                        case 2:
                            // Voltar ao menu inicial
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // Função para verificar se o email já está cadastrado
    public static boolean emailJaCadastrado(List<Usuario> usuarios, String email) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    // Função para realizar o login
    public static Usuario realizarLogin(List<Usuario> usuarios, String email, String senha) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }

    // Função que exibe o menu do professor
    public static void menuProfessor(Professor professor, Scanner scanner) {
        while (true) {
            System.out.println("1 - Adicionar novo aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int menuProfessor = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente

            switch (menuProfessor) {
                case 1:
                    // Adicionar aluno
                    System.out.print("Nome do estudante: ");
                    String nome = scanner.nextLine();
                    System.out.print("Sobrenome: ");
                    String sobrenome = scanner.nextLine();
                    System.out.print("Idade do estudante: ");
                    int idade = scanner.nextInt();
                    System.out.print("Email do estudante: ");
                    String email = scanner.next();
                    if (emailJaCadastrado(usuario.getEstudantes(), email)) {
                        System.out.println("Este email já está cadastrado para um aluno.");
                        break;
                    }
                    System.out.print("Digite o CPF do estudante: ");
                    String cpf = scanner.next();

                    professor.adicionarEstudante(nome, sobrenome, idade, email, cpf);
                    break;

                case 2:
                    // Listar alunos
                    professor.listarAlunos();
                    break;

                case 3:
                    // Sair
                    System.out.println("Encerrando o menu do professor.");
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
