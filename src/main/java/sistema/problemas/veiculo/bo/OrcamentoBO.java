package sistema.problemas.veiculo.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import sistema.problemas.veiculo.dao.OrcamentoDAO;
import sistema.problemas.veiculo.model.acoesUsuario.Orcamento;

public class OrcamentoBO {

	// inserir
	public void inserirBO(Orcamento orcamento) throws ClassNotFoundException, SQLException {

		OrcamentoDAO orcamentoDAO = new OrcamentoDAO();

		orcamentoDAO.inserir(orcamento);
	}

	// atualizar
	public void atualizarBO(Orcamento orcamento) throws ClassNotFoundException, SQLException {

		OrcamentoDAO orcamentoDAO = new OrcamentoDAO();

		orcamentoDAO.atualizar(orcamento);
	}

	// deletar
	public void deletarBO(int id) throws ClassNotFoundException, SQLException {

		OrcamentoDAO orcamentoDAO = new OrcamentoDAO();

		orcamentoDAO.deletar(id);
	}

	// selecionar
	public ArrayList<Orcamento> selecionarBO() throws ClassNotFoundException, SQLException {

		OrcamentoDAO orcamentoDAO = new OrcamentoDAO();
		return (ArrayList<Orcamento>) orcamentoDAO.selecionar();

	}

}
