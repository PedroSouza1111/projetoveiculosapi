package sistema.problemas.veiculo.resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.modelmapper.ModelMapper;

import sistema.problemas.veiculo.bo.OrcamentoBO;
import sistema.problemas.veiculo.dto.OrcamentoDTO;
import sistema.problemas.veiculo.model.acoesUsuario.Orcamento;

@Path("/orcamento")
public class OrcamentoResource {

	private OrcamentoBO orcamentoBO = new OrcamentoBO();

	private ModelMapper modelMapper = new ModelMapper();

	// inserir (POST)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs(OrcamentoDTO orcamentoDTO, @Context UriInfo uriInfo)
			throws ClassNotFoundException, SQLException {
		Orcamento orcamento = modelMapper.map(orcamentoDTO, Orcamento.class);
		orcamentoBO.inserirBO(orcamento);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder(); // recebe a informação do front (página)
		builder.path(Integer.toString(orcamento.getId()));
		return Response.created(builder.build()).build();
	}

	// atualizar (PUT)
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(Orcamento orcamento, @PathParam("id") int id)
			throws ClassNotFoundException, SQLException {
		orcamentoBO.atualizarBO(orcamento);
		return Response.ok().build();
	}

	// deletar (DELETE)
	@DELETE
	@Path("/{id}")
	public Response deletaRs(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		orcamentoBO.deletarBO(id);
		return Response.ok().build();
	}

	// consultar (GET)
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Orcamento> selecionaRs() throws ClassNotFoundException, SQLException {
		return (ArrayList<Orcamento>) orcamentoBO.selecionarBO();
	}
}
