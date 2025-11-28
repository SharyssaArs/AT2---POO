package model;

public class AlunoHomem extends Aluno {
    public AlunoHomem(String nome, int idade, String cpf, Plano plano) {
        super(nome, idade, cpf, plano);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("--- Aluno (Masculino) ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Plano: " + getPlano().getNome());
        System.out.println("Treino Recomendado: Hipertrofia Superior"); // Comportamento específico
    }
}