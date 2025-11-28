import dao.AlunoDAO;
import model.*;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoDAO dao = new AlunoDAO();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n=== SISTEMA ACADEMIA ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Consultar Alunos");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                
                System.out.println("Sexo: 1-Masculino | 2-Feminino");
                int sexoOp = scanner.nextInt();
                
                // Escolha do Plano
                System.out.println("Plano: 1-Mensal | 2-Anual");
                int planoOp = scanner.nextInt();
                Plano plano = (planoOp == 1) ? Plano.MENSAL : Plano.ANUAL;

                Aluno novoAluno;
                if (sexoOp == 1) {
                    novoAluno = new AlunoHomem(nome, idade, cpf, plano);
                } else {
                    novoAluno = new AlunoMulher(nome, idade, cpf, plano);
                }
                
                dao.cadastrar(novoAluno);

            } else if (opcao == 2) {
                List<Aluno> alunos = dao.listar();
                System.out.println("\n--- LISTA DE ALUNOS ---");
                for (Aluno a : alunos) {
                    a.exibirInformacoes(); 
                    System.out.println("-----------------------");
                }
            }
        }
    }
}