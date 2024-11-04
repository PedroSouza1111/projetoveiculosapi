package sistema.problemas.veiculo.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import sistema.problemas.veiculo.dao.UsuarioDAO;
import sistema.problemas.veiculo.model.usuarios.Usuario;

public class UsuarioBO {

	// inserir
	public void inserirBO(Usuario usuario) throws ClassNotFoundException, SQLException {

		UsuarioDAO veiculosDAO = new UsuarioDAO();

		veiculosDAO.inserir(usuario);
	}

	// atualizar
	public void atualizarBO(Usuario usuario) throws ClassNotFoundException, SQLException {

		UsuarioDAO veiculosDAO = new UsuarioDAO();

		veiculosDAO.atualizar(usuario);
	}

	// deletar
	public void deletarBO(int rm) throws ClassNotFoundException, SQLException {

		UsuarioDAO veiculosDAO = new UsuarioDAO();

		veiculosDAO.deletar(rm);
	}

	// selecionar
	public ArrayList<Usuario> selecionarBO() throws ClassNotFoundException, SQLException {

		UsuarioDAO veiculosDAO = new UsuarioDAO();
		return (ArrayList<Usuario>) veiculosDAO.selecionar();

	}

}
