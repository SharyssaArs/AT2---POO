package model;

public class Aluno extends Pessoa {
    public Aluno(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aluno: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
    }
}
