package model;

public class Matricula {
    
    private Aluno aluno;
    private String dataMatricula;
    private Treino treino;
    private Plano plano;

    public Matricula(Aluno aluno, Treino treino, Plano plano, String dataMatricula) {
        this.aluno = aluno;
        this.treino = treino;
        this.plano = plano;
        this.dataMatricula = dataMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public Treino getTreino() {
        return treino;
    }

    public Plano getPlano() {
        return plano;
    }

    public void exibirResumo() {
        System.out.println("=== Resumo da Matricula ===");
        System.out.println("Data: " + dataMatricula);
        System.out.println("Aluno: " + aluno.getNome());
        
        if (plano != null) {
            System.out.println("Plano: " + plano.getNome());
            System.out.println("Valor: " + plano.getPreco());
        }
        
        if (treino != null) {
            System.out.println("Treino: " + treino.getNome());
            System.out.println("Exercicios: " + treino.getExercicios());
        }
        System.out.println("===========================");
    }
}