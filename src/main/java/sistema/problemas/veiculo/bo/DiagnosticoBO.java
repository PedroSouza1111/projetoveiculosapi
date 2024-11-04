package sistema.problemas.veiculo.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import sistema.problemas.veiculo.dao.DiagnosticoDAO;
import sistema.problemas.veiculo.model.acoesUsuario.Diagnostico;

public class DiagnosticoBO {

	// inserir
	public void inserirBO(Diagnostico diagnostico) throws ClassNotFoundException, SQLException {

		DiagnosticoDAO diagnosticoDAO = new DiagnosticoDAO();

		diagnosticoDAO.inserir(diagnostico);
	}

	// atualizar
	public void atualizarBO(Diagnostico diagnostico) throws ClassNotFoundException, SQLException {

		DiagnosticoDAO diagnosticoDAO = new DiagnosticoDAO();

		diagnosticoDAO.atualizar(diagnostico);
	}

	// deletar
	public void deletarBO(int id) throws ClassNotFoundException, SQLException {

		DiagnosticoDAO diagnosticoDAO = new DiagnosticoDAO();

		diagnosticoDAO.deletar(id);
	}

	// selecionar
	public ArrayList<Diagnostico> selecionarBO() throws ClassNotFoundException, SQLException {

		DiagnosticoDAO diagnosticoDAO = new DiagnosticoDAO();
		return (ArrayList<Diagnostico>) diagnosticoDAO.selecionar();

	}

}
