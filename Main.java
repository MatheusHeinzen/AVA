import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Disciplina historia = new Disciplina("Historia", 8);
        Usuario usuario = null;

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
                    // Implementar lógica de login aqui
                    break;

                case 2:
                    // Criação de conta
                    System.out.println("1 - Professor");
                    System.out.println("2 - Aluno");
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
                            System.out.print("CPF: ");
                            String cpfProfessor = scanner.next();
                            System.out.print("Disciplina: ");
                            String disciplina = scanner.next();
                            Disciplina novaDisciplinaProfessor = new Disciplina(disciplina, 8);
                            usuario = new Professor(nomeProfessor, sobrenomeProfessor, idadeProfessor, emailProfessor, cpfProfessor, novaDisciplinaProfessor);
                            System.out.println("Bem-vindo");

                            // Opções do menu do professor
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
                                        System.out.print("Digite o CPF do estudante: ");
                                        String cpf = scanner.next();

                                        usuario.adicionarEstudante(nome, sobrenome, idade, email, cpf);
                                        break;

                                    case 2:
                                        // Listar alunos
                                        usuario.listarAlunos();
                                        break;

                                    case 3:
                                        // Sair
                                        System.out.println("Encerrando o programa.");
                                        return;

                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            }

                        case 2:
                            // Implementar lógica para criação de conta de aluno aqui
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
}
