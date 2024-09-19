import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Disciplina historia = new Disciplina(8);
        Usuario professor = new Professor("Jorge", "Amaral", 22, "jorgin@gmail.com", "173482465-98", historia);

        while (true) {
            System.out.println("1 - Adicionar novo aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
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

                    professor.adicionarEstudante(nome, sobrenome, idade, email, cpf);
                    break;
                case 2:
                    professor.listarAlunos();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
