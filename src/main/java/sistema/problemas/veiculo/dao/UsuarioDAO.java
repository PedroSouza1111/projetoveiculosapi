package sistema.problemas.veiculo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import sistema.problemas.veiculo.conexoes.ConexaoFactory;
import sistema.problemas.veiculo.model.usuarios.Usuario;

public class UsuarioDAO{
	public Connection minhaConexao;

	public UsuarioDAO() throws SQLException, ClassNotFoundException {

		this.minhaConexao = new ConexaoFactory().conexao();

		System.out.println("Conectado!");
	}

	// Método inserir()
	public void inserir(Usuario usuario) {
		String sql = "INSERT INTO tb_cliente (endereco_cliente, nome_cliente, email, telefone_cliente, cpf_cliente) VALUES (?, ?, ?, ?, ?)";

		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(sql);
			stmt.setString(1, usuario.getEndereco());
			stmt.setString(2, usuario.getNomeUsuario());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getTelefone());
			stmt.setString(5, usuario.getCpf());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			if (minhaConexao == null) {
				System.err.println("Conexão nula!");
			}
			e.printStackTrace();
		}
	}

	// Delete
	public String deletar(int rm) {
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM tb_cliente WHERE RM = ?");
			stmt.setInt(1, rm);
			stmt.execute();
			stmt.close();
			return "Deletado com Sucesso!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro ao deletar!";
		}
	}

	// UpDate
	public String atualizar(Usuario usuario) {
		try {
			PreparedStatement stmt = minhaConexao.prepareStatement(
					"UPDATE TB_CLIENTE SET NOME_CLIENTE = ?, CPF_CLIENTE = ?, EMAIL = ?, ENDERECO_CLIENTE = ?, TELEFONE_CLIENTE = ? WHERE ID_CLIENTE = ?");
			stmt.setString(1, usuario.getNomeUsuario());
			stmt.setString(2, usuario.getCpf());
			stmt.setString(3, usuario.getEmail());
			stmt.setString(4, usuario.getEndereco());
			stmt.setString(5, usuario.getTelefone());
			stmt.setInt(6, usuario.getId());
			stmt.executeUpdate();
			stmt.close();
			return "Atualizado com Sucesso!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro ao atualizar!";
		}
	}

	// Select
	public List<Usuario> selecionar(){
		try {
			List<Usuario> listaClientes = new ArrayList<Usuario>();
			PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM tb_cliente");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt(1));
				usuario.setEndereco(rs.getString(2));
				usuario.setNomeUsuario(rs.getString(3));
				usuario.setEmail(rs.getString(4));
				usuario.setTelefone(rs.getString(5));
				usuario.setCpf(rs.getString(6));
				listaClientes.add(usuario);
			}
			return listaClientes;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar todos os clientes!");
			return null;
		}
	}

}
