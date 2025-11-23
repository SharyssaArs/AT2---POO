package model;

public class Treino {
    private int id;
    private String nome;
    private String exercicios;

    public Treino(String nome, String exercicios) {
        this.nome = nome;
        this.exercicios = exercicios;
    }

    public String getNome() { return nome; }
    public String getExercicios() { return exercicios; }
}
