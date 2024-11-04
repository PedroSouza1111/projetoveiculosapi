package sistema.problemas.veiculo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import sistema.problemas.veiculo.conexoes.ConexaoFactory;
import sistema.problemas.veiculo.model.acoesUsuario.Diagnostico;

public class DiagnosticoDAO {

	public Connection minhaConexao;

	public DiagnosticoDAO() throws ClassNotFoundException, SQLException {
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	// Método inserir()
	public void inserir(Diagnostico diagnostico) {
		String sql = "INSERT INTO tb_diag (id_diagnostico, descricao_problema, data_diagnostico) VALUES (sq_tb_diag.nextval, ?, ?)";

		try (PreparedStatement stmt = minhaConexao.prepareStatement(sql, new String[] { "id_diagnostico" })) {
			stmt.setString(1, diagnostico.getDescricaoProblema());
			stmt.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
			stmt.execute();
			try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
				generatedKeys.next();
				diagnostico.setId(generatedKeys.getInt(1));
			}

		} catch (SQLException e) {
			if (minhaConexao == null) {
				System.err.println("Conexão nula!");
			}
			e.printStackTrace();
		}
	}

	// Delete
	public String deletar(int id) {
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM tb_diag WHERE ID_DIAGNOSTICO = ?");
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
			return "Deletado com Sucesso!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro ao deletar!";
		}
	}

	// Update
	public void atualizar(Diagnostico diagnostico) {
		String sql = "UPDATE TB_DIAG SET DESCRICAO_PROBLEMA = ?, DATA_DIAGNOSTICO = ? WHERE ID_DIAGNOSTICO = ?";

		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			stmt.setString(1, diagnostico.getDescricaoProblema());
			stmt.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
			stmt.setInt(3, diagnostico.getId());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Select
	public List<Diagnostico> selecionar() {
		try {
			List<Diagnostico> listaDiagnosticos = new ArrayList<Diagnostico>();
			PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM tb_diag");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Diagnostico diagnostico = new Diagnostico();
				diagnostico.setId(rs.getInt(1));
				diagnostico.setDescricaoProblema(rs.getString(2));
				diagnostico.setDataDiagnostico(rs.getTimestamp(3).toLocalDateTime());
				listaDiagnosticos.add(diagnostico);
			}
			return listaDiagnosticos;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar todos os diagnósticos!");
			return null;
		}
	}

}
