package sistema.problemas.veiculo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sistema.problemas.veiculo.conexoes.ConexaoFactory;
import sistema.problemas.veiculo.model.acoesUsuario.Orcamento;

public class OrcamentoDAO {

	public Connection minhaConexao;

	public OrcamentoDAO() throws ClassNotFoundException, SQLException {
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	// Método inserir()
	public void inserir(Orcamento orcamento) {
		String sql = "INSERT INTO tb_precos (id_orcamento, nome_peca, valor_peca) VALUES (sq_tb_orcamento.nextval, ?, ?)";

		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql, new String[] { "id_orcamento" });
			stmt.setString(1, orcamento.getNomePeca());
			stmt.setFloat(2, orcamento.getValorPeca());
			stmt.execute();
			ResultSet generatedKeys = stmt.getGeneratedKeys();
			generatedKeys.next();
			orcamento.setId(generatedKeys.getInt(1));
			stmt.close();

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
			PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM tb_precos WHERE ID_ORCAMENTO = ?");
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
	public void atualizar(Orcamento orcamento) {
		String sql = "UPDATE TB_PRECOS SET NOME_PECA = ?, VALOR_PECA = ? WHERE ID_ORCAMENTO = ?";

		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			stmt.setString(1, orcamento.getNomePeca());
			stmt.setFloat(2, orcamento.getValorPeca());
			stmt.setInt(4, orcamento.getId());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Select
	public List<Orcamento> selecionar() {
		try {
			List<Orcamento> listaOrcamentos = new ArrayList<Orcamento>();
			PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM tb_precos");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Orcamento orcamento = new Orcamento();
				orcamento.setId(rs.getInt(1));
				orcamento.setNomePeca(rs.getString(2));
				orcamento.setValorPeca(rs.getFloat(3));
				listaOrcamentos.add(orcamento);
			}
			return listaOrcamentos;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar todos os orçamentos!");
			return null;
		}
	}

}
