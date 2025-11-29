package model;

public class AlunoMulher extends Aluno {
    public AlunoMulher(String nome, int idade, String cpf, Plano plano) {
        super(nome, idade, cpf, plano);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("--- Aluna (Feminino) ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Plano: " + getPlano().getNome());
        System.out.println("Treino Recomendado: Definição e Membros Inferiores"); // Comportamento específico
    }
}