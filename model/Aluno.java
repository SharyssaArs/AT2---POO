package model;

public class Aluno extends Pessoa {
    private Plano plano;

    public Aluno(String nome, String cpf, Integer idade, Plano plano) {
        super(nome, cpf, idade);
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Plano: " + plano.getNome());
    }
}
