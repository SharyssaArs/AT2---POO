package model;

public abstract class Aluno extends Pessoa {
    private Plano plano;

    public Aluno(String nome, int idade, String cpf, Plano plano) {
        super(nome, idade, cpf); //
        this.plano = plano;
    }

    public Plano getPlano() { return plano; }
    public void setPlano(Plano plano) { this.plano = plano; }

    @Override
    public abstract void exibirInformacoes();
}