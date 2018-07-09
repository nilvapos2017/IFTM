package fastcom.model.facade.rs;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import fastcom.model.domain.Fornecedor;
@Path("/fornecedor")
@Produces({MediaType.APPLICATION_JSON},
		{MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
		
public class FornecedorFacade {
	static List<Fornecedor> fornecedors = new ArrayList<Fornecedor>();
	static {
		fornecedors.add(new Fornecedor (1,"Alpargatas"));
	}
	@GET
	public List<Fornecedor> getFornecedors() {
		return fornecedors;		
	}
	@POST
	public Fornecedor salvar(Fornecedor fornecedor) {
		fornecedors.add(fornecedor);
		fornecedor.setCodigo(777);
		return fornecedor;
		
	}
	@PUT
	public void atualizar(Fornecedor fornecedor ) {
		fornecedors.remove(fornecedor);
		fornecedors.add(fornecedor);
	}
	@DELETE
	@Path("/{codigoFornecedor}")
	public void excluir(@PathParam("codigoFornecedor") Integer codigoFornecedor) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCodigo(codigoFornecedor);
		fornecedors.remove(fornecedor);		
	}

}
