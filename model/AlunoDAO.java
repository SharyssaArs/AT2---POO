package dao;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    
    public void cadastrar(Aluno aluno) {
        String sql = "INSERT INTO alunos (nome, idade, cpf, plano, sexo) VALUES (?, ?, ?, ?, ?)";
        String sexo = (aluno instanceof AlunoHomem) ? "M" : "F";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getCpf());
            stmt.setString(4, aluno.getPlano().getNome());
            stmt.setString(5, sexo);
            
            stmt.execute();
            System.out.println(">> Cadastrado com sucesso no Banco de Dados!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> listar() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alunos";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String cpf = rs.getString("cpf");
                String nomePlano = rs.getString("plano");
                String sexo = rs.getString("sexo");

                // Recria o Plano (simplificado)
                Plano p = new Plano(nomePlano, 0); // Preço 0 pois vem do banco só o nome

                Aluno a;
                // POLIMORFISMO na prática: instanciamos a classe correta
                if (sexo.equals("M")) {
                    a = new AlunoHomem(nome, idade, cpf, p);
                } else {
                    a = new AlunoMulher(nome, idade, cpf, p);
                }
                lista.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}