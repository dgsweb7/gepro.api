package br.com.gepro.services;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import org.apache.log4j.Logger;
import com.google.gson.Gson;
import br.com.gepro.business.CompanyBoImpl;
import br.com.gepro.entity.CompanyEntity;


@Provider
@Path("/company")
public class CompanyService {

	Gson gson = new Gson();
	CompanyBoImpl companyBo = new CompanyBoImpl();
	final static Logger logger = Logger.getLogger(CompanyService.class);

	public CompanyService() {
		
	}

	@GET
	@Path("/")
	@Produces("application/json;charset=utf-8")
	public Response getAll() {
		String json = gson.toJson(companyBo.selectAll());
		return Response.status(200).entity(json).build();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json;charset=utf-8")
	public Response getById(@PathParam("id") String id) {
		String json = gson.toJson(companyBo.selectById(id));
		return Response.status(200).entity(json).build();
	}

	@POST
	@Path("/")
	@Produces("application/json;charset=utf-8")
	public Response insert(CompanyEntity event) {
		String json = gson.toJson(companyBo.insert(event));
		return Response.status(201).entity(json).build();
	}

	@PUT
	@Path("/")
	@Produces("application/json;charset=utf-8")
	public Response update(CompanyEntity event) {
		String json = gson.toJson(companyBo.update(event));
		return Response.status(200).entity(json).build();
	}	
	
	@DELETE
	@Path("/{id}")
	@Produces("application/json;charset=utf-8")
	public Response delete(@PathParam("id") String id) {
		String json = gson.toJson(companyBo.delete(id));
		return Response.status(200).entity(json).build();
	}

		
}
